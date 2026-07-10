import java.util.Scanner;

public class code03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 99;
        num = sc.nextInt();

        System.out.println( (num > 100) && (num < 200) );
        //&& : 그리고(and), 둘다 참이어야 참
        System.out.println( (num == 99) || (num == 100) );
        // || : 또는(or), 둘 중 하나만 참이어도 참
        System.out.println( ! (num == 100) );
        // ! : 부정(not), 참이면 거짓/거짓이면 참

        sc.close();

    }
}
