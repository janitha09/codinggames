/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import com.mycompany.codinggames.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 *
 * @author 212486104
 */
public class NewEmptyJUnitTest {

    @Test
    public void testGetMax() {
        int[] ints = {1, 2, 3, 4, 5};
//        int result = NewClass.getMax(ints);
//        List<Integer> intList = Arrays.stream(ints);
        // To get max value
        OptionalInt maxVal = Arrays.stream(ints).reduce(Integer::max);
        assertEquals(5, maxVal.getAsInt());
    }

    @Test
    public void testInsertionSort() {
        Integer[] ints = {5, 4, 3, 2, 1};
        //NewClass nc = new NewClass();
        boolean expected = NewClass.insertionSort(ints);
        //assertEquals(true,expected);
        assertEquals(1, ints[0].intValue());
        assertEquals(2, ints[1].intValue());
    }

    @Test
    public void testSelectionSort() {
        Integer[] ints = {5, 4, 3, 2, 1};
        //NewClass nc = new NewClass();
        NewClass.selectionSort(ints);
        assertEquals(1, ints[0].intValue());
//        assertEquals(4, ints[1].intValue());
    }

    @Test
    public void testShellSort() {
        Integer[] ints = {5, 4, 3, 2, 1};
        //NewClass nc = new NewClass();
        int h = 1;
        NewClass.shellSort(ints, h);
        assertEquals(1, ints[0].intValue());
        while (h < ints.length / 3) {
            h = 3 * h + 1;
            System.out.println(h);
        }
    }

    @Test
    public void testMergeSort() {
        Integer[] ints = {5, 4,3,2,1};
        Integer[] aux = new Integer[ints.length];
        NewClass.mergeSort(ints, aux, 0, ints.length);
        Arrays.stream(aux).forEach(System.out::print);
//        assertEquals(4, aux[0].intValue());
//        assertEquals(5, aux[1].intValue());
    }

    @Test
    public void testBottomUpMergeSort() {
        Integer[] ints = {5, 4, 3, 2};
        Integer[] aux = new Integer[ints.length];
        NewClass.bottomUpMergeSort(ints, aux, 0, ints.length);
        Arrays.stream(aux).forEach(System.out::print);
//        assertEquals(4, aux[0].intValue());
//        assertEquals(5, aux[1].intValue());
//        assertEquals(2, aux[2].intValue());
//        assertEquals(3, aux[3].intValue());
    }
    @Test
    public void testQuickSort(){
        Comparable[] ints = {"K","R","A"};
        Comparable[] expected = {"A","K","R"};
        NewClass.quickSort(ints);
        Assert.assertArrayEquals(expected, ints);
        Arrays.stream(ints).forEach(System.out::print);
    }
    @Test
    public void testInsert23tree(){
        RedBlackBST<Integer,String> rbtree = new RedBlackBST<>();
        rbtree.put(7,"7");
    }
}
