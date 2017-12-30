
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
public class Week64 {

    public static int dominantIndex(int[] nums) {
        switch (nums.length) {
            case 0:
                return -1;
            case 1:
                return nums[0];
            default:
                int highest = Integer.MIN_VALUE;
                int secondHighest = Integer.MIN_VALUE;
                for (int i : nums) {
                    if (i >= highest) {
                        secondHighest = highest;
                        highest = i;
                    } else if (i >= secondHighest) {
                        secondHighest = i;
                    }

                }
                if (highest >= secondHighest * 2) {
                    return highest;
                }
        }
        return -1;
    }
}
