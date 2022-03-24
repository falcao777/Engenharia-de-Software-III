/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class main {
    public static void main(String[] args) {
        Fila nfila =Fila.getInstance();
        nfila.setPapel("Impressão");
        Fila nfila2 = Fila.getInstance();
        nfila2.setPapel("Papel branco ");
        
        System.out.println(nfila.getPapel());
        System.out.println(nfila2.getPapel());
        
    }
}
