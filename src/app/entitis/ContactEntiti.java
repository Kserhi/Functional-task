package app.entitis;

public class ContactEntiti {
    private String name;
    private String nomer;

    public ContactEntiti(String name, String nomer) {
        this.name = name;
        this.nomer = nomer;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", nomer='" + nomer + '\'' +
                '}';
    }
}
