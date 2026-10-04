package Phase2.Objects;

public class User {
    int id;
    String name;

    User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "User{id=" + id + ", name=" + name + "}";
    }
}
