
public class Main {
    /* Month-2
    Topics covered:
     1.Static object
     2.Stack overflow - object initiation in both main method and inside it
     example:Student field in Student class and Student object initiation in main
     3.Object array
     4.C# reflection topic similarity such as getClass().getName()
     5.Encapsulation-Allows you only to reach essential information not all information
     general using example is dtos
     Abstraction-Hides unnecessary details,focuses only to key things
     Encapsulation-Information hiding
     Abstraction-Implementation hiding
     6.getter and setter methods and templates (record style getter,builder setter or default)
     7.Builder pattern in setter method
     */
    public static void main(String[] args){
         Student[] s={
            new Student(),new Student(),new Student()
        };
         s[0].age=5;
         s[1].age=6;
         s[2].age=7;
         for(var item:s){
             System.out.println(item.age);
         }
         var st=new Student().setName("Murad").setSurname("Mammadzada");
        System.out.println(st.name()+st.surname());
    }

}
