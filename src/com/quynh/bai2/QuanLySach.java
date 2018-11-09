package com.quynh.bai2;

import com.quynh.bai1.QuanLy;

import java.util.Scanner;

public class QuanLySach {
    private SachGiaoKhoa[] sgk;
    private SachThamKhao[] stk;
    private int soLuongSgk;
    private int soLuongStk;

    public QuanLySach(int soLuongSgk, int soLuongStk){
        this.soLuongSgk = soLuongSgk;
        this.soLuongStk = soLuongStk;
        this.sgk = new SachGiaoKhoa[this.soLuongSgk];
        this.stk = new SachThamKhao[this.soLuongStk];
    }

    public void nhapSachGiaoKhoa(){
        for (int i = 0; i < this.soLuongSgk; i++) {
            this.sgk[i] = new SachGiaoKhoa();
            this.sgk[i].nhapSach();
        }
    }
    public void xuatSachGiaoKhoa(){
        for (int i = 0; i < this.soLuongSgk; i++) {
            this.sgk[i].xuatSach();
        }
    }

    public void nhapSachThamKhao(){
        for (int i = 0; i < this.soLuongStk; i++) {
            this.stk[i] = new SachThamKhao();
            this.stk[i].nhapSachThamKhao();
        }
    }
    public void xuatSachThamKhao(){
        for (int i = 0; i < this.soLuongStk ; i++) {
            this.stk[i].xuatSachThamKhao();
        }
    }

    public int tongSachGiaoKhoa(){
        int tong = 0;
        for (int i = 0; i < this.soLuongSgk ; i++) {
            tong += this.sgk[i].getThanhTien();
        }
        return tong;
    }

    public int tongSachThamKhao(){
        int tong = 0;
        for (int i = 0; i < this.soLuongStk; i++) {
            tong += this.stk[i].getThue();
        }
        return  tong;
    }
    
    public float trungBinhCongDonGia(){
        int tong = 0;
        for (int i = 0; i < this.soLuongStk; i++) {
            tong += tongSachThamKhao() / this.soLuongStk;
        }
        return tong;
    }

    public void xuatSgkNxb(){
        for (int i = 0; i < this.soLuongSgk; i++) {
            if (this.sgk[i].getNhaXuatBan().equals("X")); {
                this.sgk[i].xuatSach();
            }
        }
    }
}
