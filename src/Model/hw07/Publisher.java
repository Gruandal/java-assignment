package Model.hw07;

public class Publisher {
    public String corp;
    public String address;

    public Publisher(String corp, String address) {
        this.corp = corp;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "corp='" + corp + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}