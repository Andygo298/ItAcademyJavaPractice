package Week1Task2;

import org.junit.jupiter.api.Test;

import java.util.List;

class BuyerTest {
    @Test
    public void test1() {
        MovieHouse movieHouse = new MovieHouse();
        List<Buyer> buyers = movieHouse.createBuyers();
        System.out.println(movieHouse.payments(buyers));
    }
}
