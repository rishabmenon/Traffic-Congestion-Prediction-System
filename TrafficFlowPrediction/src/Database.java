/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author m
 */
import java.sql.*;
import java.util.*;


public class Database  {

  	private static String  jdbcDriver = "";
  	private static String  dbURL = "";
	private static String  username = "";
	private static String  password = "";

	private Connection connection;


  	public Database() throws SQLException, ClassNotFoundException
  	{

		  jdbcDriver  = "com.mysql.jdbc.Driver";
                  // jdbcDriver = "oracle.jdbc.driver.OracleDriver";

		  dbURL = "jdbc:mysql://localhost:3306/trafficforecast" ;
                  //dbURL= "jdbc:oracle:thin:@//server.local:1521/employee";
		  username = "root";
		  password = "root";




    	         Class.forName(jdbcDriver); //set Java database connectivity driver

    	         connection = DriverManager.getConnection(dbURL, username, password);

	}

	public ResultSet executeQuery(String query)throws SQLException
	{
	    PreparedStatement st  = connection.prepareStatement(query);
	    return st.executeQuery();
	}

	public int executeUpdate(String statement)throws SQLException
	{
		PreparedStatement st  = connection.prepareStatement(statement);

	    return st.executeUpdate();
	}

	public void close()
	{
		try
	    {
			connection.close();
		}
	    catch (SQLException sqlException)
	    {
			sqlException.printStackTrace();
	    	connection = null;
	    }
	}
	protected void finalize()
	{
		close();
	}
}

