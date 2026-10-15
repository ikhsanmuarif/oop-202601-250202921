# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Saya menyiapkan JDK 21, Maven, Git, dan repo, lalu mengisi `mahasiswa.properties` dengan nama dan NIM saya. Setelah itu saya mengisi `TODO` di tiga class: `HelloProsedural`, `HelloOOP`, dan `HelloFungsional`. Ketiganya menghasilkan sapaan yang sama, yaitu memuat "Aset-Pinjam", nama, dan NIM.

## Keputusan desain
Saya memakai bentuk sapaan yang sama di ketiga gaya, yaitu `Hello Aset-Pinjam, saya <nama> (<NIM>)`, supaya perbedaan paradigmanya terlihat dari cara kodenya disusun, bukan dari hasilnya. Bentuk ini juga mengikuti contoh di komentar `HelloProsedural`.

## Kendala
## Kendala
Kendala utama saya adalah Maven belum terpasang di komputer saya, sehingga saya tidak bisa langsung menjalankan `bash scripts/uji.sh` untuk memeriksa apakah `Minggu01Test` lulus sebelum push. Karena itu saya lebih berhati-hati saat menulis kodenya.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: memberi contoh satu implementasi`HelloOOP.sapa`
- Prompt utama:
  1. saya sedang belajar oop, bantu saya memahami kode ini dan jelaskan setiap fungsi      fungsinya, beritahu kode apa yang salah dan mengapa
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menolak menerima file jadi di awal dan meminta langkah-langkahnya dulu supaya saya memahami alurnya sebelum melihat kodenya.
- Satu hal yang saya pahami lebih baik sekarang: Ketiga gaya bisa menghasilkan teks yang sama, tetapi cara data diperlakukan berbeda. Di gaya prosedural data dikirim lewat parameter fungsi, di OOP data disimpan sebagai field milik objek, dan di fungsional nilai NIM diambil oleh lambda sehingga fungsi yang dikembalikan tinggal menerima nama.