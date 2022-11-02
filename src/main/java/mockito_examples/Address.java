package mockito_examples;

public class Address {

    private String city;
    private String country;

    public Address(String city) {
        this.city = city;
    }

    public String getInfo() {
        return city + " " + country;
    }
}
