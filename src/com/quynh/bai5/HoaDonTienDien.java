package com.quynh.bai5;

import java.util.Scanner;

public class HoaDonTienDien {
    private int maKhachHang;
    private String hoTen;
    private Ngay ngayRa;
    private int donGia;
    private double soLuong;

    public HoaDonTienDien(){
        this.ngayRa = new Ngay();
    }

    public HoaDonTienDien(int maKhachHang, String hoTen, Ngay ngayRa, int donGia, double soLuong) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRa = ngayRa;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgayRa() {
        return ngayRa;
    }

    public void setNgayRa(Ngay ngayRa) {
        this.ngayRa = ngayRa;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapThongTinHoaDon(){
        System.out.println("Nhập vào mã khách hàng: ");
        this.maKhachHang = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào trên khách hàng: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số lượng: ");
        this.soLuong = new Scanner(System.in).nextDouble();
        this.ngayRa.nhapNgay();
    }

    public void xuatThongTinHoaDon(){
        System.out.println("MKH: " + maKhachHang);
        System.out.println("Tên KH: " + hoTen);
        System.out.println("ĐG: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        this.ngayRa.xuatNgay();
    }
}
