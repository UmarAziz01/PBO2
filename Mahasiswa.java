/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Manusia implements Nilai, NIM {

    public Mahasiswa(String nama) {
        super(nama);
    }

    @Override
    public void punyaNilai() {
        System.out.println("Butuh Nilai");
    }

    @Override
    public void punyaNIM() {
        System.out.println("Butuh NIM");
    }

    @Override
    public void ciri() {
        System.out.println("Mahasiswa Berilmu");
    }

    public void ciriUtama() {
        this.ciri();
        super.ciri();
    }

}
