package vp04.pantic.test3.App.web.dto;

public class AddItemDTO {
	
	private String name;
	
	private double licitationPrice;
	
	private double salePrice;

	public AddItemDTO(String name, double licitationPrice, double salePrice) {
		super();
		this.name = name;
		this.licitationPrice = licitationPrice;
		this.salePrice = salePrice;
	}

	public AddItemDTO() {
		super();
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
	
	

}
