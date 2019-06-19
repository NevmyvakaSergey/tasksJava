package vehicle.java.lesson_1;


class Vehicle {

    private int gears = 0;
    private double speed = 0.0;
    private boolean isOn;
    private int gear = 0;

   Vehicle(int gearCount) {
        gears = gearCount;
    }

    int getGear() {
        return gear;
    }

    void turnOn() {
        System.out.println("turned on!");
        isOn = true;
    }

    boolean turnOff(boolean forced) {

        if (gear != 0 && !forced) {
            return false;
        }

        isOn=false;

        return true;
    }

    void gearPlus() {
        if (gear < gears) {
            gear = gear + 1;
        }

    }

    void gearMinus() {
        if (gear > 0) {
            gear = gear - 1;
        }
    }
    void setSpeed(){//Мой код пока не разобрался
       if (isOn = true && gear > 1){
           speed =speed + 10;
       }
}
 }
//class Transmision {
    //String type;
    //int speeds;
    //Transmision(String type, int speeds);
//}

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Vehicle(3);


        car1.turnOn();
        car1.gearPlus();
        car1.gearPlus();
        car1.gearPlus();
        car1.gearPlus();
        car1.gearPlus();
        car1.gearPlus();
        car1.gearPlus();
        car1.setSpeed();

        System.out.println(car1.getGear());

        boolean result = car1.turnOff(true);
        System.out.println(result);
    }
}

// разобраться с гитхабом, сделать репозиторий, залить код
// коробка передач - класс. Инициализация машины с объектом - коробкой передач
// ускорение / замедление
