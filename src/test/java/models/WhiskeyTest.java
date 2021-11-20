package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {
    @Test
    public void setIDTest() {
        // given (1)
        int expected = 1;
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Rye";
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Maker's Mark";
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    public void setProofTest() {
        // given (1)
        int expected = 100;
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setProof(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getProof());
    }

    @Test
    public void setBottleSizeTest() {
        // given (1)
        int expected = 750;
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBottleSize(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBottleSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 10;
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 40.50f;
        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);
        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }

}