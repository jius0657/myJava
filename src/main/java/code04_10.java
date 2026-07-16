public class code04_10 {
    public static void main(String[] args) {
        String str = "난생처음 자바"; //String은 문자열을 저장하는 자료형, "난생처음 자바"를 str 변수에 저장
        int len; //문자열의 길이를 저장하기 위한 정수 변수

        len = str.length(); //length()는 문자열의 길이(문자개수)를 반환, 반환된 값을 len에 저장

        System.out.println("문자열 : " + str); //문자열과 str에 저장된 값을 함께 출력
        System.out.println("문자열 길이: " + len); //length()로 구한 문자열의 길이를 출력
    }
}

//length()는 문자열의 길이(공백 포함)를 구하여 int형으로 반환하는 메서드
