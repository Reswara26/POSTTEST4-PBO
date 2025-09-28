/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.Scanner;
import service.ArmadaService;

/**
 *
 * @author user
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmadaService service = new ArmadaService();

        int menu = 0;

        while (menu != 8) {
            System.out.println("1. Tambah Armada Biasa");
            System.out.println("2. Tambah Armada Domestik");
            System.out.println("3. Tambah Armada Internasional");
            System.out.println("4. Lihat Armada");
            System.out.println("5. Ubah Armada");
            System.out.println("6. Hapus Armada");
            System.out.println("7. Cari Armada");
            System.out.println("8. Keluar");

            if (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka.");
                sc.nextLine();
                continue;
            }

            menu = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (menu) {
                case 1:
                    System.out.print("Masukkan ID Pesawat: ");
                    String id1 = sc.nextLine().trim();
                    System.out.print("Masukkan Tipe Pesawat: ");
                    String tipe1 = sc.nextLine().trim();
                    System.out.print("Masukkan Kapasitas Penumpang: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Kapasitas harus berupa angka.");
                        sc.nextLine();
                        break;
                    }
                    int kapasitas1 = sc.nextInt();
                    sc.nextLine();
                    service.tambahArmada(id1, tipe1, kapasitas1);
                    break;

                case 2:
                    System.out.print("Masukkan ID Pesawat: ");
                    String id2 = sc.nextLine().trim();
                    System.out.print("Masukkan Tipe Pesawat: ");
                    String tipe2 = sc.nextLine().trim();
                    System.out.print("Masukkan Kapasitas Penumpang: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Kapasitas harus berupa angka.");
                        sc.nextLine();
                        break;
                    }
                    int kapasitas2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Wilayah Operasi: ");
                    String wilayah = sc.nextLine().trim();
                    service.tambahArmadaDomestik(id2, tipe2, kapasitas2, wilayah);
                    break;

                case 3:
                    System.out.print("Masukkan ID Pesawat: ");
                    String id3 = sc.nextLine().trim();
                    System.out.print("Masukkan Tipe Pesawat: ");
                    String tipe3 = sc.nextLine().trim();
                    System.out.print("Masukkan Kapasitas Penumpang: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Kapasitas harus berupa angka.");
                        sc.nextLine();
                        break;
                    }
                    int kapasitas3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Negara Tujuan: ");
                    String negara = sc.nextLine().trim();
                    service.tambahArmadaInternasional(id3, tipe3, kapasitas3, negara);
                    break;

                case 4:
                    service.tampilkanArmada();
                    break;

                case 5:
                    System.out.print("Masukkan nomor data yang ingin diubah: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Nomor harus berupa angka.");
                        sc.nextLine();
                        break;
                    }
                    int noUbah = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID Pesawat baru: ");
                    String idBaru = sc.nextLine().trim();
                    System.out.print("Tipe Pesawat baru: ");
                    String tipeBaru = sc.nextLine().trim();
                    System.out.print("Kapasitas baru: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Kapasitas harus berupa angka.");
                        sc.nextLine();
                        break;
                    }
                    int kapasitasBaru = sc.nextInt();
                    sc.nextLine();
                    service.ubahArmada(noUbah - 1, idBaru, tipeBaru, kapasitasBaru);
                    break;

                case 6:
                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Nomor harus berupa angka.");
                        sc.nextLine();
                        break;
                    }
                    int noHapus = sc.nextInt();
                    sc.nextLine();
                    service.hapusArmada(noHapus - 1);
                    break;

                case 7:
                    System.out.print("Masukkan kata kunci pencarian (ID atau Tipe): ");
                    String keyword = sc.nextLine().trim();
                    service.cariArmada(keyword);
                    break;

                case 8:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        sc.close();
    }
}