
package crudanime;

import java.sql.*;

public class KoneksiAnime {
    
    
    static final private String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final private String DB_URL = "jdbc:mysql://localhost:3306/koleksi";
    static final private String USER = "root";
    static final private String PASS = "";
    
    private Connection conn;
    
    public Connection getKoneksi(){
        if(conn == null){
            try{
                Class.forName(JDBC_DRIVER);
                System.out.println("Class driver ditemukan");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return conn;
    }
    
    
}
