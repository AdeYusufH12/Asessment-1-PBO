package No1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DataPengirim> dataPengirims = new ArrayList<>();

        //Data Asuransi + Dropship
        dataPengirims.add(new DataPengirim("Dropship1",
                "Surabaya", "N0001",
                "JNE", "Bejo",
                "DayeuhKolot", "1", 21000.0, 40000.0));

        //Data Asuransi
        dataPengirims.add(new DataPengirim("Eigher",
                "Bandung Kopo", "N0003",
                "J&T", "Tini",
                "DayeuhKolot", "2", 16000.0,40000.0));

        //Data Normal
        DataPengirim data1 = new DataPengirim("Eigher",
                "Bandung Kopo", "N0004",
                "Pos Indonesia", "Bambang",
                "DayeuhKolot", "3", 23000.0);

        //Data Dropship
        DataPengirim data2 = new DataPengirim("Dropship2",
                "Pontianak", "N0002",
                "Pos Indonesia", "Joko",
                "DayeuhKolot", "4", 24000.0);

        for (DataPengirim data:dataPengirims
             ) {

            System.out.println("No Transaksi : " +data.getNoTransaksi());
            System.out.println("No resi : " +data.getNoResi());
            System.out.println("Nama Ekpedisi : " +data.getNamaEkpedisi());
            System.out.println("Ongkos Kirim : " +data.getOngkosKirim());
            System.out.println("Nama Pengirim : " +data.getNamaPengirim());
            System.out.println("Alamat Pengirim : " +data.getAlamatPengirim());
            System.out.println("Nama Penerima : " +data.getNamaPenerima());
            System.out.println("Alamat Penerima : " +data.getAlamatPenerima());
            System.out.println("Nominal Asuransi : " +data.getNominalAsuransi());
            System.out.println("");

        }

        //Memanggil Data Normal
        System.out.println("No Transaksi : " +data1.getNoTransaksi());
        System.out.println("No resi : " +data1.getNoResi());
        System.out.println("Nama Ekpedisi : " +data1.getNamaEkpedisi());
        System.out.println("Ongkos Kirim : " +data1.getOngkosKirim());
        System.out.println("Nama Pengirim : " +data1.getNamaPengirim());
        System.out.println("Alamat Pengirim : " +data1.getAlamatPengirim());
        System.out.println("Nama Penerima : " +data1.getNamaPenerima());
        System.out.println("Alamat Penerima : " +data1.getAlamatPenerima());
        System.out.println("");

        //Memanggil Data Dropshiper
        System.out.println("No Transaksi : " +data2.getNoTransaksi());
        System.out.println("No resi : " +data2.getNoResi());
        System.out.println("Nama Ekpedisi : " +data2.getNamaEkpedisi());
        System.out.println("Ongkos Kirim : " +data2.getOngkosKirim());
        System.out.println("Nama Pengirim : " +data2.getNamaPengirim());
        System.out.println("Alamat Pengirim : " +data2.getAlamatPengirim());
        System.out.println("Nama Penerima : " +data2.getNamaPenerima());
        System.out.println("Alamat Penerima : " +data2.getAlamatPenerima());
        System.out.println("");


    }
}
