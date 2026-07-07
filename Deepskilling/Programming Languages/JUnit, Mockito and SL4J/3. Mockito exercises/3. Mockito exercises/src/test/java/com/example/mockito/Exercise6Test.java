package com.example.mockito;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class Exercise6Test {

    @Test
    void testInteractionOrder() {

        Logger logger = mock(Logger.class);

        ServiceLogger service = new ServiceLogger(logger);

        service.execute();

        InOrder order = inOrder(logger);

        order.verify(logger).start();

        order.verify(logger).log("Running");

        order.verify(logger).end();
    }
}