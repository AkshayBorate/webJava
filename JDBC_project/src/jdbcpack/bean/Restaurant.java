package jdbcpack.bean;

public class Restaurant {
     private int restaurantId ;
     private String name;
     private String cuisine;
     private int branchocunt;
     
     public Restaurant() {
    	 
     }

	public Restaurant(int restaurantId, String name, String cuisine, int branchocunt) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchocunt = branchocunt;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getBranchocunt() {
		return branchocunt;
	}

	public void setBranchocunt(int branchocunt) {
		this.branchocunt = branchocunt;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branchocunt="
				+ branchocunt + "]";
	}

     
     
}
