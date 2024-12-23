package example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.bean.Restaurant;
import example.utils.JdbcUtils;

public class RestaurantDao implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> retriveAll() {

//	  This method connects to DB fetches all records converts them 
//	  into java objects of restaurent class , puts those objects into 
//	  same collection and return the collection

		Collection<Restaurant> allRestaurant = new ArrayList<Restaurant>();
		String sqlQuery = "select * from restaurant_master";

		try (Connection conn = JdbcUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);) {
			while (rs.next()) {
				int resaurantid = rs.getInt(1);
				String resaurantname = rs.getString(2);
				int branchcount = rs.getInt(4);
				String restcuise = rs.getString(3);

				Restaurant rst = new Restaurant(resaurantid, resaurantname, restcuise, branchcount);
				allRestaurant.add(rst);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return allRestaurant;
	}

	@Override
	public Restaurant retriveOne(Integer key) {
		Restaurant foundRestaurent = null;
		String sqlQuery = "Select * from restaurant_master where rest_id = ?";

		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sqlQuery)) {
			pstmt.setInt(1, key);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int resaurantid = rs.getInt(1);
				String resaurantname = rs.getString(2);
				int branchcount = rs.getInt(4);
				String restcuise = rs.getString(3);
				foundRestaurent = new Restaurant(resaurantid, resaurantname, restcuise, branchcount);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return foundRestaurent;

	}

	@Override
	public void create(Restaurant newRestaurent) {
		/*
		 * this method accept a restaurent object : new restaurent and strore it as a
		 * record in the Db table
		 */

		String query = "insert into restaurant_master values(?,?,?,?)";
		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
			// Extracting values from restaurent object : new Restarant
			// Using getter method
			int restId = newRestaurent.getRestaurantId();
			String restName = newRestaurent.getName();
			String restCuisine = newRestaurent.getCuisine();
			int restBranch = newRestaurent.getBranchocunt();

			// Substituting these values in place of ? using PreparedStatement
			pstmt.setInt(1, restId);
			pstmt.setString(2, restName);
			pstmt.setString(3, restCuisine);
			pstmt.setInt(4, restBranch);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + "record Insert");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void update(Restaurant modifiedRest) {
		/*
		 * This method recieves the modified state of the restarant object :modifiedRest
		 * and reflects that state into Db
		 */

		String query = "update restaurant_master set rest_name = ?,rest_cuisine = ?,rest_branch_count=? where rest_id = ?";

		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
			// Capturing the modified state of restarant object : modifiedRest
			// using getter

			int restId = modifiedRest.getRestaurantId();
			String restName = modifiedRest.getName();
			String restCuisine = modifiedRest.getCuisine();
			int restBranch = modifiedRest.getBranchocunt();

			// Substituting these values in place of ? using PreparedStatement
			pstmt.setInt(4, restId);
			pstmt.setString(1, restName);
			pstmt.setString(2, restCuisine);
			pstmt.setInt(3, restBranch);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + "record updated");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void delete(Integer key) {
		/*
		 * this method performs record deletion against identity
		 */
		
		String query = "delete from restaurant_master where rest_id = ?";
		try (Connection conn = JdbcUtils.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setInt(1, key);
			int delete = pstmt.executeUpdate();
			System.out.println(delete + "Record deleted");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
