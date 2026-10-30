package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    private final String spesifikasi;
    private final String nomorInventaris;

    // TODO minggu 3: field spesifikasi dan nomorInventaris.

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        if (spesifikasi == null || spesifikasi.isBlank()){
            throw new IllegalArgumentException("Spesifikasi laptop tidak boleh kosong");
        }
        if (nomorInventaris == null || nomorInventaris.isBlank()) {
            throw new IllegalArgumentException("Nomor inventaris laptop tidak boleh kosong");
        }
        this.spesifikasi = spesifikasi;
        this.nomorInventaris = nomorInventaris;
    }
    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public JenisAset getJenis(){
        return JenisAset.LAPTOP;
    }

    /** Denda laptop 2x tarif dasar. Validasi hari negatif dan tarif dasar dihitung di Aset. */
    @Override
    public long hitungDenda(int hariTerlambat) {
        return super.hitungDenda(hariTerlambat) * 2;
    }
}