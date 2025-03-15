import file.FileUtility;

import java.io.IOException;

public class Main {
    //Month-4

    //Finished

    //Not-Finished

    //region Lesson-25.1,25.2,25.3,25.4
    /*
        1.Enums
        enum also is class
        enum elements are static final and same with the class(enum) type
        enums have methods,constructors
        2. values(),valueOf() method of enum extra ordinal()
        3.UNKNOWN enum element generally carries null
        4.In order to create enum class,we  extend Enum<>
        5.Enums useful for exceptions
        6.C# enums is not rich such as java
        7.Look file notes on FileUtility
        8.Java does not allow classes inside a package to import or access types (classes, enums, interfaces)
         from the default package.
     */
    //endregion
    //region Lesson-26.1,26.2,26.3,26.4,26.4,26.5,26.6,26.7
    /*

     */
    //endregion
    //region Lesson-27.1,27.2
    /*

     */
    //endregion
    //region Lesson-28.1,28.2,28.3
    /*

     */
    //endregion
    //region Lesson-29.1,29.2,29.3
    /*

     */
    //endregion
    //region Lesson-30.1,30.2
    /*

     */
    //endregion
    //region Lesson-31.1,31.2,31.3,31.4
    /*

     */
    //endregion
    //region Lesson-32.1,32.2
    /*

     */
    //endregion

//    public static void main(String[] args)  {
//        Actions act=Actions.Delete;
//        ActionsEnum enm=ActionsEnum.DELETE;
//        var values=Numbers.values();
//        for(var item:values){
//            System.out.println(item);
//        }
//        System.out.println(Numbers.valueOf("Positive").text);
//    }
    public static void main(String[] args) throws Exception {
//        FileUtility.writeTextToFile("I am coming for you");
//        FileUtility.writeImageToFile();
//        FileUtility.readTextFile();
        FileUtility.writeObjectToFile();
        FileUtility.readObject();
    }
}

