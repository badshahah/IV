/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysum;



public class Arraysum {
    
        public static int sumMatch(int[] inputArray, int targetSum) {
        int sum = 0;
        for (int element : inputArray) {
            if (element == targetSum) {
                sum += element;
            }
        }
        return sum;
    }
}

  
