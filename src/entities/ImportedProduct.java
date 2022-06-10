package entities;

public class ImportedProduct extends ProductExFix {

	private Double customsFree;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}

	public Double totalPrice() {
		return super.getPrice() + customsFree;
	}

	@Override
	public String priceTag() {
		return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs free: $ "
				+ String.format("%.2f", customsFree) + ")";
	}
}
