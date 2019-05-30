package com.java.gps;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class DB_Connection {
	public int DB_Connection(String vno, double lat, double lon, String time, float speed) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/gps";
		String user ="root";
		String pass ="";
		String sql ="insert into vehicledetail(Vehicle_no ,Latitude, Longitude, Time, Speed) values(?,?,?,?,?)";
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url, user, pass);
			PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
			st.setString(1, vno);
			st.setDouble(2, lat);
			st.setDouble(3, lon);
			st.setString(4, time);
			st.setFloat(5, speed);
			i = st.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return i;
	}

}
