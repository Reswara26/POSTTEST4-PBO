/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public class Armada extends ArmadaBase {

    public Armada(String id, String tipe, int kapasitas) {
        super(id, tipe, kapasitas);
    }

    @Override
    public String getKategori() {
        return "Armada Biasa";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [" + getKategori() + "]";
    }
}