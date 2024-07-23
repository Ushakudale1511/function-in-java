import java.util.*;
public class function3 {
    public static int calculateProduct(int a, int b){
        int Product= a*b ;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println ("product of two numbers:3" +calculateProduct(a , b));
    }
}
  