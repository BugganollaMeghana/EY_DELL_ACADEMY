package EY_3108;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product{
	int product_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prod_validity;
	
	 Product(int product_id, String prod_name, String prod_desc, int prod_quantity, double prod_price, LocalDate prod_validity) {
		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.prod_validity = prod_validity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}

	public LocalDate getProd_validity() {
		return prod_validity;
	}

	public void setProd_validity(LocalDate prod_validity) {
		this.prod_validity = prod_validity;
	}
	
}
interface ProductDAO {
	String nameOfProduct(Product p);
	int priceOfProduct(Product p);
	int quantityOfProduct(Product p);
	String descriptionOfProduct(Product p);
	LocalDate prodValidityDate(Product p);
	void deleteProduct(Product p);
	void updateProduct(Product p);
	List<Product> getAllProducts();
}

class ProductDAOImpl implements ProductDAO{
	
	List<Product> listOfProducts = new ArrayList<>();
	
	public ProductDAOImpl() {
		
		Product p1 = new Product(123,"A","B",10, 10.29, LocalDate.now());
		Product p2 = new Product(124,"C","D",20, 20.29, LocalDate.of(2019,Month.FEBRUARY,20));
		Product p3 = new Product(125,"E","F",20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
	}

	@Override
	public String nameOfProduct(Product p) {
		
		Iterator<Product> itr = listOfProducts.iterator();
		while(itr.hasNext()) {
			Product p2 = itr.next();
			return p2.getProd_name();
		}
		return null;
	}

	@Override
	public int priceOfProduct(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantityOfProduct(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String descriptionOfProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate prodValidityDate(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return listOfProducts;
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		listOfProducts.remove(p);
		
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Iterator<Product> itr = getAllProducts().iterator();
		while(itr.hasNext()) {
			Product p 
		}
	}
	
	
}

public class ProductDAOClass {
	
	public static void main(String[] args) {
		ProductDAOImpl obj = new ProductDAOImpl();
		Iterator<Product> itr1 = obj.getAllProducts().iterator();
		List<Product> newList = new ArrayList<>();
		System.out.println("Size of the list is " + obj.getAllProducts().size());
		
		while(itr1.hasNext()) {
			newList.add(itr1.next());
			System.out.println("Element to be deleted ");
			Product p = itr1.next();
			obj.deleteProduct(p);
		}
		for(Product p : obj.getAllProducts()) {
			System.out.println("Product Id " + p.product_id + " product name is " + p.prod_name);
			System.out.println("Name of Product is " + p.getProd_name());
			obj.deleteProduct(p);
			afterDeleteProducts();
		}
		Iterator<Product> itr2 = obj.getAllProducts().iterator();
		while(itr2.hasNext()) {
			
		}
	}
	
	static void afterDeleteProducts() {
		ProductDAOImpl obj = new ProductDAOImpl();
		if(null != obj.getAllProducts()) {
			System.out.println("Inside After Delete");
			for(Product p = obj.getAllProducts()) {
				System.out.println("Products Id " +p.product_id + " product name is " + p.prod_name);
				System.out.println("Name of Product is " + p.getProd_name()););
			}
		} else {
			System.out.println("List is Empty");
		}
	}

}
