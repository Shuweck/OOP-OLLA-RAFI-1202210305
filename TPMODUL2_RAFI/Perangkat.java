//variable protected
public class Perangkat {
    String drive;
    int ram;
    float processor;
//constructor perangkat
    Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
//method untuk menampilkan data    
    public void informasi(){
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe Nokia dengan ram sebesar %d GB dan processor sebesar %.2f GHz\n",ram, processor);
        
    }
}
