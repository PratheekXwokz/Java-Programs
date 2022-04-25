package com.xworkz.pratheek;

class Task{


protected Object clone() {
	System.out.println("Clonong new object");
	return null;
}

public boolean equals(Object obj) {
	System.out.println("Checking Equa;s to");
	return true;
}

protected void finalize() {
	System.out.println("running finalize");
}

public int hashCode() {
	System.out.println("The hashCode value is");
	return 12;
}
}