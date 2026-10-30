## catatan minggu 03

## Ringkasan pekerjaan
 
Saya mengisi tiga subclass dari `Aset`: `Ruang`, `Laptop`, dan `AlatLab`. Tiap subclass memanggil `super(kode, nama)` di konstruktor, menambahkan field khusus jenisnya, menyediakan getter, dan meng-override `getJenis()` agar mengembalikan `RUANG`, `LAPTOP`, atau `ALAT_LAB`.

## Keputusan desain
 
**Field di induk (`Aset`):** `kode`, `nama`, `status`, dan `kondisi`. Keempatnya dimiliki semua jenis aset, jadi cukup ditulis sekali dan dipakai ulang oleh subclass.
 
**Field di subclass:**
- `Ruang`: `kapasitas`, karena hanya ruang yang punya kapasitas.
- `Laptop`: `spesifikasi` dan `nomorInventaris`, karena tidak relevan untuk ruang atau alat lab.
- `AlatLab`: `laboratorium` dan `tingkatRisiko`, karena khusus alat laboratorium.
Jika field khusus ditaruh di `Aset`, ruang akan punya `nomorInventaris` yang selalu kosong dan laptop akan punya `kapasitas` yang tidak bermakna.
 
**Validasi:** validasi data umum (kode dan nama tidak boleh kosong) tetap di `Aset` sehingga otomatis berlaku di semua subclass. Validasi khusus (kapasitas > 0, spesifikasi dan nomor inventaris tidak kosong, laboratorium tidak kosong, risiko tidak null) ada di konstruktor subclass dan melempar `IllegalArgumentException`, konsisten dengan `Aset`.

## Satu keterbatasan inheritance
 
Contoh di sistem ini: sebuah aset yang perannya bisa berubah atau gabungan dua jenis. Misalnya laptop khusus yang ditempatkan permanen di laboratorium dan diperlakukan sebagai alat lab (punya `laboratorium` dan `tingkatRisiko`) sekaligus laptop (punya spesifikasi dan nomorInventaris).
 
Dengan hierarki  itu tidak bisa dimodelkan dengan baikkarena:
- Java hanya mengizinkan satu induk class, jadi satu class tidak bisa mewarisi `Laptop` dan `AlatLab` sekaligus.
- Jenis ditetapkan saat objek dibuat lewat class-nya. Aset tidak bisa berganti dari `Laptop` menjadi `AlatLab` tanpa membuat objek baru.

## Penggunaan AI
 
Saya memakai Claude (Anthropic) untuk membantu mengisi kode `Ruang`, `Laptop`, dan `AlatLab` serta menyusun draf catatan ini. Saya memberikan file tugas, file `Aset`, dan file tes kepada AI, lalu AI menghasilkan implementasi yang dicocokkan dengan aturan di `minggu-03.md` dan tes.
 

## Penggunaan AI
- Alat yang dipakai: claude
- Bagian yang dibantu AI: laptop.java, AlatLab.java
- Prompt utama: jelaskan apa saja yang harus di isi dan gimana cara memvalidasinya dibagian laptop.java dengan membaca file minggu-03.md dan jelaskan tiap kodenya juga.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: saya memerintahkan ai untuk menjelaskan inheritance
- Satu hal yang saya pahami lebih baik sekarang:subclass tidak perlu menulis ulang semua field induknya. Kode dan nama cukup dikelola oleh `Aset`; `Ruang` menambahkan kapasitas dan memanggil constructor induk melalui `super(kode, nama)`.