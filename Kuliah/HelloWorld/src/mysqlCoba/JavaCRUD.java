/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysqlCoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class JavaCRUD {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/koleksi";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmn;
    static ResultSet rs;

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) {
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmn = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }
            stmn.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertAnime();
                    break;
                case 2:
                    showAnime();
                    break;
                case 3:
                    updateAnime();
                    break;
                case 4:
                    deleteAnime();
                    break;
                default:
                    System.out.println("Pilihan Salah!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showAnime() {
        String sql = "SELECT * FROM anime";
        try {
            rs = stmn.executeQuery(sql);

            System.out.println("+------------------------------------------------|");
            System.out.println("|    DATA ANIME DI PERPUSTAKAAN    |");
            System.out.println("+------------------------------------------------|");

            while (rs.next()) {
                int idAnime = rs.getInt("id");
                String judul = rs.getString("judul");
                String genre = rs.getString("genre");
                int rilis = rs.getInt("rilis");
                int episode = rs.getInt("episode");

                // print data
                System.out.println("ID Anime : " + idAnime);
                System.out.println("Judul : " + judul);
                System.out.println("Tahun Rilis : " + rilis);
                System.out.println("Jumlah Episode : " + episode);
                System.out.println("Genre : " + genre);
                System.out.println("");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insertAnime() {
        try {
            // ambil input dari user
            System.out.print("Judul : ");
            String judul = input.readLine().trim();
            System.out.print("Tahun Rilis : ");
            int rilis = Integer.parseInt(input.readLine());
            System.out.print("Jumlah Episode : ");
            int episode = Integer.parseInt(input.readLine());
            System.out.print("Genre : ");
            String genre = input.readLine();

            // query simpan
            String sql = "INSERT INTO anime (judul, rilis, episode, genre) VALUE('%s', '%d', '%d', '%s')";
            sql = String.format(sql, judul, rilis, episode, genre);

            // simpan anime
            stmn.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void updateAnime() {
        try {
            // ambil input dari user
            System.out.print("ID Anime : ");
            int idAnime = Integer.parseInt(input.readLine());
            System.out.print("Judul : ");
            String judul = input.readLine().trim();
            System.out.print("Tahun Rilis : ");
            int rilis = Integer.parseInt(input.readLine());
            System.out.print("Jumlah Episode : ");
            int episode = Integer.parseInt(input.readLine());
            System.out.print("Genre : ");
            String genre = input.readLine();

            // query update
            String sql = "UPDATE anime SET judul = '%s', rilis = '%d', episode = '%d', genre = '%s' WHERE id=%d";

            sql = String.format(sql, judul, rilis, episode, genre, idAnime);

            // simpan anime
            stmn.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteAnime() {
        try {
            // ambil input dari user
            System.out.print("ID yang mau dihapus : ");
            int idAnime = Integer.parseInt(input.readLine());

            // buat query hapus
            String sql = String.format("DELETE FROM anime WHERE idAnime=%d", idAnime);

            // hapus data
            stmn.execute(sql);
            System.out.println("Data telah terhapus ... ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
// id, judul, rilis, episode, genre, 
