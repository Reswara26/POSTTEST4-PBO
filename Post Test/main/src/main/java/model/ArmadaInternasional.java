/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public class ArmadaInternasional extends ArmadaBase implements Operasional {
    private String negaraTujuan;

    public ArmadaInternasional(String id, String tipe, int kapasitas, String negaraTujuan) {
        super(id, tipe, kapasitas);
        this.negaraTujuan = negaraTujuan;
    }

    public String getNegaraTujuan() {
        return negaraTujuan;
    }

    public void setNegaraTujuan(String negaraTujuan) {
        this.negaraTujuan = negaraTujuan;
    }

    @Override
    public String getKategori() {
        return "Armada Internasional";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [" + getKategori() + ": " + negaraTujuan + "]";
    }

    @Override
    public String jadwalOperasi() {
        return "Beroperasi sesuai jadwal internasional ke " + negaraTujuan;
    }
}