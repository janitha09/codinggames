/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janitha_j
 */
public class Week64Test {

    @Test
    public void Week64EmptyArray() {
        int[] mums = {};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(-1));
    }

    @Test
    public void Week64OneElementArray() {
        int[] mums = {1};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(1));
    }

    @Test
    public void Week64TwoElementAscArray() {
        int[] mums = {1, 2};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(2));
    }

    @Test
    public void Week64TwoElementDscArray() {
        int[] mums = {2, 1};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(2));
    }

    @Test
    public void Week64TwoElementDscNotHalfArray() {
        int[] mums = {4, 3};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(-1));
    }

    @Test
    public void Week64TwoElementEqlArray() {
        int[] mums = {2, 2};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(-1));
    }

    @Test
    public void Week64ThreeElementEqlArray() {
        int[] mums = {3, 2, 1};
        int actual = Week64.dominantIndex(mums);
        assertThat(actual, is(-1));
    }
}
