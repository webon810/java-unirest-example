package com.lhfspcl2.test.pcl2uniresttest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class pcl2httprequest001test {

    public static void main(String[] args) throws UnirestException {

        //the session need to be created first - enable to parse the data by this method - 03/01/18
        //creating request
        HttpResponse<String> response = Unirest.get("https://price.pclender.com/landhome/get_loan_detail?SessionID=8496DCBCCA&Nonce=2215851338&LoanNumberId=338073&PrettyPrint=true")
                .header("Cache-Control", "no-cache")
                //.header("Postman-Token", "7d434614-7e5b-43c6-b945-6480ce3206d2")
                .asString();

    }

}
