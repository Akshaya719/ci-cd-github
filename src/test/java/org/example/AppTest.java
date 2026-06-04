package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void greetReturnsHelloMessage() {
        assertEquals("Hello, Copilot", App.greet("Copilot"));
    }
}
