package org.example.ODEV12;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.util.Optional;

public class JDBIExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11686526";
        String kullaniciAdi = "sql11686526";
        String sifre = "9L9fSIcXpY";

        // JDBI nesnesinin oluşturulması ve bağlantının alınması
        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
        try (Handle handle = jdbi.open()) {
            // SQL sorgusunun hazırlanması ve çalıştırılması
            handle.execute("CREATE TABLE IF NOT EXISTS ad_soyad (id SERIAL PRIMARY KEY, ad VARCHAR(100), soyad VARCHAR(100))");
            handle.execute("INSERT INTO ad_soyad (ad,soyad) VALUES (?,?)", "Gokce", "Ozguven");
            handle.execute("INSERT INTO ad_soyad (ad,soyad) VALUES (?,?)", "Umut", "Ozguven");
            handle.execute("INSERT INTO ad_soyad (ad,soyad) VALUES (?,?)", "Gokhan", "Ozguven");

            System.out.println("Tüm veriler:");
            handle.createQuery("SELECT * FROM ad_soyad")
                    .mapToMap()
                    .forEach(System.out::println);

            // Bir veriyi silme
            int deletedCount = handle.execute("DELETE FROM ad_soyad WHERE id = ?", 2);
            if (deletedCount > 0) {
                System.out.println("Veri başarıyla silindi.");
            } else {
                System.out.println("Belirtilen ID'ye sahip bir veri bulunamadı.");
            }

            // Güncellenmiş verileri listeleme
            System.out.println("\nGüncellenmiş veriler:");
            handle.createQuery("SELECT * FROM ad_soyad")
                    .mapToMap()
                    .forEach(System.out::println);

        } catch (StatementException e) {
            e.printStackTrace();
        }
    }
}


