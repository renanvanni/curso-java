package entities;

public class PessoaFisica extends Pessoa {
	
	private Double paymentWithHelth;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double annualIncome, Double paymentWithHelth) {
		super(name, annualIncome);
		this.paymentWithHelth = paymentWithHelth;
	}

	public Double getPaymentWithHelth() {
		return paymentWithHelth;
	}

	public void setPaymentWithHelth(Double paymentWithHelth) {
		this.paymentWithHelth = paymentWithHelth;
	}
	
	public double tax() {
		double renda = 0;
		
		if (getAnnualIncome() <= 20000.00) {
			renda = getAnnualIncome() * 0.15;
		} else {
			renda = getAnnualIncome() * 0.25;
		}
		
		renda -= paymentWithHelth * 0.5;
		
		if (renda < 0) {
			renda = 0;
		}

		return renda;
	}
}
