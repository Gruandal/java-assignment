package Model.hw04;

public class Customer {
    protected String surname;
    protected String phone;
    protected Title title;

    public Customer(String surname, String phone, Title title) {
        this.setSurname(surname);
        this.setPhone(phone);
        this.setTitle(title);
    }

    public Customer(String surname, String phone) {
        this(surname, phone, Title.MR);
    }

    public Customer(String surname) {
        this(surname, "", Title.MR);
    }

    public Customer() {
        this("", "", Title.MR);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}