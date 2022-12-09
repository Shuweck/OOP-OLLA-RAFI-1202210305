//Variable Protected
public class Kapal extends TransportasiAir{
    String mesin;

//Constructor
    Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya, mesin);
    }

    @Override
    public void informasi(){
        System.out.printf("Transportasi air jenis Kapal dengan kursi berjumlah %d ditetapkan dengan biaya sebesar %d\n",jumlahKursi, biaya);
    }
    public void berlayar(){
        System.out.printf("Transportasi air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan yang tidak stabil\n",mesin);
    }
    public void berlayar(int kecepatan){
        System.out.printf("Transportasi air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan stabil di kisaran %d\n",mesin, kecepatan);
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis Kapal berlabuh di pantai");
    }