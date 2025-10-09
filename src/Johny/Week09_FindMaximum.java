package Johny;



public class Week09_FindMaximum {


    /*
   Write a function that can find the maximum number from an int Array
   ** Please do not use any sort method...

   input = [1, 5, 8, 3, 2, 11, -1]
   output = 11

    */
    public static void main(String[] args) {

        int[] nums = {1, 103, 8, 3, 2, 11, -1, 45, 558};

        System.out.println(findMaxNum(nums));

    }


    public static int findMaxNum(int[] nums) {

        int maxNum = 0;

        for (int each : nums) {

            int currentNum = each;
            if (currentNum > maxNum)
                maxNum = currentNum;


        }
return maxNum;

    }


//    public static int  findMaxNum (int [] nums ) {
//
//        int currentMax = 0;
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int currentNum = nums[i];
//
//            if (currentNum > currentMax) {
//                currentMax = currentNum;
//            }
//
//
//        }
//        return currentMax;
//    }


}
