package file;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID=1L;
    private String name;
    private String surname;
    private transient String password;

    public String password() {
        return password;
    }

    public Person setPassword(String password) {
        this.password = password;
        return this;
    }

    public String name() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String surname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+password;
    }
}
