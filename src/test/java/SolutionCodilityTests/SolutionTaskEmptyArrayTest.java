package SolutionCodilityTests;

import Solution.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SolutionTaskEmptyArrayTest {

    Solution solution;


    @Before
    public void setUp(){
        solution = new Solution();

    }

    @Test
    public void emptyArrayTest() {
        int correctAnswer = -1;
        int A[] ={};
        Assert.assertEquals(correctAnswer, solution.solution(A));
    }

    @Test
    public void negativeNumberTest() {
        int correctAnswer = 2;
        int A[] ={-10,-23, 223,-13, -10, -13};
        Assert.assertEquals(correctAnswer, solution.solution(A));
    }


    @Test
    public void exampleArraySolutionTest() {
        int correctAnswer = 5;
        int A[] ={2,3,8,4,4,4,3,2,9,11,22,33,44,55,66,77,88,99,12,13,14,15,16,17,18,19,888,887,886,885,884,883};
        Assert.assertEquals(correctAnswer, solution.solution(A));
    }



}
