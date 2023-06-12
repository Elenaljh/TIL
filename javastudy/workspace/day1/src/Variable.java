public class Variable {
    static long sta; // 전역변수
    public static void main(String[] args) {
        //main: 메서드(=함수)
        int score;
        score = 150;
        score = 220;
        System.out.println(score);

        char c = 'a'; //문자형은 문자 딱 1글자만 저장가능
        String s = "hello"; //문자열형은 문자 여러자 저장가능
        System.out.println(c+s);

        //명명규칙(naming convention)
            //예약어(true 등) 사용불가, 숫자시작X, 특수문자는 _와 $만
            //여러 단어 이름은 단어 첫글자 대문자: StringBuffer, LastIndexOf
            //클래스 이름의 첫글자는 항상 대문자
            //상수이름은 대문자, 단어는_로 구분 : MAX_NUMBER
        int x = 40; //일반적인 변수임: 변수-x, 리터럴-40
        final int MAX = 73; //final 붙이면 상수가 됨

        //리터럴과 접미사(l, f, d등)
        long sam = 3; //이러면 에러남
        long sam1 = 3L; //접미사 L(또는 l)을 붙여서 정수3을 long형으로 변환함
        float f = 3.14f;
        double d = 3.14d;

        //전역변수: main 메서드 밖에서 만든 변수 -

        //문자와 문자열
        System.out.println(""+7+7); //문자열 77로 출력
        System.out.println("8"+5); //문자열 + 다른타입 = 문자열 / 다른타입 + 문자열 = 문자열
        System.out.println("8"+5+3); // "85" + 3 -> "853"
        System.out.println(8+5+"3"); //13 + "3" -> 133

        //형변환(Casting)
            //boolean을 제외한 7개의 기본형은 서로 형변환 가능. char과 숫자형간 변환은 ASCII code를 통해 변환.
        int ai = 'A';
        System.out.println(ai); //65 출력
            //float -> int: 소수점 이하 숫자 버림.
    }
}
