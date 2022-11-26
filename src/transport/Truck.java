package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик "+super.getBrand()+" "+super.getModel()+" начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик "+super.getBrand()+" "+super.getModel()+" пректратил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик "+super.getBrand()+" "+super.getModel()+" сделал остановку");
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
        return "Грузовик "+super.getBrand()+" "+super.getModel()+" объем двигателя "+super.getEngineVolume()+" л.";
    }
}
