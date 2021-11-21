import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Muốn vay bao nhiêu? ");
        money = sc.nextDouble();
        System.out.println("Vay mấy tháng? ");
        month = sc.nextInt();

        double totalInterestRate = 500;
        for (int i = 0; i < month; i++) {
            totalInterestRate += money * (interestRate/100)/12 * month;
            System.out.println( "Cả gốc lẫn lãi là :" + totalInterestRate + " nhé. Liệu liệu mà trả tiền đê.");
        }
    }
}
