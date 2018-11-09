package com.quynh.bai4;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {
    private int loaiDat;
    private double thanhtien;

    public GiaoDichDat(){
        super();
    }

    public GiaoDichDat(int loaiDat, double thanhtien) {
        this.loaiDat = loaiDat;
        this.thanhtien = thanhtien;
    }

    public GiaoDichDat(int maGiaoDich, Ngay ngayGiaoDich, int donGia, double dienTich, int loaiDat, double thanhtien) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
        this.thanhtien = thanhtien;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public void nhapThongTinDat(){
        super.nhapThongTinNhaDat();
        do {
            System.out.println("Nhập loại đất: ");
            this.loaiDat = new Scanner(System.in).nextInt();
        }while(loaiDat != 0 && loaiDat != 1);
    }

    public void xuatThongTinDat(){
        super.xuatThongTinNhaDat();
        System.out.println("loại đất: " + loaiDat);
        System.out.println("thành tiền: " + thanhtien);
    }

    public double tienDat(){
        if (loaiDat == 0){
            thanhtien = getDienTich() * getDonGia();
        } else {
            thanhtien = getDienTich() * getDonGia() *1.5;
        }
        return thanhtien;
    }
}
