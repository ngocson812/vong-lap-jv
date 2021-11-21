import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hinh chu nhat");
            System.out.println("2. Hinh tam giac");
            System.out.println("3. Hinh vuong");
            System.out.println("4. Out");
            System.out.println("Dien tiep de.");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("♥ ♥ ♥ ♥ ♥");
                    System.out.println("♥ ♥ ♥ ♥ ♥");
                    System.out.println("♥ ♥ ♥ ♥ ♥");
                    System.out.println("♥ ♥ ♥ ♥ ♥");
                    break;
                case 2:
                    System.out.println("♥");
                    System.out.println("♥ ♥");
                    System.out.println("♥ ♥ ♥");
                    System.out.println("♥ ♥ ♥ ☻");
                    System.out.println("♥ ♥ ♥ ☻ ☺");
                    break;
                case 3:
                    System.out.println("☻ ☻ ☻ ☻");
                    System.out.println("☻ ☻ ☻ ☻");
                    System.out.println("☻ ☻ ☻ ☻");
                    System.out.println("☻ ☻ ☻ ☻");
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Khong co dau");
            }
        }
    }
}
