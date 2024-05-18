package daoServices;
import java.sql.*;
public class Test {
     public static void main(String[] args)
     {
         try{
             Connection c=DatabaseConnection.getInstance().getConnection();
             String sql="DELETE FROM demo.MEDICI M WHERE M.ID= ?";
             PreparedStatement del=c.prepareStatement(sql);
             del.setInt(1,1);
             del.executeUpdate();
         }
         catch(SQLException e)
         {
             System.out.println("nu merge");
         }
     }
}
