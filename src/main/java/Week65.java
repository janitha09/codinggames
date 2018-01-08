/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janitha_j
 */
class Week65 {

    static int reachNumber(int target) {
        int runningSum = 0;
        int step = 1;
        while (runningSum < target) {
            runningSum += step;

        }
        return runningSum;
    }

}
