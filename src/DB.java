import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB {

      public static List<Student> getStudents()  {
          List<Student> data=new ArrayList<>();
          try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learning?user=root&password=server.11")){
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery("Select * From Students");
              while(resultSet.next()){
                  Student std=new Student(
                          resultSet.getString("Name"),
                          resultSet.getString("Surname"),
                          resultSet.getInt("Age"));
                  data.add(std);
              }
          }
          catch(Exception ex){
              ex.printStackTrace();
          }
          return data;
      }
    public static Student getStudent(int id)  {
          Student std=null;
          try(  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learning?user=root&password=server.11")){
              String sql="Select * From Students Where id=?";
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
              preparedStatement.setInt(1,id);
              ResultSet resultSet = preparedStatement.executeQuery();
              if(resultSet.next()){
                  std=new Student(
                          resultSet.getString("Name"),
                          resultSet.getString("Surname"),
                          resultSet.getInt("Age"));
              }
          }catch(Exception ex){
              ex.printStackTrace();
          }
          return std;
    }
    public static boolean addStudent(Student student){
          int result=0;
          try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learning?user=root&password=server.11")){
              String sql = "INSERT INTO Students (`Name`, `Surname`, `Age`) VALUES (?, ?, ?)";
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
              preparedStatement.setString(1,student.getName());
              preparedStatement.setString(2,student.getSurname());
              preparedStatement.setInt(3,student.getAge());

              result=preparedStatement.executeUpdate();
          }
          catch(Exception ex){
              ex.printStackTrace();
          }
          return result!=0;
    }
    public static boolean updateStudentAge(int id,int age){
        boolean result=false;
        try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learning?user=root&password=server.11")){
            String sql = "UPDATE Students SET Age =? WHERE ID =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,age);
            preparedStatement.setInt(2,id);
            result=preparedStatement.execute();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
