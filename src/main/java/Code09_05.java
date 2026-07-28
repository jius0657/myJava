public class Code09_05 {

    public static void main(String[] args) {

        int ary[] = {10, 20, 30, 40, 50};
        int count, size;
        //count: 칸 개수를 저장할 변수, size: 배열의 전체 크기를 저장할 변수

        count = ary.length;
        //length: 배열의 칸 개수를 알려주는 기능(즉 배열의 값이 5개이기 때문에 count = 5가 됨)
        size = count * Integer.BYTES;
        //Integer.BYTES = 4(int형 하나가 사용하는 메모리크기가 4byte기 때문에)
        //size = 5 * 4

        System.out.println("배열 ary[]의 요소 개수 : " + count);
        //배열의 요수 개수 = 배열 칸의 개수(문자열이 하나라고 있으면 더하기를 하지않음, 문자열을 이어 붙임)
        System.out.println("배열 ary[]의 요소 전체 크기 : " + size);
    }
}