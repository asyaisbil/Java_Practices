package Practice_3;

//Aşağıda oluşturulmuş Kitap sınıfında Yapılacak Adımlar:
// 1. Kitap sınıfında "isim" adında bir özellik tanımlayın.
// 2. Getter ve setter metotlarını tanımlayın.
// İpucu: GetIsım, SetIsım. GetIsim isim değişkenini değerini dönmeli. SetIsim ise isim değişkenini değerini değiştirmeli

public class main_01 {
    private String isim;

    public void setIsim(String isim){
        this.isim = isim;
    }

    public String getIsim(){
        return this.isim;
    }

}
