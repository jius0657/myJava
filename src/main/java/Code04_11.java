import java.util.Scanner; //키보드 입력을 받기 위한 Scanner 클래스

public class Code04_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //키보드 입력 객체 생성, System.in은 키보드 입력을 의미
        String var1, var2; //첫번쨰, 두번째 문자열을 저장할 변수
        int diff; //문자열 길이 차이를 저장할 변수

        System.out.print("첫 번쨰 문자열 ==> "); //첫번쨰 문자열 입력 안내
        var1 = s.nextLine(); //첫번째 문자열 입력받기
        System.out.print("두 번쨰 문자열 ==> "); //두번쨰 문자열 입력 안내
        var2 = s.nextLine(); //두번째 문자열 입력받기

        diff = var1.length() -var2.length(); //두 문자열의 길이 차이 계산
        System.out.println("두 문자열 길이의 차이는 " + diff + "입니다."); //결과
        s.close(); //Scanner 종료
    }
}
