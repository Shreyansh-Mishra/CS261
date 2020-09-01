import java.util.*;


public class banking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String holder = input.next();
        System.out.print("Please Enter Your PIN: ");
        int pin = input.nextInt();
        System.out.println("Choose your Account type: ");
        Account[] accounts;
        accounts = new Account[10];
                    while (true) {
                        System.out.println("1. Regular Account\n2. Interest Account\n3. Checking Account\n4. CD Account");
                        int typechoice = input.nextInt();
                        if (typechoice==1) {
                            accounts[0] = new Account(pin, holder, "Regular Account");
                            accounts[0].Success();
                            break;
                        }
                        else if (typechoice==2) {
                            accounts[0] = new Account(pin, holder, "Interest Account");
                            accounts[0].Success();
                            break;
                        }
                        else if (typechoice==3) {
                            accounts[0] = new Account(pin, holder, "Checking Account");
                            accounts[0].Success();
                            break;
                        }
                        else if (typechoice==4) {
                            accounts[0] = new Account(pin, holder, "CD Account");
                            accounts[0].Success();
                            break;
                        }
                        else {
                            System.out.println("Invalid Choice.");
                        }
                    }
        int i = 1;
        int choice;
        while (true) {
            System.out.println("1. Create a new Account\n2. Perform actions on an Account\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter your name: ");
                    holder = input.next();
                    System.out.print("Please Enter Your PIN: ");
                    pin = input.nextInt();
                    System.out.print("Choose your Account type: ");
                    while (true) {
                        System.out.println("1. Regular Account\n2. Interest Account\n3. Checking Account\n4. CD Account");
                        int typechoice = input.nextInt();
                        if (typechoice==1) {
                            accounts[i] = new Account(pin, holder, "Regular Account");
                            accounts[i].Success();
                            i++;
                            break;
                        }
                        else if (typechoice==2) {
                            accounts[i] = new Account(pin, holder, "Interest Account");
                            accounts[i].Success();
                            i++;
                            break;
                        }
                        else if (typechoice==3) {
                            accounts[i] = new Account(pin, holder, "Checking Account");
                            accounts[i].Success();
                            i++; 
                            break;
                        }
                        else if (typechoice==4) {
                            accounts[i] = new Account(pin, holder, "CD Account");
                            accounts[i].Success();
                            i++;  
                            break;
                        }
                        else {
                            System.out.println("Invalid Choice.");
                        }
                    }
                    
                    break;
                case 2:
                    for (int l=0;l<accounts.length;l++) {
                        if (accounts[l]!=null){
                            System.out.println("Account "+(l+1));
                            accounts[l].viewDetailsx2();
                            System.out.println("------------------------------------------------");
                        }
                    }
                    System.out.print("Enter the Account Index you want to perform actions on: ");
                    int accountchoice = input.nextInt();
                    accountchoice--;
                    if (accountchoice>=0 && accountchoice<11) {
                        if (accounts[accountchoice]==null) {
                            System.out.println("This Account does not exists.");
                        }
                        else{
                            System.out.print("Please enter the Account PIN: ");
                            int userpin = input.nextInt();
                            boolean status = accounts[accountchoice].verifyPin(userpin);
                            if (status==true) {
                            while (true) {
                                System.out.println("1. Deposit Money\n2. Withdraw Money\n3. View Details\n4. Elapse A Month\n5. Previous Menu");
                                System.out.print("Enter your choice: ");
                                int action = input.nextInt();
                                if (action==1) {
                                    System.out.print("Enter the amount to be deposited: ");
                                    double amount = input.nextDouble();
                                    accounts[accountchoice].deposit(amount);
                                }
                                else if (action==2) {
                                    System.out.print("Enter the amount to withdraw: ");
                                    double amount = input.nextDouble();
                                    accounts[accountchoice].withdraw(amount);
                                }
                                else if (action==3) {
                                    accounts[accountchoice].viewDetails();
                                }
                                else if (action==4) {
                                    accounts[accountchoice].elapseMonth();
                                }
                                else if (action==5) {
                                    break;
                                }
                                else {
                                    System.out.println("Invalid Choice.");
                                }
                            }
                        }
                        else {
                            System.out.println("Wrong PIN.");
                        }
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
            }


        }
    }
}

class Account {
    int pin;
    String holder;
    long accountNumber;
    double currentBalance;
    double rate;
    double interest;
    double penalty;
    double minimumBalance;
    int monthsElapsed;
    double transactionCharge;
    double withdrawalbefore12;
    String AccountType;
    public Account(int pin, String holder, String type) {
        this.holder = holder;
        this.pin = pin;
        this.currentBalance = 0;
        this.transactionCharge = 0;
        this.monthsElapsed = 0;
        this.withdrawalbefore12 = 0;
        this.AccountType = type;
        if (this.AccountType=="Regular Account") {
            this.regularAccount();
        }
        else if(this.AccountType=="Interest Account") {
            this.interestAccount();
        }
        else if (this.AccountType=="Checking Account") {
            this.checkingAccount();
        }
        else if (this.AccountType=="CD Account") {
            this.cdAccount();
        }
        }

