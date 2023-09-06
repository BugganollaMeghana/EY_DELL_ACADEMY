package EY_Practice;

import java.util.List;

class Product {
	private String Product_name;
	private int Product_id;
	
	Product(String Product_name,int Product_id) {
	this.Product_name=Product_name;
	this.Product_id=Product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public int getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	
}
interface ProductDAO {
	public List<Product> getAllProducts();
	public Product getProduct(int Product_id);
	public void getProductByPrice(Product )
}
public class DAODesignPattern {

	public static void main(String[] args) {
		
	}

}
