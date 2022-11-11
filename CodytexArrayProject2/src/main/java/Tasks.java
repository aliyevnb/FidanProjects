//Made by Codytex

import java.util.Arrays;

public class Tasks {

    /*
     * Write a method that will accept an array as parameter and return maximum value from array.
     *
     * Examples:
     * maxNum([3,9,55,73,99,2,10]) → 99
     */
    public static int maxNum(int[] arrays) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        return max;
    }

    /*
     * Write a method that received an integer array and returns the sum of all odd numbers in the array
     *
     * Examples:
     * sumOfOdds([1,2,3,4,5,6,7,8,9,10]) → 25
     * sumOfOdds([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
     * sumOfOdds([3, 2, 2, 4]) → [3, 4, 2, 2]
     */
    public static int sumOfOdds(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

    /*
     * Write a method that takes an array of integers and returns a boolean. Your method should return true if array
     * contains three consecutive even number or three consecutive odd numbers. Return false otherwise.
     *
     * Examples:
     * threeAmigos([2, 1, 3, 5]) -> true
     * threeAmigos([2, 1, 2, 5]) -> false
     * threeAmigos([2, 4, 2, 5]) -> true
     */
    public static boolean threeAmigos(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) {
                count1++;
            }
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] % 2 != 0 && nums[j + 1] % 2 != 0) {
                    count2++;
                }
            }
        }
        return (count1 > 3 || count2 > 3);
    }


    /*
     * Write a method that takes an array of ints and returns a boolean. Return true if that array contains two
     * numbers anywhere in the array whose sum is 100
     *
     * Examples:
     * make100With2([7, 7, 1, 1, 7]) → false
     * make100With2([100, 0, 1]) → true
     */
    public static boolean make100With2(int[] nums) {
        return false;
    }

    /*
     * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
     * Your method should switch the order of the first two values, then switch the order of the next two, switch the
     * order of the next two, and so on.
     *
     * Examples:
     * switchPairs(["four", "score", "and", "seven", "years", "ago"]) → ["score", "four", "seven", "and", "ago",
     * "years"]
     * switchPairs(["to", "be", "or", "not", "to", "be", "hamlet"]) → ["be", "to", "not", "or", "be", "to", "hamlet"]
     */
    public static String[] switchPairs(String[] list) {
        return null;
    }

    /*
     * Given array of book pages return page that is out of order. (Note: if all pages in the order return -1)
     *
     * Examples:
     * outOfOrder([20,100,55,78,44,90]) → 55
     * outOfOrder([20,21,22,78,44,90]) → 44
     * outOfOrder([20,21,22,78,84,90]) → -1
     */
    public static int outOfOrder(int[] pages) {

        for (int i = 1; i < pages.length; i++) {
            if (pages[i] < pages[i - 1]) return pages[i];
        }
        return -1;
    }


    /*
     * Write a method that takes an array of integers and returns a boolean. Return true if the array contains 1 and
     * 2 later somewhere in the array, and 1 has to come before 2.
     *
     * Examples:
     * contains12([1, 3, 2]) -> true
     * contains12([3, 1, 2]) -> true
     * contains12([3, 1, 4, 5, 2]) -> true
     * contains12([3, 2, 4, 5, 1]) -> false
     */
    public static boolean contains12(int[] nums) {
        //boolean result = false;
        int pos1 = -1;
        int pos2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                pos1 = i;
            } else if (nums[i] == 2) {
                pos2 = i;
            }
        }
        return pos2 > pos1;
    }


    /*
     * Write a method that will accept array of integers as parameter and will return one long number of combined
     * numbers. Number will not contain more than 2 digits. If the number is negative accept it as positive
     *
     * Examples:
     * combineNumbers([2,66,3,90,1,-10]) → 266390110
     * combineNumbers([0,34,5,3,8]) → 34538
     */
    public static long combineNumbers(int[] numbers) {
        String myStr = "";
        for (int i = 0; i < numbers.length; i++) {
            myStr += Math.abs(numbers[i]);

        }
        return Integer.parseInt(myStr);
    }


    /*
     * Write a method that will accept one array as parameter and will remove duplicates and return will have unique
     * numbers inside
     *
     * Examples:
     * removeDuplicates([3,6,8,3,2,7,9,9]) → [3,6,8,2,7,9]
     * removeDuplicates([-1,5,8,-1,-55,55,0]) → [-1,5,8,-55,55,0]
     */
    public static int[] removeDuplicates(int[] nums) {

        int[] tmpA = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i] != nums[j]) {
                        tmpA[i] = tmpA[i];
                    }
                }
            }
        }

        int countNulls = 0;

        for(int i = 0; i < tmpA.length; i++){
            if(tmpA[i] == 0) {
                countNulls++;
            }
        }

        int[] tmpB = new int[tmpA.length - countNulls];

        for(int i = 0; i < tmpB.length; i++){
            tmpB[i] = tmpA[i];
        }

        return tmpB;
        //return Arrays.stream(nums).distinct().toArray();
    }

    public static int[] addToArray(int num, int[] arr) {
        return null;
    }
}












