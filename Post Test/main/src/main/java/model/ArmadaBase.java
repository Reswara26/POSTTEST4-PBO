/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public abstract class ArmadaBase {
    private String id;
    private String tipe;
    private int kapasitas;

    public ArmadaBase(String id, String tipe, int kapasitas) {
        this.id = id;
        this.tipe = tipe;
        this.kapasitas = kapasitas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getInfo() {
        return "ID: " + id + ", Tipe: " + tipe + ", Kapasitas: " + kapasitas;
    }

    public abstract String getKategori();
}