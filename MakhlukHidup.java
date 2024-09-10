/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class MakhlukHidup {

    private String nama;
    private String jenisKelamin;

    /**
     * @return the nama
     */
    public String getNama() {
        System.out.println("ini dari mh");
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void makan() {
        System.out.println("Juga Makhluk hidup yang butuh makan");
    }

    public void berkembangBiak() {
        System.out.println("Bisa berkembang biak");
    }

    public void tumbuh() {
        System.out.println("Bisa tumbuh");
    }

    public void berevolusi() {
        System.out.println("Bisa berevolusi");
    }

    public void bermetabolisme() {
        System.out.println("Bisa terjadi anbolisme dan katabolisme");
    }

    public void bernafas() {
        System.out.println("Pasti bernafas");
    }
}
