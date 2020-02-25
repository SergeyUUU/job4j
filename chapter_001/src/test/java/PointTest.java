package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.Point.distance;

public class PointTest {


    @Test
    public void distance () {

        double in = Point.distance(0, 0, 2, 0);
        double expected = (2);
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);

    }



}
