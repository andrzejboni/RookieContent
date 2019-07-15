package Solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    int counter = 0;

    Map<Integer, Integer> map = new HashMap<>();

    public int solution(int[] A) {
        if (A.length == 0) {
            return -1;
        }
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    if (i != j) {
                        if (A[i] == A[j]) {
                            if (!map.containsValue(j)) {
                                map.put(j, i);
                                counter++;
                            }
                        }
                    }
                }
            }

        return counter;
    }
}