    public void Success() {
        this.accountNumber = (long)(Math.random() * 10000000000000000L);
        if (this.holder != null) {
            System.out.println("Account Created Successfully!! Welcome " + this.holder + " Your account number is " + this.accountNumber);
        } else {
            System.out.println("There was an error!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            
            if(this.AccountType!="Checking Account"){
                this.currentBalance += amount;
                System.out.println("amount deposited successfully, Your Current Balance: " + this.currentBalance);
            }
            else{
                amount = amount - (amount*this.transactionCharge)/100;
                this.currentBalance += amount;
                System.out.println("amount deposited successfully after deduction of 0.1%, Your Current Balance: " + this.currentBalance);
            }
        } else {
            System.out.println("Please Enter a valid Amount");
        }
    }

    public void withdraw(double amount) {
        if ((amount > 0) && (this.currentBalance - amount >= 0)) {
            if(this.AccountType!="Checking Account" && this.AccountType!="CD Account"){
                this.currentBalance -= amount;
               
                System.out.println("amount whitdrew successfully, Your Current Balance: " + this.currentBalance);
            }
            else if (this.AccountType=="Checking Account"){
                amount = amount + (amount*this.transactionCharge)/100;
                this.currentBalance -= amount;
                
                System.out.println("amount withdrawal successfull after deduction of 0.1%, Your Current Balance: " + this.currentBalance);
            }
            else {
                this.currentBalance -= amount;
               
                System.out.println("amount whitdrew successfully, Your Current Balance: " + this.currentBalance);
                if (this.monthsElapsed<12) {
                    double penalty = (this.currentBalance*20)/100; 
                    this.currentBalance-=penalty;
                    System.out.println("You withdrew before 12 months, penalty: " + penalty + ", Current Balance: " + this.currentBalance);
                }
            }
        } 
    else {
            System.out.println("Please Enter a valid Amount/ Your account does not have enough balance to withdraw that amount");
        }
    }

    public void regularAccount() {
        this.AccountType = "Regular Account";
        this.interest = 0;
        this.penalty = 100.0;
        this.minimumBalance = 500;
    }

    public void interestAccount() {
        this.AccountType = "Interest Account";
        this.interest = 7;
        this.penalty = 0;
        this.minimumBalance = 0;
    }

    public void checkingAccount() {
        this.AccountType = "Checking Account";
        this.interest = 0.58333;
        this.penalty = 50;
        this.minimumBalance = 1000;
        this.transactionCharge = 0.1;
    }

    public void cdAccount() {
        this.AccountType = "CD Account";
        this.interest = 15;
        this.minimumBalance = 0;
        this.withdrawalbefore12 = 0;
    }

    public void viewDetails(){
        System.out.println("Name: " + this.holder);
        System.out.println("Balance: "+ this.currentBalance);
        System.out.println("Account Type: " + this.AccountType);
        System.out.println("Minimum Balance: " + this.minimumBalance);
        System.out.println("Interest Rate: " + this.interest);
    }

    public boolean verifyPin(int pin) {
        if (this.pin==pin) {
            return true;
        }
        return false;
    }

    public void elapseMonth(){
        this.monthsElapsed += 1;
        this.minimumbalance();
        double penalty = (this.currentBalance*10)/100;
        double penalty2 = 50;
        double penalty3 = Math.min(penalty,penalty2);
        this.currentBalance-=penalty3;
        if(this.AccountType!="CD Account"){
        double bonus = (this.currentBalance*this.interest)/100;
        this.currentBalance += bonus;
        System.out.println("Penalty: "+penalty3+" deducted, Interest Added: "+bonus+" Your Current balance: "+this.currentBalance);
        }
        else{
            if(this.monthsElapsed%12==0){
            double bonus = (this.currentBalance*this.interest)/100;
            this.currentBalance += bonus;
        System.out.println("Penalty: "+penalty3+" deducted, Interest Added: "+bonus+" Your Current balance: "+this.currentBalance);
        }
        else {
            System.out.println("Penalty: "+penalty3);
        }
    }
    }
    
    public void minimumbalance(){
        if(this.currentBalance<this.minimumBalance){
            if((this.currentBalance-this.penalty)>0){
                System.out.println("Balance low!!");
                this.currentBalance-=this.penalty;
            } 
            else{
                System.out.println("Balance low!!");
                this.currentBalance=0;
            }
        }
        else {
            System.out.println("Balance is maintained.");
        }
    }

    public void viewDetailsx2(){
        System.out.println("Name: "+this.holder);
    }
}