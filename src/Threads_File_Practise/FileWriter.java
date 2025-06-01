package Threads_File_Practise;

import file.FileUtility;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements Runnable {
    public static enum Write_Type{
        IO,NIO
    }
    private final String fileName;
    private final int count;
    private final String message;
    private final Write_Type write_type;
    public FileWriter(String message,String fileName,Write_Type write_type,int count){
        this.fileName=fileName;
        this.count=count;
        this.message=message;
        this.write_type=write_type;
    }
    @Override
    public void run()  {
        if(write_type==Write_Type.IO){
            writeByIO();
        }
        else if(write_type==Write_Type.NIO){
            writeByNIO();
        }
    }
    private  void writeByNIO()  {
        try{
            for(int i=0;i<count;i++){
                FileUtility.writeTextToFile(message,fileName);
            }
        }
        catch(IOException exc){
            exc.printStackTrace();
            throw new RuntimeException();
        }

    }
    private void writeByIO()  {
        try(BufferedWriter bw=new BufferedWriter(new java.io.FileWriter(fileName))){
            for(int i=0;i<count;i++){
                bw.write(message);
                bw.newLine();
            }
        }
        catch(IOException exc){
            exc.printStackTrace();
            throw new RuntimeException();
        }
    }
}
