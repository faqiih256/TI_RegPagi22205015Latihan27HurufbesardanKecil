/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan27.hurufbesardankecil;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang huruf besar dan huruf kecil
 * @author 62895
 */
public class TI_RegPagi22205015Latihan27HurufbesardanKecil {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 27===");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan kalimat: ");
        String kalimat = scanner.nextLine();
        
        String lowerCaseText = kalimat.toLowerCase();
        String upperCaseText = kalimat.toUpperCase();
        
        System.out.println("Huruf Kecil: "+lowerCaseText);
        System.out.print("Huruf Besar: "+upperCaseText);
        System.out.println("");
    }
}
