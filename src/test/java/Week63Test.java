/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janitha_j
 */
public class Week63Test {

    public Week63Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testMinCostClimbingStairsEmpty() {
        int[] stairs = {};
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(0));
    }

    @Test
    public void testMinCostClimbingStairsSingle() {
        int[] stairs = {10};
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(10));
    }

    @Test
    public void testMinCostClimbingStairsTwoAsc() {
        int[] stairs = {10, 15};
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(10));
    }

    @Test
    public void testMinCostClimbingStairsTwoDesc() {
        int[] stairs = {15, 10};
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(10));
    }

    @Test
    public void testMinCostClimbingStairsThreAsc() {
        int[] stairs = {10, 15, 20};
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(15));
    }

    @Test
    public void testMinCostClimbingStairsThreeSame() {
        int[] stairs = {10, 10, 10};
//        1, 100, 1, 1, 1, 100, 1, 1, 100, 1
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(10));
    }

    @Test
    public void testMinCostClimbingStairs1001() {
        int[] stairs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        1, 100, 1, 1, 1, 100, 1, 1, 100, 1
        int actual = Week63.minCostClimbingStairs(stairs);
        assertThat(actual, is(6));
    }

    @Test
    public void testMinCostClimbingStairs11001() {
        int[] stairs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        1, 100, 1, 1, 1, 100, 1, 1, 100, 1
        int actual = Week63.minCostClimbingStairs1(stairs);
        assertThat(actual, is(6));
    }

    @Test
    public void testMinCostClimbingStairs1ThreeAsc() {
        int[] stairs = {10, 15, 20};
        int actual = Week63.minCostClimbingStairs1(stairs);
        assertThat(actual, is(15));
    }

    @Test
    public void testMinCostClimbingStairs0221() {
        int[] stairs = {0, 2, 2, 1};
        int actual = Week63.minCostClimbingStairs1(stairs);
        assertThat(actual, is(2));
    }
}
