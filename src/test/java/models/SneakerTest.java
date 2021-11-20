package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SneakerTest {

    @Test
    public void constructorTest() {
        int expectedID = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        int expectedSize = 9;

        Sneaker testSneaker = new Sneaker(expectedID, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice, expectedSize);

        Assertions.assertEquals(expectedID, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
        Assertions.assertEquals(expectedSize, testSneaker.getSize());

    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";
        // when (2)
        Sneaker testSneaker = new Sneaker(0, expected, null, null, 0, 0.0f ,0);
        testSneaker.setName(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setIDTest() {
        // given (1)
        int expected = 1;
        // when (2)
        Sneaker testSneaker = new Sneaker(1, null, null, null, 0, 0.0f, 0);
        testSneaker.setId(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Adidas";
        // when (2)
        Sneaker testSneaker = new Sneaker(0, null, expected, null, 0, 0.0f, 0);
        testSneaker.setBrand(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Soccer";
        // when (2)
        Sneaker testSneaker = new Sneaker(0, null, null, expected, 0, 0.0f, 0);
        testSneaker.setSport(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 9;
        // when (2)
        Sneaker testSneaker = new Sneaker(0, null, null, null, expected, 0.0f, 0);
        testSneaker.setSize(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 10;
        // when (2)
        Sneaker testSneaker = new Sneaker(0, null, null, null, expected, 0.0f, 0);
        testSneaker.setQty(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 40.50f;
        // when (2)
        Sneaker testSneaker = new Sneaker(0, null, null, null, 0, expected, 0);
        testSneaker.setPrice(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }


}