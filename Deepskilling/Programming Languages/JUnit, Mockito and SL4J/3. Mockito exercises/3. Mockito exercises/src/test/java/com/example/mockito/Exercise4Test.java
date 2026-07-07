package com.example.mockito;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class Exercise4Test {

    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).saveData(anyString());

        MyService service = new MyService(mockApi);

        service.save("Hello");

        verify(mockApi).saveData("Hello");
    }
}