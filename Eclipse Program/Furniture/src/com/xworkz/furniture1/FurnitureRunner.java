package com.xworkz.furniture1;

import com.xworkz.furniture.constants.Material;
import com.xworkz.furniture.dao.FurnitureDAO;
import com.xworkz.furniture.dto.FurnitureDTO;

public class FurnitureRunner {
	public static void main(String[] args) {

		FurnitureDTO fur = new FurnitureDTO();
		fur.setId(1);
		fur.setName("Chair");
		fur.setPrice(1699.9);
		fur.setBrand("IKEA");
		fur.setWeight(10.0);
		fur.setMaterial(Material.WOOD);

		FurnitureDTO fur1 = new FurnitureDTO();
		fur1.setId(2);
		fur1.setName("Table");
		fur1.setPrice(8000.0);
		fur1.setBrand("Alankar");
		fur1.setWeight(50.0);
		fur1.setMaterial(Material.IRON);

		FurnitureDTO fur2 = new FurnitureDTO();
		fur2.setId(3);
		fur2.setName("Sofa");
		fur2.setPrice(15999.9);
		fur2.setBrand("Ashirvadh");
		fur2.setWeight(35.20);
		fur2.setMaterial(Material.FIBRE);

		FurnitureDTO fur3 = new FurnitureDTO();
		fur3.setId(4);
		fur3.setName("Bed");
		fur3.setPrice(25000d);
		fur3.setBrand("Mega Furniture");
		fur3.setWeight(50.0);
		fur3.setMaterial(Material.IRON);

		FurnitureDTO fur4 = new FurnitureDTO();
		fur4.setId(5);
		fur4.setName("Wardrobe");
		fur4.setPrice(150000.0);
		fur4.setBrand("Teak Furnitures");
		fur4.setWeight(75.0);
		fur4.setMaterial(Material.WOOD);

		FurnitureDTO fur5 = new FurnitureDTO();
		fur5.setId(6);
		fur5.setName("Sofa");
		fur5.setPrice(50000.0);
		fur5.setBrand("Marlon's");
		fur5.setWeight(35.0);
		fur5.setMaterial(Material.FIBRE);

		FurnitureDAO dao = new FurnitureDAO();
		boolean save = dao.save(fur);
		System.out.println(save);

		save = dao.save(fur1);
		System.out.println(save);

		save = dao.save(fur2);
		System.out.println(save);

		save = dao.save(fur3);
		System.out.println(save);

		save = dao.save(fur4);
		System.out.println(save);

		save = dao.save(fur5);
		System.out.println(save);
	}

}
