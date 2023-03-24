public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Урок 36");
        System.out.println();

        Person Person1 = new Person("David", "17.06.1965", "Barcelona");
        Person Person2 = new Person("Michela","02.12.1988","Rome");
        Person Person3 = new Person("Piter", "28.03.1992", "Munich");


        System.out.println(Person1.cityOfBirth());
        System.out.println(Person2.cityOfBirth());
        System.out.println(Person3.cityOfBirth());
    }


}