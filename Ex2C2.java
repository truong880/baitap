public class Ex2C2 {
    public static void main(String[] args){
        StringBuffer Wang = new StringBuffer("Wuang");
        //Method 1
        Wang.append(" cutia");
        System.out.println(Wang);
        //Method 2
        Wang.insert(1,"u");
        System.out.println(Wang);
        //Method 3
        System.out.println(Wang.deleteCharAt(3));
        //Method 4
        System.out.println(Wang.lastIndexOf("help"));
        //Method 5
        System.out.println(Wang.length());
        //Method 6
        System.out.println(Wang.replace(0, 3, "Qua"));
        //Method 7
        System.out.println(Wang.reverse());
        //Method 8
        System.out.println(Wang.capacity());
        //Method 9
        System.out.println(Wang.indexOf("u"));
        //Method 10
        System.out.println(Wang.substring(4));
    }
}
