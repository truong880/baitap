import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap chuoi ki tu : ");
        String chuoi = scanner.nextLine();
        int sokitu = chuoi.length();
        System.out.println( "so luong ki tu trong chuoi la : " + sokitu);
    }
}
