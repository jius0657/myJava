public class Code04_13 {

    public static void main(String[] args) {

        String str = "   한글  ABCD  efgh   "; //앞뒤 공백이 있는 문자열 저장
        String cutStr = ""; //공백 제거 후 문자열을 저장할 변수

        cutStr = str.trim(); //문자열의 앞뒤 공백 제거

        System.out.println("기존 문자열 ==> [" + str + "]"); //원래 문자열
        System.out.println("공백 제거 ==> [" + cutStr + "]"); //앞뒤 공백 제거 후

    }
}

////trim() : 문자열의 앞과 뒤에 있는 공백만 제거하는 메서드
///중간공백은 제거되지 않음
//(문자열 전체의 공백을 제거하려면 replaceAll() 메서드를 사용해야함)