public class Bus {

    public int routeNumber;
    public int capacity;
    public int optimalSpeed;
    public int maximalSpeed;
    public int routeLength;

    public void go () {
            System.out.println("Едем!");
    }
    public void stop () {
        System.out.println("Стоим!");
    }
    public void speedUp (int speed){
        if (speed <=15)
            System.out.println("Ускоряемся!");
    }
    public void speedDown (int speed1){
        if (speed1 >= maximalSpeed)
            System.out.println("Снижаем скорость!");
    }
}
