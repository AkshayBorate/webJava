package example.dao;

import java.util.Collection;

public interface DaoInterface<T,K> {
  // Retrive all records
	Collection<T> retriveAll();
	
	//Retrive one record based upon its identity
	T retriveOne(K key);
	
	//A method to insert a new record
	void create(T t);
	
	//Method obtain to update an existing record
	void update(T t); 
	
	//A method to delete an existing record
	void delete(K key);

}
