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

    @Test
    public void getPersonInfo_should_return_upperCased_info() {

        // arrange
        BDDMockito.given(address.getInfo()).willReturn("boston in USA");

        // act
        Person sang1 = new Person("sang");
        sang1.setAddress(address);
        String upperCasedPersonInfo = sang1.getUpperCasedPersonInfo();

        // assert
        Assert.assertEquals("SANG LIVES IN BOSTON IN USA", upperCasedPersonInfo);

        // verify
        BDDMockito.verify(address).getInfo();

    }
}
