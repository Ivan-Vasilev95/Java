package question_1;

public class SavingsAccountTest {

	public static void main(String[] args) {
		 savingAccount obj= new savingAccount(1000);
		 savingAccount.annualInterestrate=4;
		 obj.calculateMontlyInterest();
		 savingAccount.modifyInterestRate(5);
		 obj.calculateMontlyInterest();

	}

}
class savingAccount{
	static double annualInterestrate;
	private double savingBalance;
	
	savingAccount(){
		this.savingBalance=0;
	}
	savingAccount(double savingBalance){
		this.savingBalance=savingBalance;
	}
	
	public void setSavingBalance(double savingBalance) {
		this.savingBalance=savingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestrate;
	}
	public void calculateMontlyInterest() {
		System.out.println("Montly insterest is: "+savingBalance*(annualInterestrate/12));
	}
	public static void modifyInterestRate( double newSavingRate) {
		annualInterestrate=newSavingRate;
	}
}