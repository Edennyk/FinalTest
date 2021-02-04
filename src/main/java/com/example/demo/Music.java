package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music")
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id ")
	private int id;
	@Column(name="musicrecordtitle")
	private String title;
	@Column(name="singername")
	private String singername;
	@Column(name="companyreleased")
	private String companyreleased;
	@Column(name="releaseyear")
	private int releaseYear;
	@Column(name="language")
	private String language;
	@Column(name="price")
	private int price;

	public Music() {super();}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}

	public String getSingername() {return singername;}
	public void setSingername(String singername) {this.singername = singername;}

	public String getCompanyreleased() {return companyreleased;}
	public void setCompanyreleased(String companyreleased) {this.companyreleased = companyreleased;}

	public int getReleaseYear() {return releaseYear;}
	public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}

	public String getLanguage() {return language;}
	public void setLanguage(String language) {this.language = language;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
}
