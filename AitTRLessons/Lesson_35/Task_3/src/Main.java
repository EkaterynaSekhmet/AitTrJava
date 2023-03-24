public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 3 (*) Создать класс Bus (автобус) - с полями номер маршрута, вместимость, " +
                "скорость на маршруте, длина маршрута. Реализовать для него методы go, stop, speedUp, speedDown");
        System.out.println();

        Bus myBus = new Bus();

        myBus.routeNumber = 7;
        myBus.capacity = 40;
        myBus.optimalSpeed = 60;
        myBus.maximalSpeed = 120;
        myBus.routeLength = 20;

        myBus.go();
        myBus.stop();
        myBus.speedUp(5);
        myBus.speedDown(125);


    }
}