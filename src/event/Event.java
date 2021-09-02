package event;
import java.sql.*;

public class Event {
      
    public static void main(String[] args) throws Exception {
           
        
        //Connection conn1=null;
         
        try {
            //conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
            home h=new home(); 
            h.setVisible(true);
            
        }
        catch (Exception e) {
                e.printStackTrace();
            }

    }
    
}
