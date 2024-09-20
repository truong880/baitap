import java.util.Scanner;
public class test2 {

public static void main(String[] args) {
    System.out.println( " Hinh chu nhat ");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap chieu dai : ");
    double chieudai = scanner.nextInt();
    System.out.print( " Nhap chieu rong : ");
    double chieurong = scanner.nextInt( );
    double chuvi = 2 * ( chieudai + chieurong );
    System.out.println( " chuvi : " + chuvi);
    double dientich = chieudai * chieurong ;
    System.out.println( " dientich : " + dientich);

}
}
