package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class SqAreaTest {

    @Test
    public void square() {
     double in = SqArea.square (4, 1);
          double expected = 1;
     double out = SqArea.square(4,1);
     Assert.assertEquals (expected, out, 0.01);

    }

}
