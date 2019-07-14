package vp04.pantic.test3.App.web.dto;

import java.util.ArrayList;
import java.util.List;

import vp04.pantic.test3.App.model.Item;

public class ItemDTO {

	private long id;
	
	private String name;
	
	private double licitationPrice;
	
	private double salePrice;
	
	private boolean sold;	
	
	private List<LicitationDTO> licitations = new ArrayList<>();

	public ItemDTO() {
		super();
	}

	public ItemDTO(long id, String name, double licitationPrice, double salePrice, boolean sold) {
		super();
		this.id = id;
		this.name = name;
		this.licitationPrice = licitationPrice;
		this.salePrice = salePrice;
		this.sold = sold;
	}
	
	public ItemDTO(Item item) {
		this.id = item.getId();
		this.name = item.getName();
		this.licitationPrice = item.getLicitationPrice();
		this.salePrice = item.getSalePrice();
		this.sold = item.isSold();
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

	public List<LicitationDTO> getLicitations() {
		return licitations;
	}

	public void setLicitations(List<LicitationDTO> licitations) {
		this.licitations = licitations;
	}
	
	
	
}
