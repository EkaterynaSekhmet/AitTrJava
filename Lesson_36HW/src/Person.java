public class Person {
    String name;
    String dateOfBirth;
    String city;

    public Person(String name, String dateOfBirth, String city) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
    }
    public String cityOfBirth (){

        System.out.print("Место рождения: ");
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

