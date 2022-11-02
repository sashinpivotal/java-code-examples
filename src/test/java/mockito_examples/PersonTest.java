package mockito_examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonTest {

    @Mock
    private Address address;

    // This test will fail due to a logic error in the Address dependency
    @Test
    public void getPersonInfo_should_return_upperCased_info_not_using_mock() {

        // arrange
        Address boston = new Address("boston", "usa");
        Person sang1 = new Person("sang", boston);
        String upperCasedPersonInfo = sang1.getUpperCasedPersonInfo();

        // assert
        Assert.assertEquals("SANG LIVES IN BOSTON USA", upperCasedPersonInfo);

    }

    // This test will succeed given that we mock the behavior of Address dependency
    @Test
    public void getPersonInfo_should_return_upperCased_info_using_mock() {

        // arrange
        BDDMockito.given(address.getInfo()).willReturn("boston USA");

        // act
        Person person = new Person("sang", address);
        String upperCasedPersonInfo = person.getUpperCasedPersonInfo();

        // assert
        Assert.assertEquals("SANG LIVES IN BOSTON USA", upperCasedPersonInfo);

        // verify
        BDDMockito.verify(address).getInfo();

    }

}
