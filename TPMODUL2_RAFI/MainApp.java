
public class MainApp {
    public static void main(String[] args){
        Perangkat device = new Perangkat("Nokia", 4, 1.5f);
        device.informasi();
        System.out.println("");
        Laptop laptop = new Laptop("SSD", 8, 2.5f, true);
        laptop.informasi();
        laptop.bukaGame("Koikatsu");
        laptop.kirimEmail("supermanmatidisurga@gmail.com");
        laptop.kirimEmail("anjanath@gmail.com", "fatalis@gmail.com");
        System.out.println("");
        Handphone hp = new Handphone("MicroSD", 16, 3.5f, true);
        hp.informasi();
        hp.telfon(123456789);
        hp.kirimSMS(123456789);
        hp.kirimSMS(123456789, 987654321);
    }
}