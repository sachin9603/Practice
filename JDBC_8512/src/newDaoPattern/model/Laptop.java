package newDaoPattern.model;

public class Laptop {
	
	
	private int laptopId  ;
	private String LaptopModel ;
	private String laptopBrand;
	
	
	public Laptop() {} ;
	
	
	public Laptop(int laptopId, String laptopModel, String laptopBrand) {
		
		this.laptopId = laptopId;
		LaptopModel = laptopModel;
		this.laptopBrand = laptopBrand;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopModel() {
		return LaptopModel;
	}
	public void setLaptopModel(String laptopModel) {
		LaptopModel = laptopModel;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	
	
	

}
