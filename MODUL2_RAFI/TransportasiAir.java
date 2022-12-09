//variable protected
public class TransportasiAir{
    int jumlahKursi;
    int biaya;

//constructor 
    TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
//Method public
    public void informasi(){
        System.out.printf("Transportasi air tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar %d\n",jumlahKursi, biaya);
}
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlabuh di pantai");
    }
}