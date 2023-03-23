public class Address extends Employee {

    private String address;

    public Address(String name, String email, int ID_num, String address) {
        super(name, email, ID_num);
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
