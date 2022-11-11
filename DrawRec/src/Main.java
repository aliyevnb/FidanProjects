public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                /*if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("###");
                }*/
                /*if(i < 3 || i > 3) {
                    System.out.println("*");
                } else {
                    System.out.println("   ");
                }
                if(i == 5 || j == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" # ");
                }*/
                if(i >= 0 && i <= 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}