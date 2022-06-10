package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numberOfEmployee;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double annualIncome, Integer numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public double tax() {
		if (numberOfEmployee > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}
}
