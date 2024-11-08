package test;

public class  User {
    public User() {

    }
    public int id;
    public  String name;

    public User(int id){
        this.id=id;
    }
    public User(int id,String name){
        this(id);
        this.name=name;
    }

}
