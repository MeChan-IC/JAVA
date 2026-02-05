import java.text.NumberFormat;
import java.util.Scanner;
public class Main{
    public static void main(){
        final byte monthsInYear = 12;
        final byte percent = 100;

        int P = 0;
        float monthlyInterest = 0F;
        int totalTimeInMonths = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Principal:- ");
            P = sc.nextInt();
            if(P>= 1000 && P <= 1_000_000)
                break;
            System.out.println("Enter Valid Input Between ₹1K to ₹1M");
        }

        while(true) {
            System.out.print("Annual Interest Rate:- ");
            float annualInterest = sc.nextFloat();
            if(annualInterest>=1 && annualInterest<=30){
                monthlyInterest = annualInterest / percent / monthsInYear;
                break;
            }
            System.out.println("Enter Valid Input Between 1% to 30%");
        }

        while(true) {
            System.out.print("Time Period (Years):- ");
            byte n = sc.nextByte();
            if(n>=1 && n<=30 ) {
                totalTimeInMonths =  n * monthsInYear;
                break;
            }
            System.out.println("Enter Valid Input Between 1 to 30 years");
        }


        double mortgage = P * ((monthlyInterest * Math.pow((1+monthlyInterest),totalTimeInMonths)) / (Math.pow((1+monthlyInterest),totalTimeInMonths)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}