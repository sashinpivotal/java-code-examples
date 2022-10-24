package _01_classes_and_objects_examples;

public class PersonClient {

    public static void main(String[] args) {
        Person person = new Person("cindy", 20);
        String personInfo = person.getPersonInfo();
        System.out.println(personInfo);

        Person person1 = new Person();
        person1.setName("david");
        person1.setAge(20);
        String personInfo1 = person1.getPersonInfo();
        System.out.println(personInfo1);

    }
}
