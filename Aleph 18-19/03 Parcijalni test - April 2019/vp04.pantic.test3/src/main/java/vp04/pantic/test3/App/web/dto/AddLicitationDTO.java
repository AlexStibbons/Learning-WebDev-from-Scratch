package vp04.pantic.test3.App.web.dto;

public class AddLicitationDTO {
	
	private double offer;
	
	private long itemId;

	public AddLicitationDTO(double offer, long itemId) {
		super();
		this.offer = offer;
		this.itemId = itemId;
	}

	public AddLicitationDTO() {
		super();
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	

}
