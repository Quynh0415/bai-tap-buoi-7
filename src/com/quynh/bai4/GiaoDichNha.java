package com.quynh.bai4;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat{
    private int loaiNha;
    private double thanhTien;

    public GiaoDichNha(){
        super();
    }

    public GiaoDichNha(int loaiNha, double thanhTien) {
        this.loaiNha = loaiNha;
        this.thanhTien = thanhTien;
    }

    public GiaoDichNha(int maGiaoDich, Ngay ngayGiaoDich, int donGia, double dienTich, int loaiNha, double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.thanhTien = thanhTien;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapThongTinNha(){
        super.nhapThongTinNhaDat();
        do {
            System.out.println("Nhâp loại nhà: ");
            this.loaiNha = new Scanner(System.in).nextInt();

        }while(loaiNha != 0 && loaiNha !=1);
    }

    public void xuatThongTinNha(){
        super.xuatThongTinNhaDat();
        System.out.println("Loại nhà: " + loaiNha);
    }

    public double tinhTienNha() {
        if (loaiNha == 0) {
            thanhTien = getDienTich() * getDonGia();
        } else {
            thanhTien = getDienTich() * getDonGia() * 0.9;
        }
        return thanhTien;
    }
}
