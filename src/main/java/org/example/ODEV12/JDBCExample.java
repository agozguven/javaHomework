package org.example.ODEV12;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test_automation";
        String kullaniciAdi = "root";
        String sifre = "test123";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Veritabanına bağlantı oluşturulması
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            // Sorgu hazırlama
            String sqlSorgusu = "SELECT * FROM ad_soyad WHERE id = ?";
            preparedStatement = connection.prepareStatement(sqlSorgusu);
            preparedStatement.setInt(1, 1); // Sorgu için parametre ataması

            // Sorgunun çalıştırılması ve sonucun alınması
            resultSet = preparedStatement.executeQuery();

            // Sonuçların işlenmesi
            while (resultSet.next()) {
                // Her bir sonuç satırının işlenmesi
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("ad");
                String soyad = resultSet.getString("soyad");
                // ... Diğer sütunların alınması
                System.out.println("ID: " + id + ", Ad: " + ad + ", Soyad: " + soyad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Kapatma işlemleri
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }

