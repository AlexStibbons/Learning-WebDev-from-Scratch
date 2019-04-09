package vp04.pantic.test3.App.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(catalog="pantictest", name="licitation")
public class Licitation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private double offer;
	
	private String firstName;
	
	private String lastName;
	
	private String jmbg;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Item item;

	public Licitation() {
		super();
	}

	public Licitation(long id, double offer, String firstName, String lastName, String jmbg, Item item) {
		super();
		this.id = id;
		this.offer = offer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jmbg = jmbg;
		this.item = item;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
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

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
