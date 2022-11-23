import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayıyi giriniz: ");
        int a=input.nextInt();
        System.out.print("2. sayıyi giriniz: ");
        int b=input.nextInt();
        int ebob=1;
            int i=1;
            while (i<=a && i<=b){
                if (a%i==0 && b%i==0)
                    ebob=i;
                i++;
            }
        System.out.println("--------------------------------------------");
        System.out.println("Ebob Değeri: "+ebob);
        System.out.println("--------------------------------------------");
        int ekok=a*b/ebob;
        System.out.println("Ekok Değeri: "+ekok);
    }
}
