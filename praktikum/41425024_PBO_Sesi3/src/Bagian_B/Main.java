/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Nama  : Fiorynza Hasugian
// NIM   : 41425024
// Prodi : D4TRPL
package Bagian_B;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // 1. Registrasi Mahasiswa
        // NIM dan Nama di-set melalui constructor karena tidak ada setter-nya
        StudentGrade mahasiswa = new StudentGrade("11425001", "Marsha");
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + mahasiswa.getNim() + " - " + mahasiswa.getNama());

        // 2. Mencoba input nilai kuis yang salah (110.0)
        // Harusnya memicu pesan error
        mahasiswa.setNilaiKuis(110.0);

        // 3. Input nilai kuis yang benar (85.0)
        mahasiswa.setNilaiKuis(85.0);

        // 4. Input nilai UTS yang benar (90.0)
        mahasiswa.setNilaiUTS(90.0);

        // 5. Cetak Laporan
        mahasiswa.cetakLaporan();
    }
}