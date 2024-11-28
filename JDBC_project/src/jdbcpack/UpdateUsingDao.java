package jdbcpack;

import jdbcpack.bean.Restaurant;
import jdbcpack.dao.DaoInterface;
import jdbcpack.dao.RestaurantDao;

public class UpdateUsingDao {

	public static void main(String[] args) {
		  DaoInterface<Restaurant, Integer> daoRef = new RestaurantDao();
		  //obtaining the restaurent on which update is to be performed
		  
		  Restaurant rst = daoRef.retriveOne(104);
		  rst.setName("New Little Italy");
		  rst.setBranchocunt(20);
		  daoRef.update(rst);
//		  System.out.println();
		  
		  

	}

}
