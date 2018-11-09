package com.quynh.bai2;

public class Test1 {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach(2,2);
        quanLySach.nhapSachGiaoKhoa();
        System.out.println(quanLySach.tongSachGiaoKhoa());
        quanLySach.nhapSachThamKhao();
        System.out.println(quanLySach.tongSachThamKhao());
        quanLySach.trungBinhCongDonGia();
        System.out.println(quanLySach.trungBinhCongDonGia());
    }
}
