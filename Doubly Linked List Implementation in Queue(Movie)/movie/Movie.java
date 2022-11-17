package queue.doublyLinkedList.movie;

import java.time.LocalDate;

public class Movie {
	private int movieId;
	private String movieName;
	private String actor;
	private String director;
	private LocalDate release_date;
	public Movie(int movieId, String movieName, String actor, String director, LocalDate release_date) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
		this.director = director;
		this.release_date = release_date;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public LocalDate getRelease_date() {
		return release_date;
	}
	public void setRelease_date(LocalDate release_date) {
		this.release_date = release_date;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + ", director=" + director
				+ ", release_date=" + release_date + "]\n";
	}
	
	
}
