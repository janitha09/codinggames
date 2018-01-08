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
public class Week65Test {

    @Test
    public void week65Target0() {
        int target = 0;
        int actual = Week65.reachNumber(target);
        assertThat(actual, is(0));
    }

    @Test
    public void week65Target1() {
        int target = 1;
        int actual = Week65.reachNumber(target);
        assertThat(actual, is(1));
    }
    // 0+1+2+3+4+5+n>=target
    //=(n-4)+(n-3)+(n-2)+(n-1)+n>=target
    //=5n-10>=15
    //5n=25
    //n=5
    //5n=24
    //numbers 0,1,3,6,10,15

    @Test
    public void week65Target3() {
        int target = 3;
        int actual = Week65.reachNumber(target);
        assertThat(actual, is(2));
    }

}
