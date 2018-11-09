package com.quynh.bai5;

import java.util.Scanner;

public class KhachHangNuocNgoai extends HoaDonTienDien {
    private String quocTich;
    private double thanhTien;

    public KhachHangNuocNgoai(){
        super();
    }

    public KhachHangNuocNgoai(String quocTich, double thanhTien) {
        this.quocTich = quocTich;
        this.thanhTien = thanhTien;
    }

    public KhachHangNuocNgoai(int maKhachHang, String hoTen, Ngay ngayRa, int donGia, double soLuong, String quocTich, double thanhTien) {
        super(maKhachHang, hoTen, ngayRa, donGia, soLuong);
        this.quocTich = quocTich;
        this.thanhTien = thanhTien;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapKhachHangNuocNgoai(){
        super.nhapThongTinHoaDon();
        System.out.println("Nhập vào quốc tịch KH: ");
        this.quocTich = new Scanner(System.in).nextLine();
    }

    public void xuatKhachHangNuocNgoai(){
        super.xuatThongTinHoaDon();
        System.out.println("quốc tịch: " + quocTich);
    }

    public double tinhTien1(){
        return thanhTien = getSoLuong() * getDonGia();
    }
}
