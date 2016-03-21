package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void isSameContry_should_give_true_if_given_country_matches_the_country() {
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        boolean expected = address.isSameCountry("Qatar");
        assertEquals(expected, true);
    }

    @Test
    public void isSameContry_should_return_false_if_given_country_does_not_matches_the_country() {
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        boolean expected = address.isSameCountry("USA");
        assertEquals(expected, false);
    }

    @Test
    public void getCountry_should_return_country(){
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        String country = address.getCountry();
        assertEquals("Qatar",country);
    }

}
    