
/**
 *
 * @author AA
 */
public class Yazilimci extends Calisan {

    private String diller; //Ek ozellik

    //Constructor gerekiyor
    //Incert Code->Generate Constructor
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }


    public void formatAt (String isletim_sistemi){

        System.out.println(getAd() + " " + isletim_sistemi + "ni yukluyor..");
    }

    //Calisan sinifindaki bilgileriGoster() override generate ediliyor
    //insert Code -> Override Method

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Yazilimcinin bildigi diller: " + diller);
    }



}
