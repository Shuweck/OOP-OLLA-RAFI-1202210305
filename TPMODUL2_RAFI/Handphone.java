public class Handphone extends Perangkat{
    protected boolean fingerprint;
    Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    @Override
    public void informasi(){
        if (fingerprint){
            System.out.printf("Handphone memiliki drive tipe %s dengan ram sebesar %d GB dan processor sebesar %.2f GHz dan memiliki fingerprint\n",this.drive, this.ram, this.processor);
        } else {
            System.out.printf("Handphone memiliki drive tipe %s dengan ram sebesar %d GB dan processor sebesar %.2f GHz dan tidak memiliki fingerprint\n",this.drive, this.ram, this.processor);
        }
    }
    public void telfon(int nomor_telfon){
        System.out.printf("Handphone berhasil menyambungkan panggilan ke %s\n",nomor_telfon);
    }
    public void kirimSMS(int nomor_telfon){
        System.out.printf("Handphone berhasil mengirim SMS ke %s\n",nomor_telfon);
    }
    public void kirimSMS(int nomor_telfon1, int nomor_telfon2){
        System.out.printf("Handphone berhasil mengirim SMS ke %s dan %s\n",nomor_telfon1,nomor_telfon2);
    }
}
//