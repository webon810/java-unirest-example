package com.lhfspcl2.test.pcl2uniresttest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class lhfsloccCcurlHttpresponseTest {

    public static void main(String[] args) throws UnirestException {

        //creating request for lhfslocc - branch as sanjose
        HttpResponse<String> response = Unirest.get("https://lhfslocc.lhfs.com/uat/branchurl/ccurl/sanjose")
                .header("Authorization", "Basic bGzpwd2QyM2QyMMDE3")
                .header("Cache-Control", "no-cache")
                //.header("Postman-Token", "57de46bd-125a-453f-a7d9-9d1edfa864b4")
                .asString();

    }

}
