package Product;

import java.util.Date;

public class Product {
	private int ProductID;
	private String ProductName;
	private String ProductionDate;
	
	
	 
	public Product(int ProductID, String ProductName, String ProductionDate) {
		super();
		this.ProductID = ProductID;
		this.ProductName = ProductName;
		this.ProductionDate = ProductionDate;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductionDate() {
		return ProductionDate;
	}

	public void setProductionDate(String productionDate) {
		ProductionDate = productionDate;
	}

	 
	


}
