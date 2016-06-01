import java.sql.*;

public class Database {

    private static Connection conn;
    private static PreparedStatement prpstmt;
    private static ResultSet rs;
    private static final String URL = "jdbc:mysql://46.101.100.122:3306/okanuzun_oyun";
    private static String query;
    private static final String DB_USER = "okanuzun_okan";
    private static final String DB_PASSWORD = "135Okan246";
    private static final int MYSQL_DUPLICATE_PK = 1062;

    public static void db_prpstmt_query() {
        try {
            conn = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            prpstmt = conn.prepareStatement(query);
            rs = prpstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error : " + e);

        }

    }

    public static void db_prpstmt_update() {
        try {
            conn = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            prpstmt = conn.prepareStatement(query);
        } catch (SQLException e) {
            System.out.println("Error : " + e);

        }

    }

    public static void close_prp_stmt() {
        try {
            prpstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        Database.rs = rs;
    }

    public static String getQuery() {
        return query;
    }

    public static void setQuery(String query) {
        Database.query = query;
    }

    public static PreparedStatement getPrpstmt() {
        return prpstmt;
    }

    public static void setPrpstmt(PreparedStatement prpstmt) {
        Database.prpstmt = prpstmt;
    }

}
