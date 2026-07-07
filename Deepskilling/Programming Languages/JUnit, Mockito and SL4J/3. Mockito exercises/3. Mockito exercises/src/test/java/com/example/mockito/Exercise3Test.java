package com.example.mockito;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class Exercise3Test {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getUser(anyInt())).thenReturn("John");

        MyService service = new MyService(mockApi);

        service.getUser(100);

        verify(mockApi).getUser(anyInt());
    }
}