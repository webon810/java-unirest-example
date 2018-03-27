package com.lhfspcl2.test.pcl2uniresttest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class lhfsloccProgramlookupHttpresponseTest {

    public static void main(String[] args) throws UnirestException {

        HttpResponse<String> response = Unirest.get("https://lhfslocc.lhfs.com/uat/lhfsprogramlookup/id/100018/LastName/Pel/SSN4/5480")
                .header("Authorization", "Basic bGzpwd2QyM2QyMMDE3")
                .header("Cache-Control", "no-cache")
                //.header("Postman-Token", "ba7d657d-ab6d-4bdd-b156-8a267f80b63d")
                .asString();

    }



}
