/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa dya = new Mahasiswa("Dya");
        dya.bernafas();
        dya.punyaNilai();
        dya.punyaNIM();
        dya.ciriUtama();
        
        System.out.println(" ");
        System.out.println(" ");
        MakhlukHidup beringin = (MakhlukHidup) dya; // Casting dari Mahasiswa ke MakhlukHidup
        beringin.bernafas();

        
        
        
        
        
       
                
    }
    
}
