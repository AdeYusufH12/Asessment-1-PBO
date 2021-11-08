package No1;

public class Main {
    public static void main(String[] args) {
        DataPengirim dataUtama = new DataPengirim("3", "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot");
        DataPengirim dataAsuransi = new DataPengirim("2","N0003","J&T",21000,"Eiger","Bandung Kopo","Tini","DayeuhKolot",40000);
        DataPengirim dataDropshipper = new DataPengirim("4","N0002","siCepat",24000,"Eiger","Bandung Kopo","Dropship2","Pontianak","Joko","DayeuhKolot","yes");
        DataPengirim dataAsuransiDropshipper = new DataPengirim("1","N0001","JNE",21000,"Eiger","Bandung Kopo","Dropship1","Surabaya","Bejo","DayeuhKolot",40000,"yes");

        //Asuransi + Dropship
        System.out.println("Asuransi + Dropshipper");
        dataAsuransiDropshipper.Output();

        //Asuransi
        System.out.println("Asuransi");
        dataAsuransi.Output();

        //Utama/Normal
        System.out.println("Utama");
        dataUtama.Output();

        //Dropship
        System.out.println("Dropshipper");
        dataDropshipper.Output();
        System.out.println("");
    }
}
