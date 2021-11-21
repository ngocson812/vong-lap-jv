import java.util.Scanner;

public class hinhve {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh chu nhat");
        System.out.println("2. Hinh tam giac 1");
        System.out.println("3. Hinh tam giac 2");
        System.out.println("0. Exit");
        System.out.println("Enter choice");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 5; j++) {
                        System.out.print("♥");
                    }
                    System.out.println("♥");
                }break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }break;
            case 3:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("☻");
                    }
                    System.out.print("\n");
                }break;
            case 0:
                System.exit(4);
            default:
                System.out.println("khong co dau");
        }

    }
}
