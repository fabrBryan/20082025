

public class AccountTest2 {
    public static void main(String[] args) {
        System.out.println("======Tabungan Sayahh======");
        SavingsAccount2 sa0001 = new SavingsAccount2();
        sa0001.name = "ahmad";
        sa0001.balance = 10000;
        sa0001.deposit(5000);
        sa0001.interestRate = 0.02;
        sa0001.displayCustomer(0);
        
        

        sa0001.withdraw(2000);
        sa0001.deposit( 3000);
        sa0001.calcInterest();

        System.out.println("=====Tabungan Kamuu======");
        SavingsAccount2 sa0002 = new SavingsAccount2();
        sa0002.name = "fabryan";
        sa0002.balance = 20000;
        sa0002.deposit(10000);
        sa0002.interestRate = 0.03;
        sa0002.displayCustomer(0);
        
        sa0002.withdraw(5000);
        sa0002.deposit(2000);
        sa0002.calcInterest();
    
        
    }
}

       