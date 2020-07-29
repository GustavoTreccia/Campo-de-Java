package services;

import java.util.Calendar;
import java.util.Date;

import entites.Installment;
import entites.Payment;

public class ContractProcess {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractProcess(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Payment payment, int months) {
		double basicQuota = payment.getTotalValue() / months;
		
	for (int i = 1; i<=months; i++) {
		Date date = addMonths(payment.getContractDate(), i);
		double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
		double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
		payment.addInstallments(new Installment(date, fullQuota));
	}
	}
	
	private Date addMonths(Date contractDate, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contractDate);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	
}
