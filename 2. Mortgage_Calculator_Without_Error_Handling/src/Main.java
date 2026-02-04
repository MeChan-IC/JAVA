import java.text.NumberFormat;
import java.util.Scanner;
public class Main{
    public static void main(){
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principle:- ");
        int P = sc.nextInt();

        System.out.print("Annual Interest Rate:- ");
        float annualInterest = sc.nextFloat();
        float monthlyInterest = annualInterest / percent / monthsInYear;

        System.out.print("Time Period (Years):- ");
        byte n = sc.nextByte();
        int totalTimeInMonths = n * monthsInYear;

        double mortgage = P * ((monthlyInterest * Math.pow((1+monthlyInterest),totalTimeInMonths)) / (Math.pow((1+monthlyInterest),totalTimeInMonths)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}