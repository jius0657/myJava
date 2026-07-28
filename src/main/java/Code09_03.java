import java.util.Scanner;

public class Code09_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Scanner 객체 생성(cuz 키보드입력)
        int[] numAry = new int[4];
        //정수 4개를 저장할 수 있는 배열을 만듬
        int hap = 0;
        //초기화 값

        for (int i=0; i<=3; i++) {
            //for문
            System.out.print("숫자 : ");
            numAry[i] = s.nextInt();
            //i의 값이 계속 바뀌기 때문에 numAry[i]라고 씀
        }

        hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];
        System.out.println("합계 ==> " + hap);

        s.close();
    }
}

