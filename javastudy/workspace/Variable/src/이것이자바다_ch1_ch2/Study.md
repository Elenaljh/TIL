# Ch2 변수와 타입
## 1. 변수 선언
- 변수: 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
  - 변수에 최초로 값이 대입될 때 메모리에 할당되고 해당 메모리에 값 저장
  - 변수 초기화: 변수에 최초로 값을 할당하는 행위
- 변수이름
  - 첫번째 글자가 문자
  - 특수기호는 $, _
  - 소문자로 시작
- 클래스명: 대문자로 시작
## 2. 정수 타입
- 정수: byte(8bit), short(16bit), char(16bit), int(32bit), long(64bit)
  - 컴파일러는 정수 리터럴을 default로 int타입으로 인식
  - int타입 허용범위(+-2,147,483,647) 초과하면 뒤에 l, L을 붙여서 long타입 값이라고 표기해야함
- 정수의 2진수 표기에서 맨 앞의 bit는 부호bit임 (양수는 0, 음수는 1)
  - 최상위 bit가 1인 음수: 나머지 bit를 1의 보수로 바꾸고 1을 더한다음에 십진수로 바꾼다.
- 리터럴: 프로그래머가 직접 입력한 값
  - 정수 리터럴
    - 2진수: 0b, 0B로 시작
    - 8진수: 0으로 시작
    - 10진수
    - 16진수: 0x, 0X로 시작
  - 문자 리터럴: char타입 
    - 유니코드로 변환되어 저장됨
    - 유니코드가 정수이므로 char타입도 정수에 속함
    - `char c = ''`: 컴파일에러
    - `char c = ' '`:공백 하나를 포함해서 초기화
## 3. 실수 타입
- 실수: float(32bit), double(64bit)
  - double: float보다 약 2배 유효 자릿수(소수점 이하)
- 부동소수점 방식으로 메모리에 저장
  - 구조: 부호 + 가수 x 지수(exponent)
  - ex. `double x = 0.12E-2`: 0.12*10^(-2)
- 컴파일러는 실수를 default로 double로 해석
  - float 사용하고 싶다면 `float var = 3.14f`와 같이 리터럴 뒤에 접미사 붙여야함
## 4. 논리타입
## 5. 문자열타입
- 큰따옴표로 감싼다.
- 유니코드로 변환X
- 뭔가 출력이 제대로 안될 것 같다 싶은 문자열('나 ", 또는 줄바꿈한 문장 등)은 속편히 """(큰따옴표 3개)로 감싸면 된다
  - Java 13부터 지원함
  - 줄바꿈하지 않고 다음 줄에 이어서 작성하려면 맨 끝에 \ 붙임 (Java 14부터 가능)
## 6. 자동 타입 변환
- 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생
- byte < short < int < long < float < double
- char < int
- 메모리에서 값이 복사되는 모양

<img src = "https://t1.daumcdn.net/cfile/tistory/99A03C4E5AAE21F702">
- **예외: byte타입은 char타입으로 변환X (byte타입이 음수를 포함하기 때문)**

## 7. 강제 타입 변환 (Casting)
- 큰 타입을 작은 타입으로 쪼개서 강제로 변환하는 것
- 캐스팅 연산자: ()
  - ex. `작은 타입 = (작은 타입)큰 타입`
1. int -> byte
<img src = "https://t1.daumcdn.net/cfile/tistory/9903203F5AAE22E738">

   - +-128보다 큰 int값은 원래 값이 손상된다. 
2. long -> int
3. int -> char
4. 실수 -> 정수
  - 소수점 아래 숫자는 날라간다.

## 8. 연산식에서 자동 타입 변환
1. 정수: int 타입으로 자동변환
  - `int result` = `byte, char, short, int` 연산자 `byte, char, short, int`
  - 정수타입 연산시 결과값 변수는 int로 선언
  - **예외: long타입 연산 -> 결과도 long**
2. 실수
  - float끼리 계산: 결과 float
  - float(+정수형 전체)와 double 계산: 결과 double
3. +의 기능
  - 숫자 덧셈
  - 피연산자 중 하나가 문자열이면 나머지 피연산자도 문자열로 자동변환
    - `String str = 3 + 4 + "7"` -> `String str = 7 + "7"` -> `String str = "7" + "7"` => 결과: 77
  - 특정 부분 우선 연산: () 사용
## 9. 문자열을 기본 타입으로 변환
1. 문자열 -> 기본타입(숫자)
  - ex. String -> byte
  ```java
  String str = '10';
  byte value = Byte.parseByte(str)
  ```
  - 나머지도 다 비슷비슷하다. 위 코드의 둘째줄의 `byte` 자리에 원하는 타입을 쓰면 됨.
    - ex. `Short.parseShort(str)`, `Integer.parseInt(str)`, `Boolean.parseBoolean(str)` 등
2. 기본타입(숫자) -> 문자열
  - `String str = String.valueOf(숫자)`

## 10. print 종류
- print, println, printf

## 11. 입력받기
- 코테에서 사용됨
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("x 입력: ");
        String strX = scanner.nextline();
        int x = Integer.parseInt(strX);
    }
}
```