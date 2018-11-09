package com.quynh.bai5;

import java.util.Scanner;

public class KhachHangVietNam extends HoaDonTienDien {
    private String doiTuong;
    private double dinhMuc;
    private double thanhTien;

    public KhachHangVietNam(){
        super();
    }

    public KhachHangVietNam(String doiTuong, double dinhMuc, double thanhTien){
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    public KhachHangVietNam(int maKhachHang, String hoTen, Ngay ngayRa, int donGia, double soLuong, String doiTuong, double dinhMuc, double thanhTien) {
        super(maKhachHang, hoTen, ngayRa, donGia, soLuong);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapKhachHangVietNam(){
        super.nhapThongTinHoaDon();
        System.out.println("NHập vào đối tượng KH: ");
        this.doiTuong = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào định mức: ");
        this.dinhMuc = new Scanner(System.in).nextDouble();
    }

    public void xuatKhachHangVietNam(){
        super.xuatThongTinHoaDon();
        System.out.println("Đối tượng: " + doiTuong);
        System.out.println("Định mức: "  + dinhMuc);
    }

    public double tinhTien(){
        if (getSoLuong() <= dinhMuc){
            return thanhTien = getSoLuong() * getDonGia();
        }else {
            return thanhTien = getSoLuong() * getDonGia() * dinhMuc + (dinhMuc - getSoLuong()) * getDonGia() * 2.5;
        }
    }
}
