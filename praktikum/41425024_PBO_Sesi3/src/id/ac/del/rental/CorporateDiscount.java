/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
package id.ac.del.rental;

/**
 *
 * @author User
 */
public class CorporateDiscount implements Discountable {

    private final double fixedAmount;
    private final double minTransaction;

    public CorporateDiscount(double fixedAmount, double minTransaction) {
        this.fixedAmount = fixedAmount;
        this.minTransaction = minTransaction;
    }

    @Override
    public double calculateDiscount(double amount) {
        return (amount >= minTransaction) ? fixedAmount : 0;
    }
}
