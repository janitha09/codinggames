/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.containsInAnyOrder;
import org.junit.Assert;

/**
 *
 * @author janitha_j
 */
public class Week66Test {

    @Test
    public void week66Empty() {
        int[] A = {};
        int[] B = {};
        int[] actual = Week66.anagramMapping(A, B);
        int[] expected = {};
        Assert.assertArrayEquals(expected, actual);
//         assertThat(actual, containsInAnyOrder(expected));
    }

    @Test
    public void week66element10() {
        int[] A = {1};
        int[] B = {};
        int[] actual = Week66.anagramMapping(A, B);
        int[] expected = {};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void week66element11() {
        int[] A = {1};
        int[] B = {1};
        int[] actual = Week66.anagramMapping(A, B);
        int[] expected = {0};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void week66element21() {
        int[] A = {2, 1};
        int[] B = {1};
        int[] actual = Week66.anagramMapping(A, B);
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void week66element12() {
        int[] A = {2};
        int[] B = {1, 2};
        int[] actual = Week66.anagramMapping(A, B);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }
}
