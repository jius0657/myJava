public class Code04_01 {
    public static void main(String[] args) {

        //변수 선언
        byte age = 127; //byte형의 최댓값(저장가능범위 : -128 ~ 127)
        short birth = 32767; //short형의 최댓값(저장가능범위 : -32768 ~ 32767)
        int money = 2147483647; //int형의 최댓값(저장가능범위 : -2147483648 ~ 2147483647)

        //첫번째 출력
        System.out.println((byte)(age + 1)); //127 + 1 하지만 byte는 최대 127까지만 저장가능하기 때문에 128은 저장 '불가능' 그래서 127 다음에는 -128로 돌아간다. 이것을 오버플로우(Overfolw)라고 함.
        //두번쨰 출력
        System.out.println((short)(birth + 1)); //32767 + 1 하지만 short도 최대 32767까지만 저장 가능
        //세번쨰 출력
        System.out.println((int)(money + 1)); //2147483647은 int의 최대값, 여기서 +1을 하면 2147483648이 되어야하지만 int는 저장할 수 없다.
    }
}

// age+1은 int형으로 계산되므로, byte로 다시 변환하기 위해 (byte)를 붙임

