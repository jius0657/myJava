public class Exam01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            int star = i;

            if (i > 4) {
                star = 8 - i;
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
