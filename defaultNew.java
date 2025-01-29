import java.util.*;
class defaultValues{
    int a;
    short b;
    boolean c;
    double d;
    char e;
    byte f;
    long g;
    float h;
    void intM(int a){
        System.out.println("value of int is: " + a);
    }
    void shortM(short b){
        System.out.println("value of short is: " + b);
    }
    void booleanM(boolean c){
        System.out.println("value of boolean is: " + c);
    }
    void doubleM(double d){
        System.out.println("value of double  is: " + d);
    }
    void charM(char e){
        System.out.println("value of char  is: " + e);
    }
    void byteM(byte f){
        System.out.println("value of byte is: " + f);
    }
    void longM(long g){
        System.out.println("value of int is: " + g);
    }void floatM(float h){
        System.out.println("value of int is: " + h);
    }
    void display(){
        System.out.println("int:" + a);
        System.out.println("short:" + b);
        System.out.println("boolean:" + c);
        System.out.println("double:" + d);
        System.out.println("char:" + e);
        System.out.println("byte:" + f);
        System.out.println("long:" + g);
        System.out.println("float:" + h);

    }
}
public class defaultNew{
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
    //    System.out.println("Enter Value for int");
    //    int a=sc.nextInt();
    //    System.out.println("Enter value for short");
    //    short b =sc.nextShort();
    //    System.out.println("Enter value for boolean");
    //    boolean c =sc.nextBoolean();
    //    double d = sc.nextDouble();

       defaultValues df = new defaultValues();
        // df.intM(a);
        // df.shortM(b);
        // df.booleanM(c);
        // df.doubleM(d);
        // double r = 0.1d;
        // double f = 0.2D;
        // double l = r+f;
        // System.out.println(l);
       //df.display();
    //    int a =10;
    //    float b = a;
    //    System.out.println(b);
       float c = 0.1f;
       int d = c;
       System.out.println(d);

    }
}