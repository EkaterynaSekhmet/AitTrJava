public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 37 Зарплата");
        System.out.println();

    //    Employee emp1 = new Employee("Ivanov Petr","ivanov_p@mail.de",101) {
    //    };
        //   emp1.mailPaySlip();

        Salary s1 = new Salary("Ivanov Petr","ivanov_p@mail.de",101,60000);
        Salary s2 = new Salary("Петров Алексей", "petrov_a@mail.com", 102, 48000);

   //     System.out.println(s1);
   //     System.out.println(s2);
     //   s1.mailPaySlip();
     //   System.out.println();
     //   s2.mailPaySlip();
     //   System.out.println();
     //   s2.setSalary(54000);
     //   System.out.println();
     //   s2.mailPaySlip();

        Address a1 = new Address("Wolfgang Mozart","mozart_w@mail.de",103,"Salzburg, Getreidegasse Str., 29.");
        Address a2 = new Address("Richard Wagner","wagner_r@mail.de",104,"Leipzig, Georginig Str., 40.");

        System.out.println("Работник " + a1.getName() + " проживает по адресу: " + a1.getAddress());
        System.out.println("Работник " + a2.getName() + "проживает по адресу: " + a2.getAddress());


    }



}