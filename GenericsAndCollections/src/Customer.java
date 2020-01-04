import java.util.Objects;

/**
 * Created by Elimane on Jan, 2020, at 22:46
 */
public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;

        if(this.name == ((Customer)o).name)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return 11 * age + 13 * name.hashCode();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}