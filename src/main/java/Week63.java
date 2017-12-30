
import static java.lang.Math.min;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janitha_j
 */
class Week63 {

    static int minCostClimbingStairs(int[] i) {
        switch (i.length) {
            case 0:
                return 0;
            case 1:
                return i[0];
            default:
                int minCost = 0;
                int step = 0;
                int c = i.length - 1;
                if (i[c] < i[c - 1]) {//step down 1 from the top
                    minCost = minCost + i[c];
                    step = 1;
                } else {//step down 2
                    minCost = minCost + i[c - 1];
                    step = 2;
                }
                int step1 = 0;
                if (step == 1) {
                    c = c - step;
                    if (i[c] < i[c - 1]) {//step down 1
                        minCost = minCost + i[c];
                        step1 = 1;
                    } else {//step down 2
                        minCost = minCost + i[c - 1];
                        step1 = 2;
                    }
                } else if (step == 2) {
                    c = c - step;
                    if (i[c] < i[c - 1]) {//step down 1
                        minCost = minCost + i[c];
                        step1 = 1;
                    } else {//step down 2
                        minCost = minCost + i[c - 1];
                        step1 = 2;
                    }
                }
                step = 0;//recycle it once it has been used.
                if (step1 == 1) {
                    c = c - step1;
                    if (i[c] < i[c - 1]) {//step down 1
                        minCost = minCost + i[c];
                        step = 1;
                    } else {//step down 2
                        minCost = minCost + i[c - 1];
                        step = 2;
                    }
                } else if (step1 == 2) {
                    c = c - step1;
                    if (i[c] < i[c - 1]) {//step down 1
                        minCost = minCost + i[c];
                        step = 1;
                    } else {//step down 2
                        minCost = minCost + i[c - 1];
                        step = 2;
                    }
                }
//                while (c > 1) {
//                    if (i[c - 1] < i[c - 2]) {
//                        minCost = minCost + i[c - 1];
//                        c = c - 1;
//                    } else if (i[c - 1] >= i[c - 2]) {
//                        minCost = minCost + i[c - 2];
//                        c = c - 2;
//                    }
//                }
                return minCost;
        }
    }

    static int minCostClimbingStairs1(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
