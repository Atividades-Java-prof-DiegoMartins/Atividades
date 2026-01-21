import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CatesTest {

  @Test
  public void deveRetornarFatoDeUmGato() {
    // BDD (Given / When / Then)
    given()
        .baseUri("https://catfact.ninja")
        .when()
        .get("/fact")
        .then()
        .statusCode(200)
        .body("fact", not(empty()))
        .body("length", greaterThan(0));
  }
  @Test
  public void deveRetornarpropriedadesgato() {
    // BDD (Given / When / Then)
    given()
        .baseUri("https://catfact.ninja")
        .when()
        .get("/facts")
        .then()
        .statusCode(200);
  }

}

