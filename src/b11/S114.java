package b11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class S114 {
    private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
    private static final String USER = "hr";
    private static final String PASSWORD = "hr";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //getConnection è statico
            System.out.println("Connected as " + conn.getSchema()); //l'informazione ci arriva da Oracle 8abbiamo stabilito la connessione, il programma java legge dati che vengono da oracle)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
