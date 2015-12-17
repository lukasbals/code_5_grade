package at.bals.robot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import at.bals.robot.vo.Movie;

public class RobotDao {
	private static final String ipAddress = "172.16.19.146";
	private static final String databaseName = "movieDB";
	private static final String userName = "lukas";
	private static final String password = "lukas";
	private Connection connection;

	/**
	 * Inserts one Task
	 * 
	 * @return
	 * @throws SQLException
	 */
	public void insertData(Movie movie) throws SQLException {
		if (this.connection == null || this.connection.isClosed()) {
			setConnection();
		}
		Statement stmt = this.connection.createStatement();
		System.out.println(movie.getTitle() + " : "+ movie.getYear());
		stmt.executeUpdate("insert into movieDB.movies (title, year) values ('"
				+ movie.getTitle() + "', '" + movie.getYear() + "');");
		stmt.close();
		connection.close();
	}

	/**
	 * Sets a connection to the database
	 */
	private void setConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://"
					+ ipAddress + "/" + databaseName + "?user=" + userName
					+ "&password=" + password + "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
