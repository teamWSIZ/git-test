package arytmetyka;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
/**
 * Created on 09.09.16, at 18:56
 */
public class KalkulatorTest {
    Kalkulator testee;

    @Before
    public void setUp() throws Exception {
        testee = new Kalkulator();

    }

    @Test
    public void mnozenieTest() {
        //arrange
        //act
        //assert
        assertThat(testee.times(2,2)).isEqualTo(4);
    }

    @Test
    public void dodawanieTest() {
        assertThat(testee.add(2, -2)).isEqualTo(0);
    }

    @Test
    public void silniaTest() {
        assertThat(testee.silnia(4)).isEqualTo(24);
    }

    @Test(expected = ArithmeticException.class)
    public void dzieleniePrzezZeroTest() {
        testee.div(2, 0);
    }
}