public class Main {
    public static void main(String[] args) {
        /*  Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
        Otherwise, return the string unchanged.

        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
        */

        System.out.println(Task.delDel("adelbc"));
        System.out.println(Task.delDel("adelHello"));
        System.out.println(Task.delDel("adedbc"));
        System.out.println(Task.delDel("adelreturnString"));
        System.out.println(Task.delDel(""));

        /* Given a string, return a string made of the first 2 chars (if present),
         however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"
        */

        System.out.println(Task.startOz("ozymandias"));
        System.out.println(Task.startOz("bzoo"));
        System.out.println(Task.startOz("oxx"));
        System.out.println(Task.startOz("oozoo"));
        System.out.println(Task.startOz("oxz"));
        System.out.println(Task.startOz("ozx"));

    }
}