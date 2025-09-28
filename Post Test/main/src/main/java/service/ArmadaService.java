/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.ArmadaBase;
import model.Armada;
import model.ArmadaDomestik;
import model.ArmadaInternasional;
import java.util.ArrayList;

/**
 *
 * @author user
 */

public class ArmadaService {
    private ArrayList<ArmadaBase> daftarArmada = new ArrayList<>();

    public ArmadaService() {
        daftarArmada.add(new ArmadaDomestik("GA001", "ATR 72-600", 78, "Kalimantan"));
        daftarArmada.add(new ArmadaDomestik("GA002", "Bombardier Dash 8 Q400", 90, "Sulawesi"));
        daftarArmada.add(new ArmadaInternasional("GA003", "Boeing 777-9", 440, "Jepang"));
        daftarArmada.add(new ArmadaInternasional("GA004", "Airbus A350-1000", 480, "Australia"));
        daftarArmada.add(new ArmadaInternasional("GA005", "Airbus A380-800", 853, "Amerika Serikat"));
    }

    public void tambahArmada(String id, String tipe) {
        if (id.isEmpty() || tipe.isEmpty()) {
            System.out.println("ID dan Tipe Pesawat tidak boleh kosong.");
            return;
        }

        Armada armadaBaru = new Armada(id, tipe, 100);
        daftarArmada.add(armadaBaru);
        System.out.println("Armada biasa berhasil ditambahkan (kapasitas default 100).");
    }

    public void tambahArmada(String id, String tipe, int kapasitas) {
        if (id.isEmpty() || tipe.isEmpty()) {
            System.out.println("ID dan Tipe Pesawat tidak boleh kosong.");
            return;
        }
        if (kapasitas <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        Armada armadaBaru = new Armada(id, tipe, kapasitas);
        daftarArmada.add(armadaBaru);
        System.out.println("Armada biasa berhasil ditambahkan.");
    }

    public void tambahArmadaDomestik(String id, String tipe, int kapasitas, String wilayahOperasi) {
        if (id.isEmpty() || tipe.isEmpty() || wilayahOperasi.isEmpty()) {
            System.out.println("Semua data harus diisi.");
            return;
        }
        if (kapasitas <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        ArmadaDomestik armada = new ArmadaDomestik(id, tipe, kapasitas, wilayahOperasi);
        daftarArmada.add(armada);
        System.out.println("Armada domestik berhasil ditambahkan.");
    }

    public void tambahArmadaInternasional(String id, String tipe, int kapasitas, String negaraTujuan) {
        if (id.isEmpty() || tipe.isEmpty() || negaraTujuan.isEmpty()) {
            System.out.println("Semua data harus diisi.");
            return;
        }
        if (kapasitas <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        ArmadaInternasional armada = new ArmadaInternasional(id, tipe, kapasitas, negaraTujuan);
        daftarArmada.add(armada);
        System.out.println("Armada internasional berhasil ditambahkan.");
    }

    public void tampilkanArmada() {
        if (daftarArmada.isEmpty()) {
            System.out.println("Belum ada data armada.");
        } else {
            System.out.println("\n=== DAFTAR ARMADA PESAWAT ===");
            for (int i = 0; i < daftarArmada.size(); i++) {
                ArmadaBase a = daftarArmada.get(i);
                System.out.println((i + 1) + ". " + a.getInfo());
            }
        }
    }

    public void ubahArmada(int index, String idBaru, String tipeBaru, int kapasitasBaru) {
        if (index < 0 || index >= daftarArmada.size()) {
            System.out.println("Nomor tidak ditemukan.");
            return;
        }
        if (idBaru.isEmpty() || tipeBaru.isEmpty()) {
            System.out.println("ID dan Tipe Pesawat tidak boleh kosong.");
            return;
        }
        if (kapasitasBaru <= 0) {
            System.out.println("Kapasitas harus lebih dari 0.");
            return;
        }

        ArmadaBase a = daftarArmada.get(index);
        if (a instanceof Armada) {
            ((Armada) a).setId(idBaru);
            ((Armada) a).setTipe(tipeBaru);
            ((Armada) a).setKapasitas(kapasitasBaru);
            System.out.println("Data armada berhasil diubah.");
        } else {
            System.out.println("Data ini bukan armada biasa dan tidak bisa diubah dengan menu ini.");
        }
    }

    public void hapusArmada(int index) {
        if (index < 0 || index >= daftarArmada.size()) {
            System.out.println("Nomor tidak ditemukan.");
            return;
        }

        daftarArmada.remove(index);
        System.out.println("Data armada berhasil dihapus.");
    }

    public void cariArmada(String keyword) {
        boolean ditemukan = false;
        System.out.println("\n=== HASIL PENCARIAN ===");
        for (int i = 0; i < daftarArmada.size(); i++) {
            ArmadaBase a = daftarArmada.get(i);
            if (a.getId().toLowerCase().contains(keyword.toLowerCase()) ||
                a.getTipe().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ". " + a.getInfo());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan armada dengan kata kunci: " + keyword);
        }
    }
}