import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 15 == 0)
            System.out.println("3과 5의 배수 둘 다 만족합니다.");
        else if(n % 3 == 0)
            System.out.println("3의 배수입니다.");
        else if(n %5 == 0)
            System.out.println("5의 배수입니다.");
        sc.close();

    }
}
