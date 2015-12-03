package at.bals.robot.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	private int id;
	private String name;
	private int quantity;
	

	public Movie() {

	}

	public Movie(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
}