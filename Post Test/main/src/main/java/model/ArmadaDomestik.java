/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public class ArmadaDomestik extends ArmadaBase implements Operasional {
    private String wilayahOperasi;

    public ArmadaDomestik(String id, String tipe, int kapasitas, String wilayahOperasi) {
        super(id, tipe, kapasitas);
        this.wilayahOperasi = wilayahOperasi;
    }

    public String getWilayahOperasi() {
        return wilayahOperasi;
    }

    public void setWilayahOperasi(String wilayahOperasi) {
        this.wilayahOperasi = wilayahOperasi;
    }

    @Override
    public String getKategori() {
        return "Armada Domestik";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [" + getKategori() + ": " + wilayahOperasi + "]";
    }

    @Override
    public String jadwalOperasi() {
        return "Beroperasi setiap hari pukul 06.00–18.00 di wilayah " + wilayahOperasi;
    }
}