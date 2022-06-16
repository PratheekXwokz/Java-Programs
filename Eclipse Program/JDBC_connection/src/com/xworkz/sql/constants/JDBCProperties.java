package com.xworkz.sql.constants;

public enum JDBCProperties {
	URL("jdbc:mysql://localhost:3306/Xworkz_BTM_March7th"),USERNAME("root"),SECRET("13398");
	
	
	private String values;
	
	private JDBCProperties(String values) {
		this.values=values;
	}
	public String getValues() {
		return values;
	}

}
