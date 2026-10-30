# Catatan Minggu 4: Polymorphism

## Yang dikerjakan

- `Laptop` dan `AlatLab`: override `hitungDenda(int)` dengan multiplier 2x dan 4x. Keduanya memanggil `super.hitungDenda(...)` lalu mengalikan hasilnya, jadi validasi hari negatif dan pembacaan tarif dasar (`Varian.aktif().dendaPerHari`) tetap satu tempat di `Aset`.
- `KatalogAset`: dua overload `cari(...)`.
  - `cari(String kata)` mengembalikan aset yang namanya memuat kata, tanpa membedakan huruf besar atau kecil.
  - `cari(String kata, JenisAset jenis)` memakai hasil `cari(kata)` lalu menyaring berdasarkan `getJenis()`.
- Memperbaiki error dari minggu sebelumnya yang menghalangi tes: kesalahan sintaks di `Ruang` (field `kapasitas`) dan `Laptop`, serta anotasi `@Override` yang salah tempat di `Aset.hitungDenda`.

## Hasil

`.\scripts\uji.ps1 4`: 27 tes lolos, 0 gagal, termasuk 8 tes `Minggu04PolimorfismeTest`.


## Kendala dan cara mengatasinya

- Tes Laptop dan AlatLab awalnya menghasilkan 22500 dan 15000 (1x tarif) karena belum ada override dan yang terpakai rumus dasar di `Aset`. Setelah override ditambahkan, hasilnya 45000 dan 60000 sesuai tes.

## Penggunaan AI

- **Alat:** Claude (Anthropic).
- **bagian yang dibantu:**
  - Menjelaskan konsep overriding, overloading, dan dynamic binding dari perintah minggu 4.
  - Menyusun kode dua method `cari(...)` di `KatalogAset` dan override `hitungDenda` di `Laptop` dan `AlatLab`.
- **promt utama:**bantu saya memahami kode dari perintah minggu 4
  - Membaca output error Maven dan menunjuk penyebabnya (`Ruang`, `Laptop`, `@Override` di `Aset`)
- **yang saya ubah atau tolak dari ai:** memperbaiki error di `Ruang`, `Laptop`, dan `Aset`.
-**yang saya pahami:**
- **Overriding:** subclass menulis ulang method superclass dengan tanda tangan yang sama. Versi yang dijalankan dipilih saat program berjalan berdasarkan objek aslinya (dynamic binding). Jadi `Aset a = new Laptop(...); a.hitungDenda(3)` memakai versi `Laptop`.
- **Overloading:** satu class punya beberapa method bernama sama dengan parameter berbeda, dan dipilih saat kompilasi. Contohnya dua method `cari(...)` di `KatalogAset`.
- `@Override` hanya boleh dipakai di subclass. Di `Aset` (class paling atas) anotasi itu menyebabkan error kompilasi.

