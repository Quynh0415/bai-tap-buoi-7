package com.quynh.bai1;

public class Test2 {
    public static void main(String[] args) {
        NoiThanh noiThanh = new NoiThanh();
        noiThanh.nhapNoiThanh();
        noiThanh.xuatNoiThanh();
        NgoaiThanh ngoaiThanh = new NgoaiThanh();
        ngoaiThanh.nhapNgoaiThanh();
        ngoaiThanh.xuatNgoaiThanh();
        QuanLy quanLy = new QuanLy(3, 2);
        quanLy.nhapXeNoiThanh();
        System.out.println(quanLy.tongDoanhThuXeNoiThanh());
        quanLy.nhapXeNgoaiThanh();
        System.out.println(quanLy.tongDoanhThuXeNgoaiThanh());
    }
}
