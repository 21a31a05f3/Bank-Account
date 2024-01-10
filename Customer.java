import java.util.Scanner;
class BankAccount{
    Scanner sca= new Scanner(System.in);
    float Balance=5000;
    public void deposit(){
        System.out.println("Enter the amount to be deposited: ");
        int dep_amount=sca.nextInt();
        System.out.println("The amount deposited is:"+dep_amount);
        Balance=Balance + dep_amount;
        Current_Balance();
    }
    public void withdraw(){
        System.out.println("Enter the amount to be withdrawn: ");
        int with_amount=sca.nextInt();
        if(Balance < with_amount){
            System.out.println("Insufficient Balance !!");
        }
        else {
            System.out.println("The amount withdrawn is: "+with_amount);
            Balance=Balance - with_amount;
            Current_Balance();
        }
    }
    public void Current_Balance(){
        System.out.println("The current balance is: "+Balance);
    }
}
public class Customer{
    public static void main (String[] args) {
        BankAccount obj=new BankAccount();
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome To ABC Bank");
        System.out.println("Enter your account holder name: ");
        String AccountHolder=sc.nextLine();
        System.out.println("Welcome "+AccountHolder+"!");
        System.out.println("Enter your account number: ");
        String AccountNumber=sc.nextLine();
        for(int i=0;i<=1;++i){
            if(AccountNumber.length()!=11){
                System.out.println("Invalid Account number");
                System.out.println("Please enter the account number again: ");
                String AccountNumber1=sc.nextLine();
                AccountNumber=AccountNumber1;
                if(i==1){
                    System.out.println("Sorry,You have entered incorrect Account number many times..");
                    System.out.println("Please try again after some time");
                    System.exit(0);
                }
            }
        }
        System.out.println("Enter 1 for deposit");
        System.out.println("Enter 2 for withdraw");
        System.out.println("Enter 3 for current balance");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                obj.deposit();
                break;
            case 2:
                obj.withdraw();
                break;
            default:
                obj.Current_Balance();
        }
    }
}