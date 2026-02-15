import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            System.out.print("* ");
            if(i==a)
                System.out.println();
        }
        for(int j = 1; j<=a; j++){
            System.out.println("*");
        }
    }
}

