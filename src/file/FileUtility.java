package file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtility {
    public static void writeTextToFile(String message) throws IOException {
        Path path = Paths.get("myfile.txt");
        try {
            //First step
            Files.write(path, message.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE_NEW);
        } catch (Exception e) {
            //Next steps
            //Files.write(path,message.getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE);
            //write adds from start and changes previous one

            //Append helps us to write to the end of the file
            Files.write(path, message.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        }
    }
    public static void writeImageToFile() throws IOException {
        byte[] bytes=Files.readAllBytes(Paths.get("windows.png"));
        Path path = Paths.get("copy.png");
            //Create is alternative form of Create_New
            Files.write(path,bytes, StandardOpenOption.CREATE);
        //we can add string image path and destination path
    }
    //IO-Input output Stream-blocks th processes
    //NIO-Nonblocking Input output stream
    //Files Path StandartOpenOption all of them comes from the nio
    public static void readTextFile() throws IOException {
        byte[] bytes=Files.readAllBytes(Paths.get("myfile.txt"));
        String text=new String(bytes,StandardCharsets.UTF_8);
        System.out.println(text);
    }
    public static void writeObjectToFile() throws IOException {
//        ObjectOutputStream oos=null;
//        try{
//           Person p=new Person();
//           p.setName("Murad");
//           p.setSurname("Mammadzada");
//            FileOutputStream fos=new FileOutputStream("person");
//            oos=new ObjectOutputStream(fos);//writes object to file
//            oos.writeObject(p);
//            oos.flush();
//        }catch(Exception ex){
//
//        }
//        finally {
//            oos.close();
//        }
        //First one is the alternative
        //Now we will use c# using alternative with try-resource
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person"))){
            Person p=new Person();
            p.setName("Murad");
            p.setSurname("Mammadzada");
            p.setPassword("1234");
            oos.writeObject(p);
            oos.flush();
        }
    }
    public static void readObject() throws Exception {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("person"))){
            Object o=ois.readObject();
            Person p=(Person)o;
            System.out.println(p.toString());
        }
    }
    //OutputStream-I am outside,put something inside the file
    //write functionality
    //InputStream-I am inside,put something to out
    //Implementation of Serializable is essential for file operations
    //public static final Long serialVersionUID=1L;
    //HELPS US TO PREVENT EXCEPTIONS IF WE HAVE DIFFERENCE BETWEEN WRITE AND READ
    //Helps us to prevent exceptions if we have difference between read and write
    //transient keyword prevents things to write file
}
