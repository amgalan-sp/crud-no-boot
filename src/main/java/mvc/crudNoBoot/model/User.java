package mvc.crudNoBoot.model;

public class User {
    private int id;
    private String name;
    private String lastame;
    private int age;

    public User() {
    }

    public User(String name, String lastame, int age) {
        this.name = name;
        this.lastame = lastame;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastame() {
        return lastame;
    }

    public void setLastame(String lastame) {
        this.lastame = lastame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastame='" + lastame + '\'' +
                ", age=" + age +
                '}';
    }
}