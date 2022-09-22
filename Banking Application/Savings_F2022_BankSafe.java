public class Savings_F2022_BankSafe extends Account_F2022_BankSafe{
    
    public double interestRate;

    //constructors
    //default
    public Savings_F2022_BankSafe(){
    }

    //with info
    public Savings_F2022_BankSafe(String fName, String lName, String accountNum){
        setFName(fName);
        setLName(lName);
        setAccountNum(accountNum);
    }

    //with info and initial deposit
    public Savings_F2022_BankSafe(String fName, String lName, String accountNum, double amount){
        setFName(fName);
        setLName(lName);
        setAccountNum(accountNum);
        deposit(amount);
    }

    
    //method for interest payments
    public void interestPayment(){
        this.amount += (interestRate * this.amount);
    }

}