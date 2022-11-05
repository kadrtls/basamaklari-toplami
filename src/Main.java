import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total= 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int number= scanner.nextInt();
        while (number!=0){
            total+=number % 10;
            number/=10;
        }
        System.out.println("basamakların toplamı:"+total);
    }
}