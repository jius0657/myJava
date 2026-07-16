public class Code04_15 {

    public static void main(String[] args) {

        String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요."; //여러 번 들어있는 문자열 저장 ex)처음

        System.out.println(str.indexOf("처음")); //"처음"이 처음 나타나는 위치 출력
        System.out.println(str.indexOf("처음")); //
        System.out.println(str.indexOf("처음", 4)); //4번쨰 위치부터 "처음" 검색

    }
}
///indexOf("문자열", 시작위치) : 지정한 위치부터 문자열을 검색하여 위치를 반환
//찾는 문자열이 없으면 -1을 반환
