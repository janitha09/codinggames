/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codinggames;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author 212486104
 */
public class NewClass {

    public static int getMax(int[] ints) {
        return 0;
        //Arrays.stream(ints).map(Integer::max).get();
    }

    public static boolean insertionSort(Comparable[] a) {
        Comparable swap;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j].compareTo(a[j - 1]) < 0) { //everything to left is in order
                    swap = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = swap;
                } else {
                    break; //gauranteed to be sorted
                }
                Arrays.stream(a).forEach(System.out::print);
                System.out.println(" " + i + " " + j);
            }
        }
        return true;
    }

    public static void selectionSort(Comparable[] a) {

        for (int j = 0; j < a.length; j++) {
            int min = j;
            for (int i = j; i < a.length; i++) {
                if (a[i].compareTo(a[min]) < 0) { //swap with the smallest
                    min = i;
                }
            }
            Comparable temp = a[j];
            a[j] = a[min];
            a[min] = temp;
            Arrays.stream(a).forEach(System.out::print);
//            Arrays.stream(a).forEach(i -> System.out.print(i + " "));
            System.out.println(" " + min + " " + j);
        }

    }

    public static void shellSort(Comparable[] a, int h) {
        while (h < a.length / 3) {
            h = 3 * h + 1; //get teh largest value and work backwards
        }
        while (h >= 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (a[j].compareTo(a[j - h]) < 0) {
                        Comparable temp = a[j - h];
                        a[j - h] = a[j];
                        a[j] = temp;
                    } else {
                        break;
                    }
                    Arrays.stream(a).forEach(System.out::print);
                    System.out.println(" " + i + " " + j);
                }
            }
            h = h / 3;
        }
    }

    public static void mergeSort(Integer[] a, Integer[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = (hi - lo) / 2;
        System.out.println(lo + " " + mid + " " + hi);
        mergeSort(a, aux, lo, mid);
        System.out.println(lo + " " + mid + " " + hi);
        mergeSort(a, aux, mid + 1, hi);
        System.out.println(lo + " " + mid + " " + hi);
        merge(a, aux, lo, mid, hi);
    }

    public static Integer[] merge(Integer[] ints, Integer[] aux, int lo, int mid, int hi) {
//        Integer[] aux = new Integer[ints.length];

//        int lo = 0;
//        int hi = ints.length;
//        int mid = (hi - lo) / 2;
        for (int k = lo; k < hi; k++) {
            if (lo > mid) { //low side is exhausted
                aux[k] = ints[mid];
                ++mid;
            } else if (mid >= hi) {
                aux[k] = ints[lo];
                ++lo;
            } else if (ints[lo] < ints[mid]) {
                aux[k] = ints[lo];
                ++lo;
            } else if (ints[mid] < ints[lo]) {
                aux[k] = ints[mid];
                ++mid;
            }

        }
        return aux;
    }

    public static void bottomUpMergeSort(Integer[] ints, Integer[] aux, int lo, int hi) {

        merge(ints, aux, 0, 1, 2);
        merge(ints, aux, 2, 3, 4);
        merge(ints, aux, 0, 2, 4);
    }

    public static void quickSort(Comparable[] a) {
        int i = 1;
        int j = a.length - 1;
//        while (i <= j) {
        while (true) {
            while ((a[i].compareTo(a[0]) < 0)) {
                i++;
            }
            while ((a[j].compareTo(a[0])) > 0) {
                j--;
            }
            if (a[j].compareTo(a[i]) < 0) {
                Comparable swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
            if (i >= j) {
                break;
            }
        }
    }
}
