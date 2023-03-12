package com.example.demojunit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ValidatorTest {
    Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @Test
    void tooShortPhoneNumbersShouldBeInvalid() {
        assertFalse(validator.isPhoneNumberValid("12345"));
    }

    @Test
    void tooLongPhoneNumbersShouldBeInvalid() {
        assertFalse(validator.isPhoneNumberValid("12345678901"));
    }

    @Test
    void phoneNumbersWithCorrectLengthsButNotStartingWith0ShouldBeInvalid() {
        assertFalse(validator.isPhoneNumberValid("1234567"));
    }

    @Test
    void phoneNumbersWithCorrectLengthsShouldBeValidIfOnlyContainingNumbers() {
        assertTrue(validator.isPhoneNumberValid("01234567"));
    }

    @Test
    void phoneNumbersWithCorrectLengthsShouldBeInvalidIfContainingLetters() {
        assertFalse(validator.isPhoneNumberValid("0123a456"));
    }

    @Test
    void isEmailValidShouldReturnFalseIfThereIsNoDomain() {
        assertFalse(validator.isEmailValid("hello@hello"));
    }

    @Test
    void isEmailValidShouldReturnFalseIfThereIsNoAtSign() {
        assertFalse(validator.isEmailValid("hello_hello.com"));
    }

    @Test
    void isEmailValidShouldReturnFalseIfThereIsNoUser() {
        assertFalse(validator.isEmailValid("@hello.com"));
    }

    // Cannot test
    /*@Test
    void isEmailValidShouldReturnFalseIfThereIsNoDomainAfterAt() {
        assertFalse(validator.isEmailValid("hello.com@"));
    }*/

    @Test
    void isEmailValidShouldReturnTrueIfEmailIsValid() {
        assertTrue(validator.isEmailValid("hello@hello.com"));
    }
}
