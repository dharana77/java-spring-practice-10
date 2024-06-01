package org.example;

import org.example.password.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드 초기화 여부를 판단한다.")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        // when
        user.initPassword(() -> "abcdefgh"); //functionalInterface를 사용한 람다 사용

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void wrongPasswordTest() {
        //given
        User user = new User();

        // when
        user.initPassword(() -> "ab"); //WrongPasswordGenerator와 동일

        // then
        assertThat(user.getPassword()).isNull();
    }
}