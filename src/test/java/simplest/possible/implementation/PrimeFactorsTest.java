package simplest.possible.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;

public class PrimeFactorsTest {
    @Test
    void thereAreNoPrimeFactorsFor1() {
        List<Integer> factors = new PrimeFactors().of(1);
        Assertions.assertEquals(emptyList(), factors);
    }
}