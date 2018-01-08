
import static java.lang.Math.min;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janitha_j
 */
class Week66 {

    static int[] anagramMapping(int[] A, int[] B) {
        int[] mapping = new int[A.length];
        if (A.length == 0 || B.length == 0) {
            return new int [0];
        } else {//no hashtable no sorting
            for (int a = 0; a < A.length; a++) {
                for (int b = 0; b < B.length; b++) {
                    if (A[a] == B[b]) {
                        mapping[a] = b;
                    }
                }
            }
        }
        return mapping;
    }

}
