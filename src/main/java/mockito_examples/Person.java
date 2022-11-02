package mockito_examples;

public class Person {

    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUpperCasedPersonInfo() {
        String info = getName() + " lives in " + address.getInfo();
        return info.toUpperCase();
    }
}
