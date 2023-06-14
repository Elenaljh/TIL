package 이것이자바다_ch1_ch2;

public class Ch2 {
    public static void main(String[] args){
        // 정수 리터럴: 모두 10진수로 출력됨
        System.out.println("이진수: "+0b1011);
        System.out.println("8진수: "+0206);
        System.out.println("10진수: "+365);
        System.out.println("16진수: "+0xB3);

        // char타입도 정수타입이다
        char var1 = 'A';
        char var2 = 65;
        System.out.printf("var1=%c, var2=%c\n",var1,var2);

        //형변환
        byte ByteValue1 = 10;
        int IntValue1 = ByteValue1;
        System.out.println(IntValue1);

        //Casting
        int intvar1 = 10;
        byte bytevar1 = (byte) intvar1;
        System.out.println(bytevar1);

        long longvar1 = 300;
        int intvar2 = (int) longvar1;
        System.out.println(intvar2);

        int intvar3 = 65;
        char charvar1 = (char) intvar3;
        System.out.println(charvar1);

        double doublevar1 = 3.14;
        int intvar4 = (int) doublevar1; //소수점 아래 숫자 날라감


    }
}
