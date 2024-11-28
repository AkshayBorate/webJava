package jdbcpack;

import jdbcpack.bean.Restaurant;
import jdbcpack.dao.DaoInterface;
import jdbcpack.dao.RestaurantDao;

public class CreateUsingDao {

	public static void main(String[] args) {
		  DaoInterface<Restaurant, Integer> daoRef = new RestaurantDao();
		  Restaurant rst = new Restaurant(106,"Maniland China","Chinese",5);
		  daoRef.create(rst);

	}

}
