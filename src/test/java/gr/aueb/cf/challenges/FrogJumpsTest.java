package gr.aueb.cf.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrogJumpsTest {

    FrogJumps sut = new FrogJumps();

    @Test
    void findFrogJumps_returnsMaxNumberOfJumpsRequired() {
        var result = sut.findFrogJumps(10.0, 85.0, 30.0);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void findFrogJumps_returnsNumberOfJumpsRequired() {
        var result = sut.findFrogJumps(20.0, 105.0, 20.0);
        assertThat(result).isEqualTo(5);
    }

}