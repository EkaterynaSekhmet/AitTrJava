public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Урок 35: украшения на складе");
        System.out.println();

        Jewelry myJewelry1 = new Jewelry();
        myJewelry1.type = "ring";
        myJewelry1.stone = "diamond";
        myJewelry1.year = 2023;
        myJewelry1.quantity = 1;

        Jewelry myJewelry2 = new Jewelry();
        myJewelry2.type = "earrings";
        myJewelry2.stone = "emerald";
        myJewelry2.year = 2022;
        myJewelry2.quantity = 2;

        Jewelry myJewelry3 = new Jewelry();
        myJewelry3.type = "bracelet";
        myJewelry3.stone = "pearl";
        myJewelry3.year = 2021;
        myJewelry2.quantity = 4;

        System.out.println(myJewelry1.toString());
        System.out.println(myJewelry2.toString());
        System.out.println(myJewelry3.toString());
        System.out.println();

        System.out.println(myJewelry1.onStock(1));
        System.out.println(myJewelry2.onStock(2));
        System.out.println(myJewelry3.onStock(4));
        System.out.println();

        System.out.println(myJewelry1.getYear());
        System.out.println(myJewelry2.getYear());
        System.out.println(myJewelry3.getYear());
    }
}