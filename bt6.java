import java.util.Scanner;
public class bt6  {

    public static void main(String[] args) {
        double r;
        final float pi=3.1415f;
        Scanner k= new Scanner(System.in);
        System.out.println(" radius r= ");
        r=k.nextDouble();
        System.out.println("Circle area r= " +r*r*pi);
        System.out.println("Square perimeter = "+2*r*pi);
    }
}