package com.quynh.bai3;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;
    private double thanhTien;

    public GiaoDichVang(){

    }

    public GiaoDichVang(String loaiVang, double thanhTien) {
        this.loaiVang = loaiVang;
        this.thanhTien = thanhTien;
    }

    public GiaoDichVang(int maGiaoDich, Ngay ngayNhap, int donGia, int soLuong, String loaiVang, double thanhTien) {
        super(maGiaoDich, ngayNhap, donGia, soLuong);
        this.loaiVang = loaiVang;
        this.thanhTien = thanhTien;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapGiaoDichVang(){
        super.nhapThongTinGiaoDich();
        System.out.println("Nhập vào loại vàng: ");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    public double thanhTien(){
        return thanhTien = getSoLuong() * getDonGia();

    }

    public void xuatGiaoDichVang(){
        super.xuatThongTinGiaoDich();
        System.out.println("loại vàng: " + loaiVang);
        System.out.println("thành tiền: " + thanhTien);
    }


}
