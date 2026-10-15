/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
package id.ac.del.rental;

import id.ac.del.rental.Discountable;

/**
 *
 * @author User
 */

public class MemberDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10; // 10%
    }
}
