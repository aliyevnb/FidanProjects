public class Task {
    /*
     Method accepts 'str' String as a parameter. Method will be returning String
     */
    public static String delDel(String str) {
        // result - container string type to save results
        String result = "";

        // First we need to check if string is empty. If string is empty return nothing to parse
        if(str.isEmpty()) {
            result = "Nothing to parse. Empty string";
        } else if (str.contains("del")) { // if string contains 'del'
            if(str.charAt(str.indexOf('d') + 2) == 'l') { // check if third char is l from del. we assume 2 char is 'e'
                // parse string to first half and get from 0 to first d occurance
                String firstHalf = str.substring(0, str.indexOf('d'));
                // parse string to second half and get from d+3 (d = 0, e = 1, l = 2) and start from 3
                String secondHalf = str.substring(str.indexOf('d')+3);
                // combine first and second half
                result = firstHalf + secondHalf;
            }
        } else {
            result = str;
        }

        return result;
    }

    public static String startOz(String str) {
        String result = "";
        if(str.isEmpty()) {
            System.out.println("Nothing to parse. Empty string");
        } else if(str.contains("o")) {
            if(str.contains("oz")) {
                result = "oz";
            } else if(str.contains("zo")) {
                result = "z";
            } else {
                result = "o";
            }
        }
        return result;
    }
}
