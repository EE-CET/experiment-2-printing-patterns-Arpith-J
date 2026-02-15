import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("* ");
            if(i==n)
                System.out.println();
        }
        for(int j = 1; j<=n; j++){
            System.out.println("*");
        }
    }
}

