package Exception;

public class E1Class {
    public static void main(String[] args) {


        dostuff();

    }
    public static void dostuff(){
        domorestuff();
        System.out.println(10/0 );
    }
    public static void domorestuff(){
        System.out.println("Hello");
    }
}
