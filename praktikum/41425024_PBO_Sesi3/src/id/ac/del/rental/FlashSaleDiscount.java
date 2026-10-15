/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

import id.ac.del.rental.Discountable;

/**
 *
 * @author User
 */

// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
public class FlashSaleDiscount implements Discountable {
    private final double percentage;

    public FlashSaleDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double amount) {
        return amount * percentage;
    }
}
