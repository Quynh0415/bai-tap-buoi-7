package com.quynh.bai6;

import java.util.Scanner;

public class GioThue extends KhachSan {
    private int gioThue;
    private double thanhTien;

    public GioThue(){
        super();
    }

    public GioThue(int gioThue, double thanhTien) {
        this.gioThue = gioThue;
        this.thanhTien = thanhTien;
    }

    public GioThue(int maHoaDon, String tenKhachHang, Ngay ngayHoaDon, int maPhong, int soLuong, int donGia, int gioThue, double thanhTien) {
        super(maHoaDon, tenKhachHang, ngayHoaDon, maPhong, soLuong, donGia);
        this.gioThue = gioThue;
        this.thanhTien = thanhTien;
    }

    public int getGioThue() {
        return gioThue;
    }

    public void setGioThue(int gioThue) {
        this.gioThue = gioThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapGioThue(){
        super.nhapKhachHang();
        System.out.println("Nhập giờ thuê: ");
        this.gioThue = new Scanner(System.in).nextInt();
    }

    public double thanhTien(){
        if(gioThue < 30){
            thanhTien = gioThue * getDonGia();
        }else {
            return thanhTien;
        }
        return thanhTien;
    }

   public void xuatGioThue(){
        super.xuatKhachHang();
       System.out.println("giờ thuê: " + gioThue);
       System.out.println("thành tiền: " + thanhTien);
   }

}
