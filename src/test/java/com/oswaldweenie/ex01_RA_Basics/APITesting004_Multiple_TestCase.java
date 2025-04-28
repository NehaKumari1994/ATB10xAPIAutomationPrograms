package com.oswaldweenie.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting004_Multiple_TestCase {
    public static void main(String[] args) {

        //To manage multiple testcase , use TestNG

        String pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
