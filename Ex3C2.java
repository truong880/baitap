
import java.util.Random;
import java.util.stream.DoubleStream;
public class Ex3C2{
    public static void main(String[] args){
        Random random = new Random();
        //Method 1
        boolean m1 = random.nextBoolean();
        System.out.println("random boolean: " + m1);
        //Method 2
        int m2 = random.nextInt();
        System.out.println("random int: " + m2);
        //Method 3
        DoubleStream m3 = random.doubles(m2);
        System.out.println(m3);
        //Method 4
        double m4 = random.nextDouble();
        System.out.println("random double: " + m4);
        //Method 5
        float m5 = random.nextFloat();
        System.out.println("random float: " + m5);
        //Method 6
        long m6 = random.nextLong();
        System.out.println("random number very long: " + m6);
        //Method 7
        double m7 = random.nextExponential();
        System.out.println("random exponential: " + m7);
        //Method 8
        double m8 = random.nextGaussian();
        System.out.println("random something: " + m8);
        //Method 9
        int m9 = random.nextInt(-10,10);
        System.out.println("random -10 to 10: " + m9);
        //Method 10;
        int m10 = random.nextInt(m2);
        System.out.println("random int with bound: " + m10);
    }
}
