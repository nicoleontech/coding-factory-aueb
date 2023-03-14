package gr.aueb.cf.homework.ch20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PasswordValidatorTest {

    PasswordValidator sut = new PasswordValidator();

    @Test
    void isPasswordValid_returnsTrue_ifPasswordContainsAtLeastEightCharacters() {
        var result = sut.isPasswordValid("a*cdK112");
        assertThat(result).isTrue();
    }

    @Test
    void isPasswordValid_returnsTrue_ifPasswordContainsTenCharacters() {
        var result = sut.isPasswordValid("abCde112w-");
        assertThat(result).isTrue();
    }

    @Test
    void isPasswordValid_returnsFalse_ifPasswordContainsSevenCharacters() {
        var result = sut.isPasswordValid("abcDe1$");
        assertThat(result).isFalse();
    }

    @Test
    void isPasswordValid_returnsTrue_ifPasswordContainsAtLeastOneUpperCaseCharacter() {
        var result = sut.isPasswordValid("aBcde1@#");
        assertThat(result).isTrue();
    }

    @Test
    void isPasswordValid_returnsTrue_ifPasswordContainsAtLeastOneLowerCaseCharacter() {
        var result = sut.isPasswordValid("ABCDEf1%");
        assertThat(result).isTrue();
    }

    @Test
    void isPasswordValid_returnsFalse_ifPasswordNotContainsAtLeastOneSpecialCharacter() {
        var result = sut.isPasswordValid("ABCDEf13");
        assertThat(result).isFalse();
    }

    @Test
    void isPasswordValid_returnsTrue_ifPasswordNotContainsAtLeastOneSpecialCharacter() {
        var result = sut.isPasswordValid("e!gfLM93");
        assertThat(result).isTrue();
    }

}