package com.lhfspcl2.test.pcl2uniresttest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class lhfsloccBranchIdsHttpresponseTest {

    public static void main(String[] args) throws UnirestException {

        //creating request for lhfslocc - list of branchs by IDs
        HttpResponse<String> response = Unirest.get("https://lhfslocc.lhfs.com/uat/branch/ccids/5100,5104")
                .header("Authorization", "Basic bGzpwd2QyM2QyMMDE3")
                .header("Cache-Control", "no-cache")
                //.header("Postman-Token", "08192443-f347-423c-a24e-4aa8a01664f6")
                .asString();

    }

}
