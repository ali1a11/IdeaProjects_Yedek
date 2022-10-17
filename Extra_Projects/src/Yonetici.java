
/**
 *
 * @author AA
 */
public class Yonetici extends Calisan {
    private int sorumlu_kisi_s; // Ek ozellik

    //Constructor

    /**
     *
     * @param sorumlu_kisi_s
     * @param ad
     * @param soyad
     * @param id
     * @param sorumlu_kisi_s
     */
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_s) {
        super(ad, soyad, id);
        this.sorumlu_kisi_s = sorumlu_kisi_s;
    }

    //Calisan sinifindaki bilgileriGoster() override generate ediliyor
    //insert Code -> Override Method
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi: " + sorumlu_kisi_s);
    }

    //Ek method
    public void zamYap(int zam_miktari){
        System.out.println(getAd() + " " + getSoyad() + " calisanlara " + zam_miktari + " zam yapti.");
    }

}
