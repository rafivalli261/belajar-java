/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
package materi_objectdanclass;

/**
 *
 * @author ASUS
 */
public class Ninggen {

    private String nama; // definisi attribut
    private String jKelamin;
    private int umur;

    public void setNama(String a) { // definisi method
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setJkelamin(String jk) {
        jKelamin = jk;
    }

    public String getJkelamin() {
        return jKelamin;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }

    public void isiParam(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void cetakKeLayar() {
        System.out.println("Nama : " + nama + " , Umur : " + umur + " tahun");
    }

    public static void main(String[] args) {
        Ninggen mns = new Ninggen();
        mns.isiParam("Muhammad Rafi Valliansyah", 20);
        mns.cetakKeLayar();

    }

}
