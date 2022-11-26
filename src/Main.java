import transport.Car;
import transport.Truck;
import transport.Bus;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8", 2.5);
        Car bmw = new Car("BMW", "M2 Competition", 3.0);
        Car mercedes = new Car("Mercedes-Benz", "SLS AMG", 6.2);
        Car ferrari = new Car("Ferrari", "250 TR", 6.6);

        Truck man = new Truck("MAN", "TGS 6x6", 11.2);
        Truck iveco = new Truck("Iveco", "Turbostar 190.48", 12.1);
        Truck daf = new Truck("DAF", "MNS-390", 10.8);
        Truck scania = new Truck("Scania", "RK-907", 11.7);

        Bus ankai = new Bus("Ankai", "S-308", 8.1);
        Bus baw = new Bus("BAW", "JS-778", 7.2);
        Bus foton = new Bus("Foton", "HR 558", 8.6);
        Bus higer = new Bus("Higer", "FVN-367", 7.8);

        Driver robbyn =new  Driver("Афанасьев Робин Евгеньевич", 5);
        robbyn.addLicense("b");
        robbyn.setCurrentTransport(bmw);
        robbyn.startDriving();
        robbyn.stopDriving();
        robbyn.refillTransport();
    }
}