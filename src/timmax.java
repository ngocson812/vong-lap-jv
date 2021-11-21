import java.util.Scanner;

public class timmax {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a: ");
        a = sc.nextInt();
        System.out.println("Enter a number b:");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0  || b == 0){
            System.out.println("No factor");
        } while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println(a);
    }
}
