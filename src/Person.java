public  class Person  {
    private String name;
     private int age;
    public static final int MY_VARIABLE=5;
    public void boo(){
        System.out.println(1);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
    public void Hi(){
        System.out.println("Hi Person");
    }

    public Person(){
        System.out.println("Person ctor");
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return String.format("name:%s, age:%d",name,age);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        }
        else{
            return false;
        }
    }
}
