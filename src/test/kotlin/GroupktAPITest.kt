package tests

import io.restassured.RestAssured
import net.serenitybdd.junit.runners.SerenityRunner
import org.junit.Test

import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.equalTo
import org.junit.Before
import org.junit.runner.RunWith

const val ROOT_API_URL = "https://rahulshettyacademy.com"
const val ROOT_API_URL_1 = "https://pgu-uat2-fed.test.gosuslugi.ru"

@RunWith(SerenityRunner::class)
class CountriesSearchTests {
    //var acc_t = ""
    //@Before
    //fun cookie(){
       // acc_t = "test"
    //}
    @Test
    fun verifyLocation() {
        RestAssured.`when`().get("$ROOT_API_URL/maps/api/place/get/json?key=qaclick123&place_id=9c2b8d4c11805ef0885644bc1093cbf6")
            .then().assertThat().statusCode(200)
            .and().body("location.latitude", equalTo("-38.383494"))
            .and().body("location.longitude", equalTo("33.427362"))
            .and().body("accuracy", equalTo("50"))
            .and().body("name", equalTo("Frontline house"))
            .and().body("phone_number", equalTo("(+91) 983 893 3937"))
            .and().body("address", equalTo("29, side layout, cohen 09"))
            .and().body("types", equalTo("shoe park,shop"))
            .and().body("website", equalTo("http://google.com"))
            .and().body("language", equalTo("French-IN"))
            }

    @Test
    fun EPGURest() {
        RestAssured.`when`().get("$ROOT_API_URL_1/api/covid-cert/v1/users/current/data")
            .then().assertThat().statusCode(401)
    }

    @Test
    fun EPGURest1() {
        RestAssured.`when`().get("$ROOT_API_URL_1/api/covid-cert/v3/cert/status/bfad7831-6c17-4c35-9779-623dd29edbd1")
            .then().assertThat().statusCode(200)
            //.and().body("certId", equalTo("1000000006066472"))
            //.and().body("location.longitude", equalTo("33.427362"))
            //.and().body("accuracy", equalTo("50"))
            //.and().body("name", equalTo("Frontline house"))
            //.and().body("phone_number", equalTo("(+91) 983 893 3937"))
            //.and().body("address", equalTo("29, side layout, cohen 09"))
           // .and().body("types", equalTo("shoe park,shop"))
           // .and().body("website", equalTo("http://google.com"))
           // .and().body("language", equalTo("French-IN"))
    }
}