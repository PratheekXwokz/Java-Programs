package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;

public class StudentData {
	public static void main(String[] args) {
	     Map<String,String> map=new HashMap<String,String>();
	     
	     map.put("Pratheek","pratheekkc13@gmail.com");
	     map.put("Suhas","suhasnb@gmail.com");
	     map.put("Laxmi","laxmi@gmail.com");
	     map.put("Sanjay","sanjay@gmail.com");
	     map.put("Shwetha","shwetha@gmail.com");
	     
	     System.out.println(map.containsKey("Laxmi"));
	     System.out.println(map.containsValue("suhasnb@gmail.com"));
	     System.out.println(map.entrySet());
	     System.out.println(map.get("Sanjay"));
	     System.out.println(map.isEmpty());
	     System.out.println(map.size());
	     System.out.println(map.replace("Sanjay", "sanjay@gmail.com", "herosanjay@gmail.com"));
	     System.out.println(map.get("Sanjay"));
	     System.out.println(map.remove("Suhas"));
	     System.out.println(map.size());
	     System.out.println(map.keySet());
	     System.out.println(map.values());
	     System.out.println(map.getOrDefault("Ramesh", "There is no Such key"));
	}

}
