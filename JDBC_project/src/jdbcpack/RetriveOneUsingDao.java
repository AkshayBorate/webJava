package jdbcpack;

import java.util.Scanner;

import jdbcpack.bean.Restaurant;
import jdbcpack.dao.DaoInterface;
import jdbcpack.dao.RestaurantDao;

public class RetriveOneUsingDao {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rest Id to get deatails");
		int id = sc.nextInt();
		DaoInterface<Restaurant, Integer> oneRef = new RestaurantDao();
		Restaurant restobj = oneRef.retriveOne(id);
		if(restobj !=null) {
			System.out.println(restobj);
		}else {
			System.out.println("Given Id is not exits");
		}
	}

}
