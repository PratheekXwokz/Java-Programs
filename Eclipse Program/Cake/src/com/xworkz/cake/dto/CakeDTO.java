package com.xworkz.cake.dto;

public class CakeDTO {
	private Integer id;
	private Double price;
	private Flavour flavour;
	private Shape shape;
	private Type type;
	private Float quantity;
	
	public CakeDTO() {
		System.out.println("Default Constructor Created");
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Float  getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	

	@Override
	public String toString() {
		return "CakeDTO [id=" + id + ", price=" + price + ", flavour=" + flavour + ", shape=" + shape + ", type=" + type
				+ ", quantity=" + quantity + "]";
	}

	

}
