public  class Student extends Person {
    static{
        System.out.println("Hello");
    }
    University uni;//has a relationship composition
    @Override
    public void Hi(){
        System.out.println("Hi Student");
    }

    public Student(){

    }

    public Student(int a){
         this();
    }
    public Student(int a,int b){
        this(a);
    }
    public Student(String a,int b){
        super(a,b);
    }

    public void koo(){
        System.out.println(1);
    }


}
