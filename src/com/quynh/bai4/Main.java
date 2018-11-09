package com.quynh.bai4;

import com.quynh.bai3.QuanLyGiaoDich;

public class Main {
    public static void main(String[] args) {
       QuanLyNhaDat quanLyNhaDat = new QuanLyNhaDat(2,2);
       quanLyNhaDat.nhapDat();
       System.out.println(quanLyNhaDat.tongDat());
       quanLyNhaDat.nhapNha();
       System.out.println(quanLyNhaDat.tongNha());
       quanLyNhaDat.tinhTrungBinhDat();
       System.out.println(quanLyNhaDat.tinhTrungBinhDat());
    }
}
