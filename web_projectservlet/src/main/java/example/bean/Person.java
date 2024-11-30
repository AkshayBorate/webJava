package example.bean;

public class Person {
	private String name;
	private int age;
	private float weight;

	public Person() {
		System.out.println("inside Person()");
	}

	public String getName() {
		System.out.println("Getting the name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting the name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
