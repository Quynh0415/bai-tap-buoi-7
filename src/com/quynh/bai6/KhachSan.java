package com.quynh.bai6;

import java.util.Scanner;

public class KhachSan {
    private int maHoaDon;
    private String tenKhachHang;
    private Ngay ngayHoaDon;
    private int soLuong;
    private int maPhong;
    private int donGia;

    public KhachSan(){
        this.ngayHoaDon = new Ngay();
    }

    public KhachSan(int maHoaDon, String tenKhachHang, Ngay ngayHoaDon, int soLuong, int maPhong, int donGia) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuong = soLuong;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Ngay getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Ngay ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void nhapKhachHang(){
        System.out.println("Nhập vào mã hóa đơn: ");
        this.maHoaDon = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tên khách hàng: ");
        this.tenKhachHang = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào số lượng: ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào mã phòng: ");
        this.maPhong = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextInt();
        this.ngayHoaDon.nhapNgay();
    }

    public void xuatKhachHang(){
        System.out.println("MHĐ: " + maHoaDon);
        System.out.println("Tên KH: " + tenKhachHang);
        System.out.println("số luongj: " + soLuong);
        System.out.println("MP: " + maPhong);
        System.out.println("ĐG: " + donGia);
        this.ngayHoaDon.xuatNgay();
    }
}
