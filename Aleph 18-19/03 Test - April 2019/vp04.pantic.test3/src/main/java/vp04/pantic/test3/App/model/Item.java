package vp04.pantic.test3.App.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(catalog="pantictest", name="item")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private double licitationPrice;
	
	private double salePrice;
	
	private boolean sold;
	
	@OneToMany(mappedBy="item", fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private Set<Licitation> licitations = new HashSet<Licitation>();

	public Item() {
		super();
	}

	public Item(long id, String name, double licitationPrice, double salePrice, boolean sold) {
		super();
		this.id = id;
		this.name = name;
		this.licitationPrice = licitationPrice;
		this.salePrice = salePrice;
		this.sold = sold;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLicitationPrice() {
		return licitationPrice;
	}

	public void setLicitationPrice(double licitationPrice) {
		this.licitationPrice = licitationPrice;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public Set<Licitation> getLicitations() {
		return licitations;
	}

	public void setLicitations(Set<Licitation> licitations) {
		this.licitations = licitations;
	}
	
	
	
	
}
