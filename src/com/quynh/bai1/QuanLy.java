package com.quynh.bai1;

import com.quynh.bai2.Ngay;

public class QuanLy {
    private NoiThanh[] noiThanhs;
    private NgoaiThanh[] ngoaiThanhs;
    private int soLuongXeNoiThanh;
    private int soLuongXeNgoaiThanh;

    public QuanLy(int soLuongXeNgoaiThanh, int soLuongXeNoiThanh){
        this.soLuongXeNoiThanh = soLuongXeNoiThanh;
        this.soLuongXeNgoaiThanh = soLuongXeNgoaiThanh;
        this.noiThanhs = new NoiThanh[this.soLuongXeNoiThanh];
        this.ngoaiThanhs = new NgoaiThanh[this.soLuongXeNgoaiThanh];
    }

    public void nhapXeNoiThanh(){
        for (int i = 0; i < this.soLuongXeNoiThanh ; i++) {
            this.noiThanhs[i] = new NoiThanh();
            this.noiThanhs[i].nhapNoiThanh();
        }
    }
    public void xuatXeNoiThanh(){
        for (int i = 0; i < this.soLuongXeNoiThanh ; i++) {
            this.noiThanhs[i].xuatNoiThanh();
        }
    }

    public void nhapXeNgoaiThanh(){
        for (int i = 0; i < this.soLuongXeNgoaiThanh; i++) {
            this.ngoaiThanhs[i] = new NgoaiThanh();
            this.ngoaiThanhs[i].nhapNgoaiThanh();
        }
    }
    public void xuatXeNgoaiThanh(){
        for (int i = 0; i < this.soLuongXeNgoaiThanh; i++) {
            this.ngoaiThanhs[i].xuatNgoaiThanh();
        }
    }

    public int tongDoanhThuXeNoiThanh(){
        int tong = 0;
        for (int i = 0; i < this.soLuongXeNoiThanh; i++) {
            tong += this.noiThanhs[i].getDoanhThu();
        }
        return tong;
    }

    public int tongDoanhThuXeNgoaiThanh(){
        int tong = 0;
        for (int i = 0; i < this.soLuongXeNgoaiThanh; i++) {
            tong += this.ngoaiThanhs[i].getDoanhThu();
        }
        return tong;
    }
}
