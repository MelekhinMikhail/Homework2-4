package transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус "+super.getBrand()+" "+super.getModel()+" начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус "+super.getBrand()+" "+super.getModel()+" прекратил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус "+super.getBrand()+" "+super.getModel()+" сделал останувку");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время за круг: "+super.getBestLapTime());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: "+super.getMaxSpeed()+" км/ч");
    }


    @Override
    public String toString() {
        return "Автобус "+super.getBrand()+" "+super.getModel()+" объем двигателя "+super.getEngineVolume()+" л.";
    }
}
