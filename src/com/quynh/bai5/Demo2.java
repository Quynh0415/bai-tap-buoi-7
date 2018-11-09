package com.quynh.bai5;

public class Demo2 {
    public static void main(String[] args) {
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang(2,2);
        quanLyKhachHang.nhapKHVietNam();
        System.out.println(quanLyKhachHang.tongKHVietNam());
        quanLyKhachHang.nhapKHNuocNgoai();
        System.out.println(quanLyKhachHang.tongKHNuocNgoai());
        quanLyKhachHang.trungBinhThanhTien();
        System.out.println(quanLyKhachHang.trungBinhThanhTien());
    }
}
