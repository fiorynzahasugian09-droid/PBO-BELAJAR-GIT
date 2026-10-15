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
// 1. Interface Switchable
interface Switchable {

    void turnOn();

    void turnOff();
}

// 2. Interface Connectable
interface Connectable {

    void connectToWifi(String ssid, String ipAddress);
}

// 3. Kelas SmartLamp
class SmartLamp implements Switchable, Connectable {

    // Atribut internal (private)
    private boolean isOn;
    private int brightness;
    private boolean isConnected;

    public SmartLamp() {
        this.isOn = false;
        this.isConnected = false;
        this.brightness = 0;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        this.brightness = 80;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        this.brightness = 0;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Tantangan Tambahan: Cek status (State Management)
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar gagal terhubung. Nyalakan perangkat terlebih dahulu!");
            return;
        }
        this.isConnected = true;
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}

// 4. Kelas SmartAC
class SmartAC implements Switchable, Connectable {

    // Atribut internal (private)
    private boolean isOn;
    private int temperature;
    private boolean isConnected;

    public SmartAC() {
        this.isOn = false;
        this.isConnected = false;
        this.temperature = 0;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        this.temperature = 22;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        this.temperature = 0;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Tantangan Tambahan: Cek status (State Management)
        if (!isOn) {
            System.out.println("[Error] AC Pintar gagal terhubung. Nyalakan perangkat terlebih dahulu!");
            return;
        }
        this.isConnected = true;
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}

// 5. Kelas Utama (Nama class ini harus sama dengan nama file: SmartHome.java)
public class SmartHome {

    public static void main(String[] args) {
        // Simulasi SmartLamp
        SmartLamp lampu = new SmartLamp();
        lampu.turnOn();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        System.out.println(); // Baris kosong pemisah

        // Simulasi SmartAC
        SmartAC ac = new SmartAC();
        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff();

        System.out.println("\n--- Uji Coba Error (State Management) ---");
        // Mencoba koneksi saat perangkat mati
        SmartLamp lampuMati = new SmartLamp();
        lampuMati.connectToWifi("Rumah_Indah_5G", "192.168.1.99");
    }
}
