package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    static final String DB_URL = "jdbc:mysql://localhost:3306/hospital";
    static final String username = "root";
    static final String password = "admin";

    Connection connection;
    Statement statement; 

    public conn(){
    
            try{
                connection= DriverManager.getConnection(DB_URL, username, password);
                statement = connection.createStatement();

            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
