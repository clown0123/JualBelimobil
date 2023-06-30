public class Dealer {
    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;
    
public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas){
    this.nama = nama;
    this.mobilBaru = mobilBaru;
    this.mobilBekas = mobilBekas;
}    
public String getnama(){
    return nama;
}
public void info(){
    System.out.println("Dealer: " + nama);
    mobilBaru.info();
    mobilBekas.info();
}
}
