package database;

import shared.util.PostgresUserPasswords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Base data access object to connect to database
 *
 * @author Kutaiba N Kashmar
 * @version 1.0
 */
public class BaseDAO
{
  protected Connection getConnection() throws SQLException
  {
    Connection result = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres?currentSchema=personal_project",
        "postgres", PostgresUserPasswords.KUTAIBA);
    result.setAutoCommit(false);
    return result;
  }
}
