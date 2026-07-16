public class Code04_05 {
    public static void main(String[] args) {
        System.out.println("200+300"); //" " 안에 있는 내용은 문자열, 문자열은 계산하지않고 그대로 출력
        System.out.println();
        // println은 값이나 문자열을 그대로 출력하고 줄을 바꿈

        System.out.printf("%d", 200+300); //%d는 정수(int)를 출력, 계산한 결과(500)를 정수 형태로 출력 (%d를 사용하여 계산 결과를 정수 형태로 출력)
        System.out.println(); //줄바꿈
        //printf는 %d, %f, %s 등의 서식 지정자를 사용하여 원하는 형식으로 출력
    }
}

