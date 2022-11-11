//Made by Codytex

public class Data {

    public static Object[][] countLettersTestData() {
        return new Object[][]{
                {new int[]{6, 99, 3, 45, 0, -234}, 99},
                {new int[]{-234, 66, 3, 1, 0, 567, 99}, 567},
                {new int[]{-1}, -1}
        };
    }

    public static Object[][] sumOfOddsTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 25},
                {new int[]{2, 3, 4, 5}, 8},
                {new int[]{-5, 2, 4, 8, 10, 5}, 0}
        };
    }

    public static Object[][] threeAmigosTestData() {
        return new Object[][]{
                {new int[]{1, 3, 5, 4, 6}, true},
                {new int[]{100, 333, 500, 4, 6, 1}, true},
                {new int[]{100, 333, 500, 41, 6, 1}, false}
        };
    }

    public static Object[][] make100With2TestData() {
        return new Object[][]{
                {new int[]{7, 7, 1, 1, 7}, false},
                {new int[]{100, 0, 1}, true},
                {new int[]{12, 34, 88}, true},
                {new int[]{49, 50, 65, 23, 1}, false},
                {new int[]{1}, false},
                {new int[]{100}, false}
        };
    }

    public static Object[][] switchPairsTestData() {
        return new Object[][]{
                {new String[]{"b", "a", "c"}, new String[]{"a", "b", "c"}},
                {new String[]{"two", "one", "four", "three", "five"},
                        new String[]{"one", "two", "three", "four", "five"}},
                {new String[]{"developer", "tester", "tester2", "scrum master", "in", "code", "language", "java", "!"},
                        new String[]{"tester", "developer", "scrum master", "tester2", "code", "in", "java", "language",
                                "!"}},
                {new String[]{"1", "2", "3", "4", "5", "6", "7"}, new String[]{"2", "1", "4", "3", "6", "5", "7"}},
                {new String[]{"flowers", "four", "eleven", "sun", "better", "cloud", "git"},
                        new String[]{"four", "flowers", "sun", "eleven", "cloud", "better", "git"}},
                {new String[]{"little", "java", "door", "nine", "seven", "and", "with", "yard", "laptop"},
                        new String[]{"java", "little", "nine", "door", "and", "seven", "yard", "with", "laptop"}},
                {new String[]{"zebra", "tiger"}, new String[]{"tiger", "zebra"}},
                {new String[]{"code"}, new String[]{"code"}}
        };
    }

    public static Object[][] outOfOrderTestData() {
        return new Object[][]{
                {new int[]{3, 66, 77, 78, 79, 90, 87}, 87},
                {new int[]{3, 66, 2, 78, 79, 90, 87}, 2},
                {new int[]{3, 4, 7, 78, 79, 90, 97}, -1},
                {new int[]{3, 5, 1}, 1}
        };
    }

    public static Object[][] contains12TestData() {
        return new Object[][]{
                {new int[]{25, 13, 1, 22}, false},
                {new int[]{25, 13, 1, 2}, true},
                {new int[]{1, 13, 11, 2}, true},
                {new int[]{2, 2, 1, 1}, false},
                {new int[]{133, 3, 56, 0}, false}
        };
    }

    public static Object[][] combineNumbersTestData() {
        return new Object[][]{
                {new int[]{0, 0, 0}, 0},
                {new int[]{2, 67, 85, 4}, 267854},
                {new int[]{-1, 2, 67, 85, 4}, 1267854}
        };
    }

    public static Object[][] removeDuplicatesTestData() {
        return new Object[][]{
                {new int[]{2, 55, 77, 3, 4, 2}, new int[]{2, 55, 77, 3, 4}},
                {new int[]{-33, 0, 0, -33, 5, 1}, new int[]{-33, 0, 5, 1}},
                {new int[]{5, 7, 1, 99, 5}, new int[]{5, 7, 1, 99}},
                {new int[]{0}, new int[]{0}}
        };
    }
}
