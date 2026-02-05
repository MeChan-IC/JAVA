import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        int i = 1;
        do
            System.out.println(i + ". " + "Hello World");
        while(i>number);
    }
}