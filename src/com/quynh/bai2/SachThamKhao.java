package com.quynh.bai2;

import java.util.Scanner;

public class SachThamKhao extends Sach{
    private int thue;
    private double thanhTien;

    public SachThamKhao(){
        super();
    }


    public SachThamKhao(int thue, double thanhTien) {
        this.thue = thue;
        this.thanhTien = thanhTien;
    }

    public int getThue() {
        return thue;
    }
    public void setThue(int thue) {
        this.thue = thue;
    }

    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SachThamKhao(int maSach, int donGia, int soLuong, String nhaXuatBan, int thue, double thanhTien){
        super(maSach, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
        this.thanhTien = thanhTien;
    }

    public double tinhTienSach(){
        return thanhTien = getSoLuong() * getDonGia() + thue;
    }

    public void nhapSachThamKhao(){
        super.nhapThongTinSach();
        System.out.println("Nhập thuế: ");
        this.thue = new Scanner(System.in).nextInt();
    }
     public void xuatSachThamKhao(){
        super.xuatThongTinSach();
         System.out.println("thuế: " + this.thue);
     }
}
