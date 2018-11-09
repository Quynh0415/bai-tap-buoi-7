package com.quynh.bai3;

import java.util.Scanner;

public class GiaoDich {
    private int maGiaoDich;
    private Ngay ngayNhap;
    private int donGia;
    private int soLuong;

    public GiaoDich() {
        this.ngayNhap = new Ngay();
    }

    public GiaoDich(int maGiaoDich, Ngay ngayNhap, int donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Ngay getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Ngay ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapThongTinGiaoDich(){
        System.out.println("Nhập vào mã giao dich: ");
        this.maGiaoDich = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số lượng: ");
        this.soLuong = new Scanner(System.in).nextInt();
        ngayNhap.nhapNgay();
    }

    public void xuatThongTinGiaoDich(){
        System.out.println("mã giao dich: " + maGiaoDich);
        System.out.println("đơn giá: " + donGia);
        System.out.println("số lượng: " + soLuong);
        ngayNhap.xuatNgay();
    }


}
