package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // marks this class as an entity
@Table(name = "Actor_Master")
public class Actor {
	@Id
	@Column(name = "actor_id", length = 4)

	private String actorId;
	@Column(name = "actor_fname", length = 20)
	private String firstName;
	@Column(name = "actor_lname", length = 20)
	private String lastName;
	@Column(name = "age")
	private int age;

	public Actor() {
// TODO Auto-generated constructor stub
	}

	public Actor(String actorId, String firstName, String lastName, int age) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}

}