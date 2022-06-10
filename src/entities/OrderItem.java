package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product7 product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product7 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product7 getProduct() {
		return product;
	}

	public void setProduct(Product7 product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $" 
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
