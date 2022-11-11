//Made by Codytex

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class Tests {

    @ParameterizedTest
    @MethodSource({"Data#countLettersTestData"})
    public void maxNum(int[] nums,int result) {
        Assertions.assertEquals(result, Tasks.maxNum(nums), "maxNum() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#sumOfOddsTestData"})
    public void sumOfOddsTest(int[] nums, int result) {
        Assertions.assertEquals(result, Tasks.sumOfOdds(nums), "sumOfOdds() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#threeAmigosTestData"})
    public void threeAmigosTest(int[] nums, boolean result) {
        Assertions.assertEquals(result, Tasks.threeAmigos(nums), "threeAmigos() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#make100With2TestData"})
    public void make100With2Test(int[] nums, boolean result) {
        Assertions.assertEquals(result, Tasks.make100With2(nums), "make100With2() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#switchPairsTestData"})
    public void switchPairsTest(String[]list, String[] result) {
        Assertions.assertArrayEquals(result, Tasks.switchPairs(list), "switchPairs() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#outOfOrderTestData"})
    public void outOfOrderTest(int[] pages, int result) {
        Assertions.assertEquals(result, Tasks.outOfOrder(pages), "outOfOrder() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#contains12TestData"})
    public void contains12Test(int[] nums, boolean result) {
        Assertions.assertEquals(result, Tasks.contains12(nums), "contains12() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#combineNumbersTestData"})
    public void combineNumbersTest(int[] pages, long result) {
        Assertions.assertEquals(result, Tasks.combineNumbers(pages), "combineNumbers() was written wrong.");
    }

    @ParameterizedTest
    @MethodSource({"Data#removeDuplicatesTestData"})
    public void removeDuplicatesTest(int[]nums, int[] result) {
        Assertions.assertArrayEquals(result, Tasks.removeDuplicates(nums), "removeDuplicates() was written wrong.");
    }
}
