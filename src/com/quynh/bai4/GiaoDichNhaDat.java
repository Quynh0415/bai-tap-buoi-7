package com.quynh.bai4;

import java.util.Scanner;

public class GiaoDichNhaDat {
    private int maGiaoDich;
    private Ngay ngayGiaoDich;
    private int donGia;
    private double dienTich;

    public GiaoDichNhaDat(){
        this.ngayGiaoDich = new Ngay();
    }

    public GiaoDichNhaDat(int maGiaoDich, Ngay ngayGiaoDich, int donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Ngay getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Ngay ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapThongTinNhaDat(){
        System.out.println("Nhập vào mã giao dịch: ");
        this.maGiaoDich = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào diện tích: ");
        this.dienTich = new Scanner(System.in).nextDouble();
        ngayGiaoDich.nhapNgay();
    }

    public void xuatThongTinNhaDat(){
        System.out.println("MGD: " + maGiaoDich);
        System.out.println("ĐG: " + donGia);
        System.out.println("DT: " + dienTich);
        ngayGiaoDich.xuatNgay();
    }
}
