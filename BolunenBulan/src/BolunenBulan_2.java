import java.util.Scanner;

public class BolunenBulan_2 {
    public static void main(String[] args) {
        //variables
        int number, divisor = 2;
        Scanner input = new Scanner(System.in);

        System.out.print("0'dan hangi sayıya kadar olan çift sayıları istiyorsunuz: ");
        number = input.nextInt();

        System.out.println("\n0'dan "+ number + " sayısına kadar olan çift sayılar:");

        for(int i = 0; i < number; i++){
            if (i % divisor == 0)
                System.out.print(i + ", ");
        }
    }
}
