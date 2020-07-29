package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Payment {

	private int number;
	private Date contractDate;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Payment(int number, Date contractDate, Double totalValue) {
		this.number = number;
		this.contractDate = contractDate;
		this.totalValue = totalValue;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getContractDate() {
		return contractDate;
	}
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installment> getInstallments() {
		return installments;
	}
	
	public void addInstallments(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallments(Installment installment) {
		installments.remove(installment);
	}
	
	
	
	
	
	
	
}
