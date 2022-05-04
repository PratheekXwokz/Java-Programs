package com.xworkz.cake.dao;

import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeDAO {
	private CakeDTO[] dtos = new CakeDTO[5];
	private int index;

	public boolean save(CakeDTO dto) {
		System.out.println("Storing " + dto);
		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;

			System.out.println("New Cake Added ");
			return true;
		} else {
			System.out.println("Array out of Index");
		}
		return false;

	}

	public void updatePriceByFlavour(Double priceToUpdate, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto = dtos[index];

			System.out.println("Flavour is " + flavour);
			if (dto.getFlavour().equals(flavour)) {
				dto.setPrice(priceToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				break;
			} else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}

	public void updatePriceAndQuantityByFlavour(Double priceToUpdate, Float quantityToUpdate, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto2 = dtos[index];

			System.out.println("Flavour is " + flavour);
			System.out.println("Existing Favour is " + dto2.getFlavour());
			if (dto2.getFlavour().equals(flavour)) {
				dto2.setPrice(priceToUpdate);
				dto2.setQuantity(quantityToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				System.out.println("Updated Quantity " + quantityToUpdate);
				break;
			} else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}

	public void updateShapeById(Shape shapeToUpdate, Integer id) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto3 = dtos[index];
			System.out.println("Id is " + id);
			if (dto3.getId().equals(id)) {
				dto3.setShape(shapeToUpdate);
				System.out.println("Updated Shape " + shapeToUpdate);
				break;
			} else {
				System.out.println("Shape Cannot be Updated By Id");
			}
		}
	}

	public void updateTypeByIdAndFlavour(Type typeToUpdate, Integer id, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {

			System.out.println("Flavour is " + flavour);
			System.out.println("Existing Favour is " + dtos[index].getFlavour());
			if (dtos[index].getFlavour().equals(flavour) && dtos[index].getId().equals(id)) {
				dtos[index].setType(typeToUpdate);
				System.out.println("Updated Type " + typeToUpdate);
				break;
			} else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}

	public void updatePriceAndShapeAndTypeByQuantity(Double priceToUpdate, Shape shapeToUpdate, Type typeToUpdate,
			Float quantity) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto5 = dtos[index];

			System.out.println("Quantity is " + quantity);
			if (dto5.getQuantity().equals(quantity)) {
				dto5.setPrice(priceToUpdate);
				dto5.setShape(shapeToUpdate);
				dto5.setType(typeToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				System.out.println("Updated Shape " + shapeToUpdate);
				System.out.println("Updated Type " + typeToUpdate);
				break;
			} else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}

	public CakeDTO findById(Integer id) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto6 = dtos[index];

			System.out.println("Id is " + id);
			if (dto6.getId().equals(id)) {
				System.out.println("The Cake id is Found " + id);
				break;
			} else {
				System.out.println("Cannot find " + id + " in Cake");

			}

		}
		return null;
	}

	public CakeDTO findByIdAndFlavour(Integer id, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto7 = dtos[index];

			System.out.println("Id is " + id);
			System.out.println("Flavour is " + flavour);
			if (dto7.getId().equals(id) && (dto7.getFlavour().equals(flavour))) {
				System.out.println("The Cake is " + id + " and the Flavour is " + flavour);
				break;
			} else {
				System.out.println("Cannot find " + id + " and " + flavour);
			}

		}
		return null;

	}

	public Double findPriceById(Integer id) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto9 = dtos[index];

			System.out.println("Id is " + id);
			if (dto9.getId().equals(id)) {
				return dto9.getPrice();
			} else {
				System.out.println("Cannot find id " + id);
			}

		}
		return null;
	}

	public Flavour findFlavourById(Integer id) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto10 = dtos[index];

			System.out.println("Id is " + id);
			if (dto10.getId().equals(id)) {
				return dto10.getFlavour();
			} else {
				System.out.println("Cannot find id " + id);
			}

		}
		return null;
	}

	public CakeDTO[] findAll() {

		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto11 = dtos[index];

			if (dto11.getClass() != null) {
				System.out.println("All Conditions are Sattisfied");
				for (int repeat = 0; repeat < dtos.length; repeat++) {
					System.out.println(dtos[repeat]);
				}
				return dtos;
			} else {
				System.out.println("Cannot find The Cake");
			}

		}
		return null;

	}

	public Double findByMaxPrice() {
		double max = 0;
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto12 = dtos[index];
			double price = dto12.getPrice();
			System.out.println(max + " " + price);
			max = Math.max(max, price);
		}

		return max;

	}

	public Double findByMinPrice() {
		double min = Double.MAX_VALUE;
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto12 = dtos[index];
			double price = dto12.getPrice();
			System.out.println(min + " " + price);
			min = Math.min(min, price);
		}

		return min;

	}

}