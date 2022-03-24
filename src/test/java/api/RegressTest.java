package api;

import io.restassured.RestAssured;
import io.restassured.http.Cookies;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import pojos.AttrsItem;
import pojos.Response;

import java.util.List;

public class RegressTest {
    @Test
    public void checkAttrTest() {

         given()
                .baseUri("https://pgu-uat2-fed.test.gosuslugi.ru")
                .basePath("/api/covid-cert-checker/v3/cert/status/0ab96ec8-bba1-49f6-ac51-0679cf60bd2c")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("attrs[0].type", equalTo("fio"))
                 .body("attrs[0].title", equalTo("ФИО"))
                 .body("certId", equalTo("1000000008665385"))
                 .body("title", equalTo("Сертификат COVID-19"))
                 .body("entitle", equalTo("COVID-19 certificate"))
                 .body("expiredAt", equalTo("17.01.2022"))
                 .body("validFrom", equalTo("07.02.2021"))
                 .body("isExpired", equalTo(true))
                 .body("isBeforeValidFrom", equalTo(false));
                //.extract().jsonPath().getList("attrs", AttrsItem.class);

    }
}
