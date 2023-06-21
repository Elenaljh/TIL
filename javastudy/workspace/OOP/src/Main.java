public class Main {
    public static void main(String[] args) {
        gugudan1(2, 1);
    }

//    static void multiply(int a, int b) {
//        if (a < 10) {
//            System.out.printf("%d * %d = %d\n", a, b, a * b);
//            if (b < 9) {
//                b++;
//            } else {
//                System.out.println();
//                b = 1;
//                a++;
//            }
//            multiply(a, b);
//        }
//    }

    static void gugudan(int a, int b) {
        if (a > 9) return;
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        if (b < 9) {
            b++;
        } else {
            System.out.println();
            b = 1;
            a++;
        }
        gugudan(a, b);
    }

    static void gugudan1(int dan, int i) {
        if (dan == 10) return;
        if (i == 10) {
            System.out.println();
            gugudan(dan+1, 1);
            return;
        }
        System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        gugudan1(dan, i+1);
    }
}