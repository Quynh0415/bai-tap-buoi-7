package com.quynh.bai3;

public class Demo {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDiches = new QuanLyGiaoDich(2,2);
        quanLyGiaoDiches.nhapVang();
        System.out.println(quanLyGiaoDiches.tongVang());
        quanLyGiaoDiches.nhapTienTe();
        System.out.println(quanLyGiaoDiches.tongTienTe());
        System.out.println(quanLyGiaoDiches.trungBinhTienTe());
        quanLyGiaoDiches.xuatGiaoDichMotTyTienTe();
        quanLyGiaoDiches.xuatGiaoDichMotTyVang();
    }
}
