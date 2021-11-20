package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SneakerTest {

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setIDTest() {
        // given (1)
        int expected = 1;
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Adidas";
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Soccer";
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 9;
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 10;
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 40.50f;
        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }
}