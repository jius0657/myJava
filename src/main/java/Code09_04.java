public class Code09_04 {
    public static void main(String[] args) {
        int ary1[] = {100, 200, 300, 400};
        //자동으로 4칸짜리 배열생성(값이 4개기 때문에)
        int ary2[] = new int[] {100, 200, 300};
        //값이 3개기 때문에 3칸짜리 배열을 자동 생성
        int ary3[];
        ary3 = new int[] {100, 200};
        // 2칸짜리 배열 자동생성
        int[] ary4 = new int[1];
        ary4[0] =100;
        //1칸짜리 배열 생성에서 값을 100을 넣어줌

        for (int i = 0; i < 4; i++)
            System.out.printf("ary[%d]==>%d\t", i, ary1[i]);
        //[%d]: i가 들어가는 자리, %d: 배열의 값이 들어가는 자리
        System.out.println();

        for (int i = 0; i < 3; i++)
            System.out.printf("ary2[%d]==>%d\t", i, ary1[i]);
        System.out.println();

        for (int i = 0; i < 2; i++)
            System.out.printf("ary3[%d]==>%d\t", i, ary3[i]);
        System.out.println();

        for (int i = 0; i < 1; i++)
            System.out.printf("ary4[%d]\t", i, ary4[i]);
        System.out.println();
    }
}
