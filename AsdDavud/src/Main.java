import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Hello! What is your name?: ");
        String userName = in.nextLine();
        System.out.print("Hi " + userName + ". How are you doing?: ");
        String userMood = in.nextLine();

        if(userMood.toLowerCase().equals("good")) {
            System.out.println("Good to hear! I am good too");
        } else if (userMood.toLowerCase().equals("bad") || userMood.toLowerCase().equals("sad")) {
            System.out.println("I am sorry to hear that. Hope you will better soon");
        }
    }
}