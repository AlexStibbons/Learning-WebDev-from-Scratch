package vp04.pantic.test3.App.web.dto;

import vp04.pantic.test3.App.model.Licitation;

public class LicitationDTO {
	
	private long id;
	
	private double offer;
	
	private String firstName;
	
	private String lastName;
	
	private String jmbg;
	
	private ItemDTO item;

	public LicitationDTO() {
		super();
	}

	public LicitationDTO(long id, double offer, String firstName, String lastName, String jmbg, ItemDTO item) {
		super();
		this.id = id;
		this.offer = offer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jmbg = jmbg;
		this.item = item;
	}
	
	public LicitationDTO(Licitation licitation) {
		this.id = licitation.getId();
		this.offer = licitation.getOffer();
		this.firstName = licitation.getFirstName();
		this.lastName = licitation.getLastName();
		this.jmbg = licitation.getJmbg();
		this.item = new ItemDTO(licitation.getItem());
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

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}
	
	

}
