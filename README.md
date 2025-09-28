# POSTTEST4-PBO
Nama: Reswara Ganendra Rashi Dewa

Kelas: C 2024

NIM: 2409116100

## Deskripsi Singkat Program
Program ini adalah aplikasi berbasis Java untuk mengelola data armada pesawat.  
Data yang dikelola meliputi:

- ID Pesawat  
- Tipe Pesawat  
- Kapasitas Maksimal Penumpang  

Program ini dibangun menggunakan struktur **multi-class dan multi-package**, serta sudah menerapkan:

- Constructor dan access modifier  
- Encapsulation (getter dan setter)  
- Inheritance dan overriding  
- Validasi input  
- Fitur pencarian data (search)  
- Arsitektur MVC (Model–View–Controller)

## Struktur Packages
Program ini dibagi menjadi 3 package utama:

- `model` → berisi class `Armada.java` sebagai superclass, serta subclass `ArmadaDomestik.java` dan `ArmadaInternasional.java`  
- `service` → berisi class `ArmadaService.java` yang menangani logika CRUD, validasi, dan pencarian  
- `main` → berisi class `Main.java` sebagai antarmuka pengguna (menu interaktif)

## Penerapan MVC (Model–View–Controller)

Program ini sudah menerapkan arsitektur **MVC**, yang memisahkan peran masing-masing komponen:

- **Model** (`Armada`, `ArmadaDomestik`, `ArmadaInternasional`)  
  Menyimpan struktur data pesawat, termasuk atribut, constructor, dan method `getInfo()` yang di-*override*.

- **View** (`Main.java`)  
  Menyediakan antarmuka pengguna berupa menu interaktif dan input/output melalui console.

- **Controller** (`ArmadaService.java`)  
  Menangani logika program seperti tambah, ubah, hapus, tampilkan, dan cari data armada.  
  Juga bertanggung jawab atas validasi input dan pengolahan data.

## Penerapan Abstraction
Program ini menggunakan kombinasi abstract class dan interface:
- ArmadaBase.java → abstract class yang menjadi superclass untuk semua jenis armada.
Memuat method abstract getKategori() yang wajib dioverride oleh subclass.
- Operasional.java → interface yang digunakan oleh ArmadaDomestik dan ArmadaInternasional untuk mendefinisikan method jadwalOperasi().
Dengan ini, program memenuhi nilai tambah karena menggunakan abstract class dan interface secara bersamaan.

## Penerapan Polymorphism
Program ini menerapkan dua bentuk polymorphism:
- Overriding
Method getInfo() dioverride di:
- Armada.java
- ArmadaDomestik.java
- ArmadaInternasional.java
Tujuannya agar informasi yang ditampilkan sesuai dengan jenis armada masing-masing.
- Overloading
Method tambahArmada() di ArmadaService.java memiliki dua versi:
- tambahArmada(String id, String tipe, int kapasitas)
- tambahArmada(String id, String tipe) → versi default kapasitas 100

## Fitur Program
1. **Tambah Armada Biasa** – Menambahkan data pesawat tanpa subclass  
2. **Tambah Armada Domestik** – Menambahkan data pesawat dengan wilayah operasi  
3. **Tambah Armada Internasional** – Menambahkan data pesawat dengan negara tujuan  
4. **Lihat Armada** – Menampilkan seluruh data pesawat yang tersimpan  
5. **Ubah Armada** – Mengubah data pesawat berdasarkan nomor urut  
6. **Hapus Armada** – Menghapus data pesawat berdasarkan nomor urut  
7. **Cari Armada** – Mencari data pesawat berdasarkan ID atau tipe  
9. **Keluar** – Mengakhiri program

## Penjelasan Alur Program (POV Pengguna)

### Menu Utama
Setelah program dijalankan, pengguna akan melihat 8 pilihan menu:
1. Tambah Armada Biasa
2. Tambah Armada Domestik
3. Tambah Armada Internasional
4. Lihat Armada
5. Ubah Armada
6. Hapus Armada
7. Cari Armada
8. Keluar

### Pilihan 1 – Tambah Armada Biasa
Jika pengguna memilih menu 1, program akan meminta input berupa:
- ID Pesawat
- Tipe Pesawat
- Kapasitas Penumpang

Program akan memvalidasi input:
- ID dan tipe tidak boleh kosong
- Kapasitas harus berupa angka positif

Jika valid, data akan langsung tersimpan dan muncul saat pengguna melihat daftar armada.

### Pilihan 2 – Tambah Armada Domestik
Jika pengguna memilih menu 2, program akan meminta input tambahan berupa wilayah operasi.  
Data akan disimpan sebagai objek `ArmadaDomestik` dan ditampilkan dengan label `[Domestik: wilayah]`.

### Pilihan 3 – Tambah Armada Internasional
Jika pengguna memilih menu 3, program akan meminta input tambahan berupa negara tujuan.  
Data akan disimpan sebagai objek `ArmadaInternasional` dan ditampilkan dengan label `[Internasional: negara]`.

### Pilihan 4 – Lihat Armada
Jika pengguna memilih menu 4, program akan menampilkan seluruh data armada yang tersimpan, baik domestik maupun internasional.  
Setiap data ditampilkan menggunakan method `getInfo()` yang sudah di-*override* sesuai jenis armada.

### Pilihan 5 – Ubah Armada
Jika pengguna memilih menu 5, program akan meminta nomor urut data yang ingin diubah.  
Setelah pengguna memasukkan nomor dan data baru, program akan memvalidasi input dan langsung memperbarui informasi pesawat tersebut.

### Pilihan 6 – Hapus Armada
Jika pengguna memilih menu 6, program akan meminta nomor urut data yang ingin dihapus.  
Setelah pengguna memasukkan nomor yang valid, data tersebut akan dihapus dari daftar.

### Pilihan 7 – Cari Armada
Jika pengguna memilih menu 7, program akan meminta kata kunci pencarian (ID atau tipe).  
Program akan menampilkan semua armada yang cocok dengan kata kunci tersebut.

### Pilihan 8 – Keluar
Jika pengguna memilih menu 8, program akan menampilkan pesan "Keluar dari program..." dan berhenti berjalan.
