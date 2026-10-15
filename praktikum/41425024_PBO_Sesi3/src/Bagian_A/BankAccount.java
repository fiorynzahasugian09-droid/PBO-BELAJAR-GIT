/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
package Bagian_A;

/**
 *
 * @author User
 */
public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih  besar dari 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid !");
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi");
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);

        }
    }

public static void main (String [] args) {
    BankAccount acc = new BankAccount("ACC-001", 500000);
    
    acc.deposit(-100000);
    acc.withdraw(700000);
    acc.withdraw(200000);
    
    System.out.println("Saldo akhir akun " + acc.getAccountNumber() + " : Rp" + acc.getBalance());
}
    
}
