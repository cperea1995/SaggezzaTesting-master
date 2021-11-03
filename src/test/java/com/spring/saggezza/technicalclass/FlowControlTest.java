package com.spring.saggezza.technicalclass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
public class FlowControlTest {

    @InjectMocks
    private FlowController flowController;

    @Mock
    private IIntTester intTesterMock;

    @Mock
    private IBoundaryChecker boundaryCheckerMock;

    @Test
    public void givenOneCallIsIntegerOnce() {

        // Given: I am a user

        String input = "1";


        // When: I enter the string “1”
        flowController.run(input);

        // Then: call isInteger() once

        then(intTesterMock).should(times(1)).isInteger(input);

    }

    @Test
    public void givenZeroCallIsIntegerOnce() {

        // Given: I am a user

        String input = "0";


        // When: I enter the string “0”

        flowController.run(input);

        // Then: call isInteger() once

        then(intTesterMock).should(times(1)).isInteger(input);


    }

    @Test
    public void givenBobCallIsIntegerOnce() {

        // Given: I am a user
        String input = "Bob";

        // When: I enter the string “Bob”
        flowController.run(input);

        // Then: call isInteger() once
        then(intTesterMock).should(times(1)).isInteger(input);


    }

    @Test
    public void givenOneCallIsInsideBoundaryOnce() {

        // NOT COMPLETED YET

        // Given: I am a user
        String input = "1";


        // When: I enter the string “0”
        flowController.run(input);

//        when(intTesterMock.isInteger("0")).thenReturn(true);

        // Then: call isInteger() once
        then(intTesterMock).should(times(1)).isInteger(input);


    }

}
