package com.oswaldweenie.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {
        // Given() -> Pre Req. - URL, Headers, Auth, Body....
// When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
// Then() -> Validation -> 200 oK, firstname == PRAMOD

        RestAssured.
                given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/560010")
                .when()
                   .get()
                .then()
                   .log().all().statusCode(200);

    }
}
