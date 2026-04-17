class Rabbit {
    String shape;
    int xPos;
    int yPos;

    Rabbit() {
        shape = "토끼";
    }

    Rabbit(String value) {
        shape = value;
    }

    void setposition (int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {
//        Rabbit rabbit1 = new Rabbit();
//        Rabbit rabbit2 = new Rabbit();
//        Rabbit rabbit3 = new Rabbit();
//
//        rabbit1.shape = "원";
//        rabbit2.shape = "삼각형";
//        rabbit3.shape = "토끼";

        Rabbit rabbit = new Rabbit();

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);

        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("삼각형");
        Rabbit rabbit3 = new Rabbit("토끼");

        System.out.printf("토끼1 객체의 모임은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객체의 모임은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객체의 모임은 [%s]입니다.\n", rabbit3.shape);

    }
}