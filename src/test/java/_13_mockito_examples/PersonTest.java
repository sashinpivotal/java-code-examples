package _13_mockito_examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonTest {

    @Mock
    private Address address;

    // This test will fail due to a logic error
    // in the Address dependency
    // (In that respect, it is an integration testing
    // involving two classes not a unit test.)
    // (Whether you want to use integration testing or
    // unit testing or both is up to you.)
    @Test
    public void getPersonInfo_should_return_upperCased_info_not_using_mock() {

        // arrange
        Address boston = new Address("boston", "usa");
        Person sang1 = new Person("sang", boston);
        String upperCasedPersonInfo = sang1.getUpperCasedPersonInfo();

        // assert
        Assertions.assertEquals("SANG LIVES IN BOSTON USA", upperCasedPersonInfo);

    }

    // This unit test will succeed given that we
    // mock the behavior of Address dependency
    @Test
    public void getPersonInfo_should_return_upperCased_info_using_mock() {

        // arrange
        BDDMockito.given(address.getInfo()).willReturn("boston USA");

        // act
        Person person = new Person("sang", address);
        String upperCasedPersonInfo = person.getUpperCasedPersonInfo();

        // assert
        Assertions.assertEquals("SANG LIVES IN BOSTON USA", upperCasedPersonInfo);

        // verify
        BDDMockito.verify(address).getInfo();

    }

}
