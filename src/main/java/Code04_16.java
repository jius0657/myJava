public class Code04_16 {

    public static void main(String[] args) {

        String str = "Java"; //문자열 저장

        System.out.println(str.charAt(0)); //0번쨰 문자 출력
        System.out.println(str.charAt(1)); //1번쨰
        System.out.println(str.charAt(2)); //2
        System.out.println(str.charAt(3)); //3
        System.out.println(str.charAt(4)); //존재하지 않는 인덱스라 오류 발생

    }
}
//charAt()은 문자열에서 원하는 위치의 문자 1개를 가져오는 메서드
//인덱스는 0부터 시작, 존재하지 않는 위치를 지정하면 오류가 발생
