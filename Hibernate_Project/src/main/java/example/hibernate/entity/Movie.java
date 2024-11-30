package example.hibernate.entity;

public class Movie {
	private String movieId;
	private String title;
	private String genre;
	private int year;
public Movie() {
	
}
public Movie(String movieId, String title, String genre, int year) {
	super();
	this.movieId = movieId;
	this.title = title;
	this.genre = genre;
	this.year = year;
}
public String getMovieId() {
	return movieId;
}
public void setMovieId(String movieId) {
	this.movieId = movieId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", year=" + year + "]";
}

}
