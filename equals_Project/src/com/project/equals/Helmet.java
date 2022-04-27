package com.project.equals;

public class Helmet {
	private String company;
	private Boolean isiCertified;
	private Integer price;
	private Double rating;
	private Type type;
	
	public int hashCode() 
	{
		System.out.println("running hashCode");
		return 900;
	}
	
	public String toString() 
	{
		System.out.println("running tostring");
		return "Helmet";
	}
	
	public boolean equals(Object obj)
	{
		if(obj !=null)
		{
			System.out.println("runnig object helmet");
			if(obj instanceof Helmet)
			{
				System.out.println("running instance helmet");
				Helmet other=(Helmet)obj;
				if(this.price.equals(other.price) 
						&& this.isiCertified.equals(other.isiCertified)
						&& this.type.equals(other.type) 
						&& this.rating.equals(other.rating))
				{
					System.out.println("runnig helmet");
					return true;
				}
				
			}
		}
		else
		{
			System.out.println("Helemet is not found");
			return false;
		}
		return isiCertified;
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Boolean getIsiCertified() {
		return isiCertified;
	}

	public void setIsiCertified(Boolean isiCertified) {
		this.isiCertified = isiCertified;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	

}
