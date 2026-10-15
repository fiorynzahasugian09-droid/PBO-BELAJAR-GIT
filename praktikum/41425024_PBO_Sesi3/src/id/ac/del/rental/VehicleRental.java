/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
package id.ac.del.rental;

public class VehicleRental {

    public String plateNumber;
    protected double rentalRatePerDay;
    private int rentalDays;

    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    public void setRentalDays(int days) {
        this.rentalDays = days;
    }

    // Getter untuk TestRental (karena field protected beda package)
    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    /**
     * POIN (ii): getTotalCost sekarang menerima parameter Discountable.
     * Objek diskon dikirim dari TestRental saat runtime → polimorfisme.
     */
    public double getTotalCost(Discountable discount) {
        // 1. Hitung total kotor
        double grossTotal = rentalRatePerDay * rentalDays;

        // 2. Kalau tidak ada diskon, kembalikan total kotor
        if (discount == null) {
            return grossTotal;
        }

        // 3. Hitung potongan via interface (polimorfik)
        double discountValue = discount.calculateDiscount(grossTotal);

        // 4. Total bersih, jangan sampai negatif
        return Math.max(grossTotal - discountValue, 0);
    }
}