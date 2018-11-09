package com.quynh.bai3;

import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    private int  tiGia;
    private double thanhTien;

   public GiaoDichTienTe(){

   }

    public GiaoDichTienTe(int tiGia, double thanhTien) {
        this.tiGia = tiGia;
        this.thanhTien = thanhTien;
    }

    public GiaoDichTienTe(int maGiaoDich, Ngay ngayNhap, int donGia, int soLuong, int tiGia, double thanhTien) {
        super(maGiaoDich, ngayNhap, donGia, soLuong);
        this.tiGia = tiGia;
        this.thanhTien = thanhTien;
    }



    public int getTiGia() {
        return tiGia;
    }

    public void setTiGia(int tiGia) {
        this.tiGia = tiGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapGiaoDichTienTe(){
       super.nhapThongTinGiaoDich();
       do {
           System.out.println("Nhập loại tiền tệ: ");
           this.tiGia = new Scanner(System.in).nextInt();
       }while (tiGia != 0 && tiGia != 1 );
    }

    public double tinhTien(){
       if (tiGia ==0){
           thanhTien = getSoLuong() * getDonGia() * tiGia;
       }else {
           thanhTien = getSoLuong() * getDonGia();
       }
       return thanhTien;
    }

    public void xuatGiaoDichTienTe(){
        super.xuatThongTinGiaoDich();
        System.out.println("tỉ giá: " + tiGia);
        System.out.println("thành tiền: " + thanhTien);
    }
}
