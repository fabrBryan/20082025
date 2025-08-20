public class SavingsAccount2 {
public double balance;
public double interestRate = 0.02;
public String name;

public void displayCustomer(int x){
    balance += x;
    System.out.println("Customer : " + name);
    System.out.println("Deposit : " + x);
System.out.println("Saldo Rekening Sekarang : " + balance);
}

public void deposit (int x) {
    if (x <=0) {
        System.out.println("Jumlah Setoran Harus Positif");
        return;
    }  
    balance += x;
System.out.println("Setoran: " + x + " Berhasil");
System.out.println("Saldo Sekarang: " + balance);
displayCustomer(x);
System.out.println("==========================");

}

public void withdraw(double y ) {
    if (y < 0) {
        System.out.println("peringatan: jumlah penarikan tidak boleh negatif");
        return;
    }
    if (y > balance) {
System.out.println("Peingatan saldo terlalu rendah");
return;
    }
    balance -= y;
    System.out.println("Penarikan: " + y + " Berhasil");
    System.out.println("Saldo Sekarang: " + balance);
    displayCustomer(0);
    System.out.println("==========================");

    
    
}
    public double calcInterest() {
        double interest = balance * interestRate / 12;
        balance += interest;
        System.out.println("Bunga Bulanan: " + interest);
        System.out.println("Saldo Setelah Bunga: " + balance);
        displayCustomer(0);
        System.out.println("==========================");

        return interest;

        
    }

}