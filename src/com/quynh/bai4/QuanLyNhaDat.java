package com.quynh.bai4;

public class QuanLyNhaDat {
    private GiaoDichNha[] gdNha;
    private GiaoDichDat[] gdDat;
    private int soLuongNha;
    private int soLuongDat;

    public QuanLyNhaDat(int soLuongNha, int soLuongDat) {
        this.soLuongNha = soLuongNha;
        this.soLuongDat = soLuongDat;
        this.gdNha = new GiaoDichNha[this.soLuongNha];
        this.gdDat = new GiaoDichDat[this.soLuongDat];
    }

    public void nhapNha() {
        for (int i = 0; i < this.soLuongNha; i++) {
            this.gdNha[i] = new GiaoDichNha();
            this.gdNha[i].nhapThongTinNha();
        }
    }

    public void xuatNha() {
        for (int i = 0; i < this.soLuongNha; i++) {
            this.gdNha[i].xuatThongTinNha();
        }
    }

    public void nhapDat() {
        for (int i = 0; i < this.soLuongDat; i++) {
            this.gdDat[i] = new GiaoDichDat();
            this.gdDat[i].nhapThongTinDat();
        }
    }

    public void xuatDat() {
        for (int i = 0; i < this.soLuongDat; i++) {
            this.gdDat[i].xuatThongTinDat();
        }
    }

    public int tongNha() {
        int tong = 0;
        for (int i = 0; i < this.soLuongNha; i++) {
            tong += this.gdNha[i].getDonGia();
        }
        return tong;
    }

    public int tongDat() {
        int tong = 0;
        for (int i = 0; i < this.soLuongDat; i++) {
            tong += this.gdDat[i].getDonGia();
        }
        return tong;
    }

    public double tinhTrungBinhDat() {
        double tongtb = 0;
        for (int i = 0; i < this.soLuongDat; i++) {
            tongtb += tongDat() / this.soLuongDat;
        }
        return tongtb;
    }

//    public void xuatGiaoDichCuaNgay(){
//        if()
//    }
}
