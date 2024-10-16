import java.util.*;
public class codsoft3{
    public static class ATM{
    public double balance;
    public int pin;
    public ATM(double balance,int pin){
        this.balance=balance;
        this.pin=pin;
    }
    public void checkbalance(){
        System.out.println("your available balance is: "+balance+"Rs");
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully deposited "+amount+"Rs");

        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Successfully withdraw "+ amount+ "Rs");
        }
        else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }


}
public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    ATM atm =new ATM (1000.0,7989);
    System.out.println("Enter your PIN:");
int dialpin=sc.nextInt();
if(dialpin!=atm.pin){
    System.out.println("INVALID PIN");
    return;
}
while(true){
    System.out.println("Press 1 to check balance");
    System.out.println("Press 2 for deposition of money");
    System.out.println("Press 3 for withdraw");
    System.out.println("Press 4 for exit");

    int option=sc.nextInt();
    switch(option){
        case 1:
        atm.checkbalance();
        break;
        case 2:
        System.out.println("enter deposit amount:");
        double depos=sc.nextDouble();
        atm.deposit(depos);
        break;
        case 3:
        System.out.println("enter withdrawal amount:");
        double withdrawAmount=sc.nextDouble();
        atm.withdraw(withdrawAmount);
        break;
        case 4:
        System.out.println("Exiting.....");
        return;
      
        case 5:
        System.out.println("Invalid Input");
        }

}
}
}