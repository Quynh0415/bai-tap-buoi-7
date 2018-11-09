package com.quynh.bai6;

public class QuanLyKhachSan {
    private NgayThue[] ngayThues;
    private GioThue[] gioThues;
    private int soNgayThue;
    private int soGioThue;

    public QuanLyKhachSan(int soNgayThue, int soGioThue) {
        this.soGioThue = soGioThue;
        this.soNgayThue = soNgayThue;
        this.ngayThues = new NgayThue[this.soNgayThue];
        this.gioThues = new GioThue[this.soGioThue];
    }

    public void nhapNgay(){
        for (int i = 0; i < this.soNgayThue; i++) {
            this.ngayThues[i] = new NgayThue();
            this.ngayThues[i].nhapNgayThue();
        }
    }

    public void xuatNgay(){
        for (int i = 0; i < this.soNgayThue; i++) {
            this.ngayThues[i].xuatNgayThue();
        }
    }

    public void nhapGio(){
        for (int i = 0; i < this.soGioThue; i++) {
            this.gioThues[i] = new GioThue();
            this.gioThues[i].nhapGioThue();
        }
    }

    public void xuatGio(){
        for (int i = 0; i < this.soGioThue; i++) {
            this.gioThues[i].xuatGioThue();
        }
    }

    public int tongNgayThue(){
        int tong = 0;
        for (int i = 0; i < this.soNgayThue; i++) {
            tong += this.ngayThues[i].getSoLuong();
        }
        return tong;
    }

    public int tongGioThue(){
        int tong = 0;
        for (int i = 0; i < this.soGioThue; i++) {
            tong += this.gioThues[i].getSoLuong();
        }
        return tong;
    }

    public double trungBinhTienGio(){
        double tbtong = 0;
        for (int i = 0; i < this.soGioThue; i++) {
            tbtong += this.tongGioThue() / this.soGioThue;
        }
        return tbtong;
    }

    public double trungBinhTienNgay(){
        double tbtong = 0;
        for (int i = 0; i < this.soNgayThue; i++) {
            tbtong += this.tongNgayThue() / this.soNgayThue;
        }
        return tbtong;
    }


}
