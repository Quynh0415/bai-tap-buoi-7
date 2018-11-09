package com.quynh.bai6;

public class Demo3 {
    public static void main(String[] args) {
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan(2,2);
        quanLyKhachSan.nhapGio();
        System.out.println(quanLyKhachSan.tongGioThue());
        System.out.println(quanLyKhachSan.trungBinhTienGio());
        quanLyKhachSan.nhapNgay();
        System.out.println(quanLyKhachSan.tongNgayThue());
        System.out.println(quanLyKhachSan.trungBinhTienNgay());

    }
}
