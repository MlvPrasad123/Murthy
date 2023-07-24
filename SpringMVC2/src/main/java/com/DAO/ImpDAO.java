package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

//import javax.activation.DataSource;

import com.mvc.User;

public class ImpDAO  implements AppDAO{
	
	private DataSource datasource;
	
	public ImpDAO(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
	@Override
	public List<User> users() 
	{
		List<User> l2=new ArrayList();
		String SQL="select * from users";
		Connection conn=null;
		try {
			conn=datasource.getConnection();
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			System.out.println(rs);
			
			while(rs.next())
			{
				User u1=new User(rs.getInt(1), rs.getString(2), rs.getString(3));
				l2.add(u1);
			}
			rs.close();
			ps.close();
			return l2;
			
	
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally
		
		{}
	
	}

}
