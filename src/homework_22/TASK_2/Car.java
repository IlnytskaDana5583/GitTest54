package homework_22.TASK_2;

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Двигатель авто запущен");
    }

}

