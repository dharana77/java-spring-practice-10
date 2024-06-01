package org.example.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {

    @DisplayName("주문 생성")
    @Test
    void createOrderTest() {
        assertThatCode(() -> new Cook("만두", 5000)).doesNotThrowAnyException();
    }
}
