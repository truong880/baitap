import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập một số : ");
            int number = scanner.nextInt();
            double radian = Math.toRadians(number);
            double cos = Math.cos( radian );
            double sin = Math.sin(radian);
            double squareRoot = Math.sqrt(number);
            System.out.println("Cos cua  " + number  + " la :  " +  cos);
            System.out.println("Sin  cua  " +  number  + " la  : " + sin);
            System.out.printf( " Sprt cua " + number + " la : "  + squareRoot);

        }
    }


