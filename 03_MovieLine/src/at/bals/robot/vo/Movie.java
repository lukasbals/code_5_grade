package at.bals.robot.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	private int id;
	private int year;
	private int runtime;
	private String title;
	private String country;
	private String director;
	private String actors;
	private String poster;
	private String rated;
	private String plot;
	private String genre;
	private String language;

	public Movie() {

	}

	public Movie(int id, int year, int runtime, String title, String country,
			String director, String actors, String poster, String rated,
			String plot, String genre, String language) {
		super();
		this.id = id;
		this.year = year;
		this.runtime = runtime;
		this.title = title;
		this.country = country;
		this.director = director;
		this.actors = actors;
		this.poster = poster;
		this.rated = rated;
		this.plot = plot;
		this.genre = genre;
		this.language = language;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
