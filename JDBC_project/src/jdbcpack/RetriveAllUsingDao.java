package jdbcpack;

import java.util.Collection;

import jdbcpack.bean.Restaurant;
import jdbcpack.dao.DaoInterface;
import jdbcpack.dao.RestaurantDao;

public class RetriveAllUsingDao {

	public static void main(String[] args) {
	  DaoInterface<Restaurant, Integer> daoRef = new RestaurantDao();
	  Collection<Restaurant> allAvailableRestaurant = daoRef.retriveAll();
	  for(Restaurant currentRestaurant : allAvailableRestaurant)
		  System.out.println(currentRestaurant);
	  
	  System.out.println("*******************************************************************");
	  
	  allAvailableRestaurant.stream().
	  forEach(rst->System.out.println(rst));

	}

}
