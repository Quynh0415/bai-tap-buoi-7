package com.quynh.bai5;

import com.quynh.bai1.QuanLy;

public class QuanLyKhachHang {
    private KhachHangVietNam[] khvn;
    private KhachHangNuocNgoai[] khnn;
    private int soLuongKHVietNam;
    private int soLuongKHNuocNgoai;

    public QuanLyKhachHang(int soLuongKHVietNam, int soLuongKHNuocNgoai){
        this.soLuongKHVietNam = soLuongKHVietNam;
        this.soLuongKHNuocNgoai = soLuongKHNuocNgoai;
        this.khvn = new KhachHangVietNam[this.soLuongKHVietNam];
        this.khnn = new KhachHangNuocNgoai[this.soLuongKHNuocNgoai];
    }

    public void nhapKHVietNam(){
        for (int i = 0; i < this.soLuongKHVietNam; i++) {
            this.khvn[i] = new KhachHangVietNam();
            this.khvn[i].nhapKhachHangVietNam();
        }
    }

    public void xuatKHVietNam(){
        for (int i = 0; i < this.soLuongKHVietNam; i++) {
            this.khvn[i].xuatKhachHangVietNam();
        }
    }

    public void nhapKHNuocNgoai(){
        for (int i = 0; i < this.soLuongKHNuocNgoai; i++) {
            this.khnn[i] = new KhachHangNuocNgoai();
            this.khnn[i].nhapKhachHangNuocNgoai();
        }
    }

    public void xuatKHNuocNgoai(){
        for (int i = 0; i < this.soLuongKHNuocNgoai; i++) {
            this.khnn[i].xuatKhachHangNuocNgoai();
        }
    }

    public int tongKHVietNam(){
        int tong = 0;
        for (int i = 0; i < this.soLuongKHVietNam; i++) {
            tong += this.khvn[i].getSoLuong();
        }
        return tong;
    }

    public int tongKHNuocNgoai(){
        int tong = 0;
        for (int i = 0; i < this.soLuongKHNuocNgoai; i++) {
            tong += this.khnn[i].getSoLuong();
        }
        return tong;
    }

    public double trungBinhThanhTien(){
        double tongtb = 0;
        for (int i = 0; i < this.soLuongKHNuocNgoai; i++) {
            tongtb += this.tongKHNuocNgoai() / this.soLuongKHNuocNgoai;
        }
        return tongtb;
    }
}
