/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
package id.ac.del.test;

import id.ac.del.rental.VehicleRental;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.CorporateDiscount;

public class TestRental {

    public static void main(String[] args) {

        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
        v.setRentalDays(3);
        // Total kotor = 250.000 × 3 = 750.000

        System.out.println("=== DEMO POLIMORFISME DISKON ===");

        // Tanpa diskon (parameter null)
        System.out.println("Tanpa diskon      : Rp" + v.getTotalCost(null));

        // POLIMORFISME: objek diskon berbeda dikirim ke parameter yang sama
        Discountable discount;

        discount = new MemberDiscount();
        System.out.println("Member (10%)      : Rp" + v.getTotalCost(discount));

        discount = new FlashSaleDiscount(0.25);
        System.out.println("FlashSale (25%)   : Rp" + v.getTotalCost(discount));

        discount = new CorporateDiscount(100000, 500000);
        System.out.println("Corporate         : Rp" + v.getTotalCost(discount));
    }
}

// Praktikum Bagian C. 

/*
1) Analisis Kompilasi dan Hak Akses (Access Modifiers)

i) Baris yang memicu compile-time error

Baris yang error adalah Baris B dan Baris C.

Baris B error karena rentalRatePerDay menggunakan protected,
sedangkan TestRental berada di package yang berbeda. Jadi atribut
tersebut tidak bisa diakses langsung dari TestRental.

Baris C error karena discountRate tidak memiliki modifier sehingga
menggunakan default. Atribut default hanya bisa diakses dari package
yang sama.

Baris A bisa karena plateNumber bersifat public. Baris D juga bisa
karena setRentalDays() merupakan method public.

2) Kelemahan Integritas Data (Data Hiding & Validation)

i) Masalah pada setRentalDays()

Walaupun Baris D menggunakan setter, method setRentalDays() belum
melakukan validasi. Jadi nilai -7 tetap bisa dimasukkan ke rentalDays.
Seharusnya nilai hari tidak boleh negatif dan perlu diperiksa terlebih
dahulu sebelum disimpan.


ii) Penyebab total biaya bisa negatif

Total biaya bisa menjadi negatif karena rentalRatePerDay dan rentalDays
masih bisa diberi nilai negatif. Nilai tersebut kemudian digunakan
dalam perhitungan total biaya.

Agar data lebih aman, atribut yang berhubungan dengan biaya sebaiknya
dibuat private dan hanya diubah melalui setter yang melakukan validasi.
Harga sewa dan jumlah hari tidak boleh bernilai negatif, sedangkan
diskon harus berada pada nilai yang sesuai.


