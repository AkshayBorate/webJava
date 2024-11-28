package jdbcpack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collection;

import jdbcpack.bean.Restaurant;
import jdbcpack.utils.JdbcUtils;

public class AssignPrac implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> retriveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant retriveOne(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Restaurant rst) {
		String query = "insert into restaurant_master values(?,?,?,?)";
		
		try(Connection conn = JdbcUtils.getConnection();
				PreparedStatement ptmt = conn.prepareStatement(query)){
			
			   int restid = rst.getRestaurantId();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Restaurant t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		
	}

}
