package Model.hw06;

public class Customer {
    public String name;
    public Sex sex;
    public Date birthday;
    public String phone;

    public Customer(String name, Sex sex, Date birthday, String phone) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Sex: " + sex + ", Birthday: " + birthday + ", Phone: " + phone;
    }
}
