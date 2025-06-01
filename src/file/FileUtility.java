package file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtility {
    public static void writeTextToFile(String message,String filename) throws IOException {
        Path path = Paths.get(filename);
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
    public static void writeObjectToFile(Object obj,String objectFile) throws IOException {
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
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(objectFile))){
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        }
    }
    public static Object readObject(String objectFile) throws Exception {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(objectFile))){
            Object o=ois.readObject();
           return o;
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
    public static void writeTextToFileIO_1(String text) throws Exception{
        try(FileOutputStream fos=new FileOutputStream("myfile1.txt")){
               fos.write(text.getBytes(StandardCharsets.UTF_8));
        }
    }
    public static void writeImageToFileIO_1(String image) throws Exception{
        try(FileOutputStream fos=new FileOutputStream("myimage.png")){
            byte[] imageBytes=Files.readAllBytes(Paths.get(image));
            fos.write(imageBytes);
        }
    }
    public static void writeToFileIO_2(String text) throws Exception{
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("myfile2.txt"))){
            bw.write(text);
            bw.newLine();
            //bw.flush(); flush comes before close
        }
    }

    public static void readFromTextFile(String fileName) throws Exception{
        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
    }
    public static void readFromTextFileBytes(String fileName) throws Exception{
        try(FileReader fr=new FileReader(fileName)){
            int charByte;
            while((charByte=fr.read())!=-1){
                System.out.println((char)charByte);
            }
        }
        //this variation helps us to read also from images ,
        //if we remove casting on charbyte
        //we can easily read images with this method
    }
}
