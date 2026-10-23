# catatan minggu 02


## yang saya kerjakan
- Saya melengkapi class Aset pada Minggu 2 Isinya field private kode, nama, status, kondisi.

## keputusan desain
- Field kode saya buat final dan tanpa setter, sesuai aturan bahwa kode tidak boleh diubah setelah objek dibuat.
- Kode dan nama dianggap tidak valid bila null atau kosong, termasuk string yang hanya berisi spasi (isBlank()), dan melempar IllegalArgumentException.

## kendala
- Awalnya saya bingung memahami bagian konstruktor dengan validasi, getter, setter dengan validasi, dan nilai awal status TERSEDIA serta kondisi BAIK. Saya belum paham kenapa field dibuat private, lalu kenapa pengecekan harus ditaruh di konstruktor dan setter.

## Penggunaan AI
Alat yang dipakai: Claude
Bagian yang dibantu AI: class Aset (knstruktor, getter/setter, validasi)
Prompt utama: bantu saya memahami materi encapsulation menggunakan kode yang saya kirim (dengan melampirkan Aset.java)
Yang saya ubah atau tolak dari saran AI, dan alasannya:
Satu hal yang saya pahami lebih baik sekarang: saya sudah paham tentang konsep encapsulation, getter dan setter.