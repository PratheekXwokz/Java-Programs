package com.xworkz.furniture.dto;

import java.io.Serializable;

import com.xworkz.furniture.constants.Material;

public class FurnitureDTO implements Serializable {
	private Integer id;
	private String name;
	private Double price;
	private String brand;
	private Double weight;
	private Material material;

	@Override
	public String toString() {
		return "FurnitureDTO [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", weight="
				+ weight + ", material=" + material + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}
