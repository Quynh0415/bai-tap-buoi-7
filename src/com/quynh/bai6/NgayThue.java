package com.quynh.bai6;

import java.util.Scanner;

public class NgayThue extends KhachSan {
    private int ngayThue;
    private double thanhTien;

    public NgayThue(){
        super();
    }

    public NgayThue(int ngayThue, double thanhTien) {
        this.ngayThue = ngayThue;
        this.thanhTien = thanhTien;
    }

    public NgayThue(int maHoaDon, String tenKhachHang, Ngay ngayHoaDon, int maPhong, int soLuong, int donGia, int ngayThue, double thanhTien) {
        super(maHoaDon, tenKhachHang, ngayHoaDon, maPhong, soLuong, donGia);
        this.ngayThue = ngayThue;
        this.thanhTien = thanhTien;
    }

    public int getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(int ngayThue) {
        this.ngayThue = ngayThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapNgayThue(){
        super.nhapKhachHang();
        System.out.println("Nhập số ngày thuê: ");
        this.ngayThue = new Scanner(System.in).nextInt();
    }

    public double tinhTien(){
        if(this.ngayThue < 7){
            return thanhTien = ngayThue * getDonGia();
        }else {
            return thanhTien = ngayThue * getDonGia() * 0.2;
        }
    }

    public void xuatNgayThue(){
        super.xuatKhachHang();
        System.out.println("ngày thuê: " + ngayThue);
        System.out.println("thành tiền: " + thanhTien);
    }


}
