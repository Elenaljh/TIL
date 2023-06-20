package ch08_1상속;

class Car extends Object{ //모든 클래스는 Object로부터 상속받는다.
    int speed;
    int id = 10;

    @Override //오버라이드 선언! - Object에게서 상속받은 toString의 내용 바꿈
    public String toString() {
        return "car [speed=" + speed + ", id=" + id + "]";
    } //override

    void accelerate() {
        speed++;
    }

    public Car() {} //SportsCar의 super()때문에 꼭 써줘야 한다.

    public Car(int speed, int id) {
        this.speed = speed;
        this.id = id;
    }

}
class SportsCar extends Car { //Car을 상속받음
    int id = 20;
    void drive() {
        System.out.println("drive");
    }
    void printId() {
        System.out.println("this.id = "+ this.id + ", super.id =" + super.id + ", this.speed = " + this.speed);
    }
    @Override
    void accelerate() {speed += 2;}

    public SportsCar(int speed, int id, int gear) {
        super(); //Car의 기본생성자: public Car(){}만을 원함.
        this.speed = speed;
        this.id = id;
    }
}
public class practice {

    public static void main(String[] args) {
        SportsCar car = new SportsCar(1, 2, 3);
        car.printId();
    }

}
