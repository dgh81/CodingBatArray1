package com.company;

public class Main {

    public static void main(String[] args) {

        // rotateLeft3:
        int[] nums = {2,5,6};
        nums = rotateLeft3(nums);

        int[] nums2 = {2,5,6};
        nums2 = reverse3(nums2);


        for (int i = 0; i < 3; i++) {
            //System.out.println(nums[i]);
            System.out.println(nums2[i]);
        }
        int[] nums3 = {1,1,3,1,3};
        System.out.println(unlucky1(nums3));


    }
    public static int[] rotateLeft3_hc(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[1];
        result[1] = nums[2];
        result[2] = nums[0];
        return result;
    }
    public static int[] rotateLeft3(int[] nums) {
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                result[i] = nums[i-2];
            } else {
                result[i] = nums[i+1];
            }
        }
        return result;
    }

    public static int[] reverse3_hc(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[2];
        result[1] = nums[1];
        result[2] = nums[0];
        return result;
    }
    public static int[] reverse3(int[] nums) {
        int[] result = new int[3];
        for (int i = 0; i < nums.length; i++) {
            // i - 2:
            // 0 - 2 = -2
            // 1 - 2 = -1
            // 2 - 2 =  0
            // hvis ovenstående laves abs() bliver det 2, 1, 0 - altså omvendt rækkefølge:
            result[i] = nums[Math.abs(i-2)];
        }
        return result;
    }
    public int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
    public static int sum3(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        return result;
    }
    public static boolean unlucky1(int[] nums) {
    // 1 fulgt af 3:
        boolean result = false;
        for (int i = 0; i < nums.length-1; i++) {
            if ((i == 0 && nums[i] == 1 && nums[i+1] == 3) || (i == 1 && nums[i] == 1 && nums[i+1] == 3) || (i == nums.length-2 && nums[nums.length-2] == 1 && nums[nums.length-1] == 3)){
                result = true;
            }
        }
        return result;
    }
    public int[] biggerTwo(int[] a, int[] b) {
        int[] resultA = new int[2];
        int[] resultB = new int[2];
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA = sumA + a[i];
            resultA[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            sumB = sumB + b[j];
            resultB[j] = b[j];
        }
        if (sumA >= sumB) {
            return resultA;
        } else {
            return resultB;
        }
    }
}
