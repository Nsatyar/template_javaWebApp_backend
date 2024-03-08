// COMMENT
package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    @Test
    public void testBusinessLogic() {
        RequestResponse request = new RequestResponse();
        // Set request parameters
        request.setParameter1("value1");
        request.setParameter2("value2");
        
        BusinessLogic businessLogic = new BusinessLogic();
        
        RequestResponse response = businessLogic.processRequest(request);
        
        // Assert the response parameters
        assertEquals("expectedValue1", response.getParameter1());
        assertEquals("expectedValue2", response.getParameter2());
    }
}
