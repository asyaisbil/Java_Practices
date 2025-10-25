/*Aşağıdaki VeritabaniBaglantisi sınıfında, her seferinde yeni bir nesne oluşturulmaktadır.
Singleton deseni gereği sadece bir bağlantı örneği olması gerekir.
Yapılacak Adımlar:
1. VeritabaniBaglantisi sınıfını, yalnızca bir nesnenin oluşturulmasını sağlayacak şekilde düzenleyin.
("Veritabanı bağlantısı oluşturuluyor..." ekrana yazdırılsın)
2. getInstance metodunda yalnızca bir nesne oluşturulmasını sağlayın.*/

public class VeritabaniBaglantisi {
    private static VeritabaniBaglantisi instance;


    // Yapıcı metot (constructor) burada olacak


    public static VeritabaniBaglantisi getInstance() {
        // Her seferinde yeni bir nesne oluşturuluyor, düzeltilecek
        return new VeritabaniBaglantisi();
    }
}
