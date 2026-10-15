/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 *
 * @author User
 */
public class StudentGrade {

    // Atribut private (Enkapsulasi)
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private double nilaiAkhir;

    // Atribut read-only untuk grade huruf (Tantangan Tambahan)
    private String gradeHuruf;

    // Constructor
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        this.nilaiAkhir = 0.0;
        this.gradeHuruf = "E"; // Default awal
    }

    // --- Getters (Read-only untuk NIM dan Nama) ---
    // Tidak ada setter untuk NIM dan Nama sesuai instruksi
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiKuis() {
        return nilaiKuis;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // --- Setters dengan Validasi ---
    public void setNilaiKuis(double nilaiKuis) {
        // Validasi range 0.0 sampai 100.0
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungNilaiAkhir(); // Hitung ulang nilai akhir
            updateGradeHuruf(); // Hitung ulang grade huruf (Tantangan)
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    public void setNilaiUTS(double nilaiUTS) {
        // Validasi range 0.0 sampai 100.0
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
            hitungNilaiAkhir(); // Hitung ulang nilai akhir
            updateGradeHuruf(); // Hitung ulang grade huruf (Tantangan)
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS + " (Harus antara 0 - 100)");
        }
    }

    // --- Method Internal untuk Perhitungan ---
    // Menghitung Nilai Akhir (Bobot: 40% Kuis + 60% UTS)
    private void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.4 * this.nilaiKuis) + (0.6 * this.nilaiUTS);
    }

    // Tantangan Tambahan: Menghitung Grade Huruf secara otomatis (Private Method)
    private void updateGradeHuruf() {
        if (this.nilaiAkhir >= 85) {
            this.gradeHuruf = "A";
        } else if (this.nilaiAkhir >= 70) {
            this.gradeHuruf = "B";
        } else if (this.nilaiAkhir >= 60) {
            this.gradeHuruf = "C";
        } else if (this.nilaiAkhir >= 50) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }

    // Method untuk mencetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        // Menampilkan grade huruf (opsional, sesuai tantangan tambahan)
        System.out.println("Grade Huruf : " + gradeHuruf);
    }
}
