package objectClass;

public class ToStringMethodDemo {

    private String id;
    private String name;

    @Override
    public String toString() {
        return "ToStringMethodDemo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
