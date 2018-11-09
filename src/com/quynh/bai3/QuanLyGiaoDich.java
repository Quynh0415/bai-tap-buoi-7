package com.quynh.bai3;

public class QuanLyGiaoDich {
    private GiaoDichTienTe[] gdtt;
    private GiaoDichVang[] gdv;
    private int soLuongVang;
    private int soLuongTienTe;

    public QuanLyGiaoDich(int soLuongVang, int soLuongTienTe) {
       this.soLuongVang = soLuongVang;
       this.soLuongTienTe = soLuongTienTe;
       this.gdv = new GiaoDichVang[this.soLuongVang];
       this.gdtt = new GiaoDichTienTe[this.soLuongTienTe];
    }

    public void nhapVang(){
        for (int i = 0; i < this.soLuongVang; i++) {
            this.gdv[i] = new GiaoDichVang();
            this.gdv[i].nhapGiaoDichVang();
        }
    }

    public void xuatVang(){
        for (int i = 0; i < this.soLuongVang; i++) {
            this.gdv[i].xuatGiaoDichVang();
        }
    }

    public void nhapTienTe(){
        for (int i = 0; i < this.soLuongTienTe; i++) {
            this.gdtt[i] = new GiaoDichTienTe();
            this.gdtt[i].nhapGiaoDichTienTe();
        }
    }

    public void xuatTienTe(){
        for (int i = 0; i < this.soLuongTienTe; i++) {
            this.gdtt[i].xuatGiaoDichTienTe();
        }
    }

    public int tongVang(){
        int tong = 0;
        for (int i = 0; i < this.soLuongVang; i++) {
            tong += this.gdv[i].getThanhTien();
        }
        return tong;
    }

    public int tongTienTe(){
        int tong = 0;
        for (int i = 0; i < this.soLuongTienTe; i++) {
            tong += this.gdtt[i].getTiGia();
        }
        return tong;
    }

    public double trungBinhTienTe(){
        double tongtb = 0;
        for (int i = 0; i < this.soLuongTienTe; i++) {
            tongtb += tongTienTe() / this.soLuongTienTe;
        }
        return tongtb;
    }

    public void xuatGiaoDichMotTyTienTe(){
        for (int i = 0; i < this.soLuongTienTe; i++) {
            if(this.gdtt[i].getDonGia() > 1000000000){
                this.gdtt[i].getDonGia();
            }
        }
    }

    public void xuatGiaoDichMotTyVang(){
        for (int i = 0; i < this.soLuongVang; i++) {
            if(this.gdv[i].getDonGia() > 1000000000){
                this.gdv[i].getDonGia();
            }
        }
    }


}
