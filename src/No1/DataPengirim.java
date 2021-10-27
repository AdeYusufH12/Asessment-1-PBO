package No1;

public class DataPengirim {
    private String namaPengirim;
    private String alamatPengirim;
    private String noResi;
    private String namaEkpedisi;
    private String namaPenerima;
    private String alamatPenerima;
    private String noTransaksi;
    private double ongkosKirim;
    private double nominalAsuransi;

    public DataPengirim(String namaPengirim, String alamatPengirim, String noResi, String namaEkpedisi, String namaPenerima, String alamatPenerima, String noTransaksi, double ongkosKirim) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.noResi = noResi;
        this.namaEkpedisi = namaEkpedisi;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.noTransaksi = noTransaksi;
        this.ongkosKirim = ongkosKirim;
    }

    //Data AsuransiDropship dan Data Asuransi
    public DataPengirim(String namaPengirim, String alamatPengirim, String noResi, String namaEkpedisi, String namaPenerima, String alamatPenerima, String noTransaksi, double ongkosKirim, double nominalAsuransi) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.noResi = noResi;
        this.namaEkpedisi = namaEkpedisi;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.noTransaksi = noTransaksi;
        this.ongkosKirim = ongkosKirim;
        this.nominalAsuransi = nominalAsuransi;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public String getAlamatPengirim() {
        return alamatPengirim;
    }

    public String getNoResi() {
        return noResi;
    }

    public String getNamaEkpedisi() {
        return namaEkpedisi;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    public String getNoTransaksi() {
        return noTransaksi;
    }

    public double getOngkosKirim() {
        return ongkosKirim;
    }

    public double getNominalAsuransi() {
        return nominalAsuransi;
    }
}
