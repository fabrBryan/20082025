public class CheckingAccount {
    public String name;
    public double balance;
    public double interestRate = 0.01;

    public void displayCustomer() {
        System.out.println("customer: " + name);
        System.out.println("balance: " + balance);
        System.out.println("rate: " + interestRate);  
    }
    public void deposit(int x) {
        if (x < 0) {
            System.out.println("Jumlah Deposit Harus Positif");
            return;
        }
        balance += x;
        System.out.println("Deposit: " + x + " Berhasil");
        System.out.println("Saldo Sekarang: " + balance);
        displayCustomer();
        System.out.println("==========================");
    }
    public void withdraw(int y) {
        if (y < 0) {
            System.out.println("Jumlah Penarikan Harus Positif");
            return;
        }
        if (y > balance) {
            System.out.println("Saldo Tidak Cukup");
            return;
        }
        balance -= y;
        System.out.println("Penarikan: " + y + " Berhasil");
        System.out.println("Saldo Sekarang: " + balance);
        displayCustomer();
        System.out.println("==========================");
    }
    
}
