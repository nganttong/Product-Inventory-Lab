package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {

    @Test
    public void constructorTest() {
        int expectedID = 6;
        String expectedName = "Whiskey";
        String expectedBrand = "Maker's Mark";
        int expectedProof = 100;
        int expectedBottleSize = 750;
        int expectedQty = 10;
        float expectedPrice = 80.00f;


        Whiskey whiskeyTest = new Whiskey(expectedID, expectedName,
                expectedBrand, expectedProof,expectedBottleSize,
                expectedQty,expectedPrice);

        Assertions.assertEquals(expectedID, whiskeyTest.getId());
        Assertions.assertEquals(expectedName, whiskeyTest.getName());
        Assertions.assertEquals(expectedBrand, whiskeyTest.getBrand());
        Assertions.assertEquals(expectedProof, whiskeyTest.getProof());
        Assertions.assertEquals(expectedBottleSize, whiskeyTest.getBottleSize());
        Assertions.assertEquals(expectedQty, whiskeyTest.getQty());
        Assertions.assertEquals(expectedPrice, whiskeyTest.getPrice());

    }


    @Test
    public void setIDTest() {
        // given (1)
        int expected = 1;
        // when (2)
        Whiskey testWhiskey = new Whiskey(expected, "", "", 0, 0, 0, 0.0f);
        testWhiskey.setId(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Rye";
        // when (2)
        Whiskey testWhiskey = new Whiskey(0, expected, "", 0, 0, 0, 0.0f);
        testWhiskey.setName(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Maker's Mark";
        // when (2)
        Whiskey testWhiskey = new Whiskey(0, "", expected, 0, 0, 0, 0.0f);
        testWhiskey.setBrand(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    public void setProofTest() {
        // given (1)
        int expected = 100;
        // when (2)
        Whiskey testWhiskey = new Whiskey(0, "", "", expected, 0, 0, 0.0f);
        testWhiskey.setProof(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getProof());
    }

    @Test
    public void setBottleSizeTest() {
        // given (1)
        int expected = 750;
        // when (2)
        Whiskey testWhiskey = new Whiskey(0, "", "", 0, expected, 0, 0.0f);
        testWhiskey.setBottleSize(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBottleSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 10;
        // when (2)
        Whiskey testWhiskey = new Whiskey(0, "", "", 0, 0, expected, 0.0f);
        testWhiskey.setQty(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 40.50f;
        // when (2)
        Whiskey testWhiskey = new Whiskey(0, "", "", 0, 0, 0, expected);
        testWhiskey.setPrice(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }

}