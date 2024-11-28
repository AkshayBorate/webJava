package jdbcpack;

import jdbcpack.bean.Restaurant;
import jdbcpack.dao.DaoInterface;
import jdbcpack.dao.RestaurantDao;

public class DeleteUsingDao {

	public static void main(String[] args) {
	
		DaoInterface<Restaurant, Integer> delRef = new RestaurantDao();
		delRef.delete(101);

	}

}
