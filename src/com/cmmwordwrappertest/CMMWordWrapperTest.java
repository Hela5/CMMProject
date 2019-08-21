package com.cmmwordwrappertest;

import com.cmmwordwrapper.CMMWordWrapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CMMWordWrapperTest {

    CMMWordWrapper wordWrapper = new CMMWordWrapper();

    @Test //test input and output capabilities
    public void inputAndOutputTest() throws IOException{
        wordWrapper.loadTextIn();
        wordWrapper.createOutputText();

    }



}
