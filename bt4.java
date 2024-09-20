import java.util.Scanner;
public class bt4 {
    public static void main(String[] args) {
        char ch;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a character: ");
        ch = keyboard.next().charAt(0);
        System.out.println("ASCII code: " + ch+"is"+ (byte)ch);
    }
}
