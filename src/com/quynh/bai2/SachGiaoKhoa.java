package com.quynh.bai2;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private int tinhTrang;
    private double thanhTien;

    public SachGiaoKhoa(){
        super();
    }
    public SachGiaoKhoa(int tinhTrang, double thanhTien, int maSach, int donGia, int soLuong, String nhaXuatBan){
        super(maSach, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
        this.thanhTien = thanhTien;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(int tinhTrang) {
        if (tinhTrang != 1 && tinhTrang != 0){
            return;
        }
        this.tinhTrang = tinhTrang;
    }

    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapSach(){
        super.nhapThongTinSach();
        do {
            System.out.println("tình trạng sách: ");
            this.tinhTrang = new Scanner(System.in).nextInt();
        }while (tinhTrang !=1 && tinhTrang != 0);
    }

    public void xuatSach(){
        super.xuatThongTinSach();
        System.out.println("tình trạng: " + this.tinhTrang);
    }

    public double tinhTien(){
        if (tinhTrang == 1){
            thanhTien = getSoLuong() * getDonGia();
        }else {
            thanhTien = getSoLuong() * getDonGia() * 0.5;
        }
        return thanhTien;
    }
}
