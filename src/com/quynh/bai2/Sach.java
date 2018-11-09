package com.quynh.bai2;

import java.util.Scanner;

public class Sach {
    private int maSach;
    private Ngay ngayNhap;
    private int donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach(){
        this.ngayNhap = new Ngay();
    }

    public Sach(int maSach, int donGia, int soLuong, String nhaXuatBan){
        this.maSach = maSach;
        this.ngayNhap = new Ngay();
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Ngay getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(Ngay ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void nhapThongTinSach(){
        System.out.println("Nhập vào mã sách: ");
        this.maSach = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số lượng: ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào nhà xuất bản: ");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
        ngayNhap.nhapNgay();
    }

    public void xuatThongTinSach(){
        System.out.println("mã sách: " + maSach);
        System.out.println("đơn giá: " + donGia);
        System.out.println("số lượng: " + soLuong);
        System.out.println("nhà xuất bản: " + nhaXuatBan);
        ngayNhap.xuatNgay();
    }

}
