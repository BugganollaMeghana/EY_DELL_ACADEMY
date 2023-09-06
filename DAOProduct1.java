package EY_Practice;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



class Product1 {

	private int id;
	private int quantity;
	private String pname;
	private int price;
	private String owner;
	
	public Product1(int id, int quantity, String pname, int price, String owner) {
		this.id = id;
		this.quantity = quantity;
		this.pname = pname;
		this.price = price;
		this.owner = owner;
  }
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	@Override
	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Product [id=").append(id).append(", quantity=").append(quantity).append(", Pname=")
	.append(pname).append(", price=").append(price).append(", Owner=").append(owner).append("]");
		return builder.toString();
  }
}

interface product1dao
{
	void addProduct(Product product);
	void getProductById(Product product);
	void getProductByQuantity(Product product);
	void getProductByPname(Product product);
	void getProductByPrice(Product product);
	void getProductByOwner(Product product);
}

class ProductDAOImp implements product1dao
{
	static List<Product> products = new ArrayList<>();
	
	@Override
	public void addProduct(Product p1) {
    products.add(p1);
  }
	@Override
	public void getProductById(Product product) {
		products.get(1).setPname(product.getPname());
  }
	@Override
	public void getProductByQuantity(Product product) {
}

	@Override
	public void getProductByPname(Product product) {
}

	@Override
	public void getProductByPrice(Product product) {
}

	@Override
	public List<Product> getProductByOwner(Product product) {
}
}

public class DAOProduct1 {
	public static void main(String[] args) {
		product1dao productDAO = new ProductDAOImp();
		ProductDAOImp pI = new ProductDAOImp();
		List<Product> listOfProducts = new ArrayList<>();
		//public Product(int id, int quantity, String pname, int price, String owner) {
		Product p1 = new Product(123, 100,"ANC", 89, "PQR");
		Product p2 = new Product(124, 100,"ANC", 89, "PQR");
		Product p3 = new Product(125, 100,"ANC", 89, "PQR");
		listOfProducts.add(p1);listOfProducts.add(p2);listOfProducts.add(p3);
		Iterator<Product> itr = listOfProducts.iterator();
		while(itr.hasNext()) {
			Product p = itr.next();
			System.out.println(p.toString());
			}
		List<Product> giveMeProductByOwner = pI.getProductByOwner(p1);

    

    

        //productDAO.addProduct(new Product(1, "Product A"));

        //productDAO.addProduct(new Product(2, "Product B"));

        //productDAO.addProduct(new Product(3, "Product C"));

 

        

    /*

     * List<Product> product = pI.getProductById(2); if (product.isPresent()) {

     * System.out.println("Product ID: " + product.get().getId() + ", Name: " +

     * product.get().getName()); } else { System.out.println("Product not found.");

     * }

     */


    

  }

}
