package leetcode;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Joshua on 11/24/15.
 */
public class ExpressionAddOperatorsTest {
    @Test
    public void testComposeFactor() throws Exception {
        ExpressionAddOperators ex = new ExpressionAddOperators();
        ArrayList<ArrayList<Integer>> result = ex.composeFactor("123");
        for(ArrayList<Integer> i: result) {
            for(Integer j: i) {
                System.out.println(i+"-"+j);
            }

        }



    }
}