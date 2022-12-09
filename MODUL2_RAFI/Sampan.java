//variable protected
public class Sampan extends TransportasiAir{
    int layar;

//Constructor
    Sampan(int layar){
        super(layar);
    }

//Method Public
    @Override
    public void informasi(){
        System.out.printf("Transportasi air jenis Sampan dengan kursi berjumlah %d ditetapkan dengan biaya sebesar %d\n",jumlahKursi, biaya);
    }
    public void berlayar(){
        System.out.printf("Transportasi air jenis Sampan sedang berlayar menggunakan %d layar\n",layar);
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.printf("Transportasi air jenis Sampan berlabuh di pantai menggunakan %d jangkar\n",jangkar);
    }
}