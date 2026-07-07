package com.example.mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class Exercise7Test {

    @Test
    void testVoidException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Connection Failed"))
                .when(mockApi)
                .connect();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.connectServer();
        });

        verify(mockApi).connect();
    }
}