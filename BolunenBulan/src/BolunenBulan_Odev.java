import java.util.Scanner;

public class BolunenBulan_Odev {
    public static void main(String[] args) {
        //variables
        int number, divisor = 3, divisor2 = 4, sum = 0, numberCount = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("0'dan HANGİ SAYIYA KADAR olan " + divisor + " ve " + divisor2 + " sayılarına tam bölünen sayıların ortalamasını istiyorsunuz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++){
            if(i % divisor == 0 || i % divisor2 == 0){
                sum += i;
                numberCount++;
            }
        }

        average = (double)sum / numberCount;
        System.out.println("Tam bölünen sayıların ortalaması = " + average);
    }
}
