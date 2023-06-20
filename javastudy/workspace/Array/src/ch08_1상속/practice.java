package ch08_1상속;

class Car {
    int speed;
    int id;

    void accelate() {
        speed++;
    }
}
class SportsCar extends Car { //Car을 상속받음
    void drive() {
        System.out.println("drive");
    }
}
public class practice {

}
