package TryCatch.Chaining;

import java.sql.SQLException;

public class DatabaseUtils {
    public static void executeQuery(String sql) throws SQLException {
        throw new SQLException("syntax error!");
    }
}
