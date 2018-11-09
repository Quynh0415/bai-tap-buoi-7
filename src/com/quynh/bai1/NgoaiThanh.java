package com.quynh.bai1;

import java.util.Scanner;

public class NgoaiThanh extends Xe {
    private String noiDen;
    private int soNgay;

    public NgoaiThanh(){
        super();
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public NgoaiThanh(int maSoChuyen, String tenTaiXe, int soXe,String noiDen, int soNgay, int doanhThu){
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        this.soNgay = 1;
        this.noiDen = "ha noi";
    }

    public String getNoiDen() {
        return noiDen;
    }
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }
    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public void nhapNgoaiThanh(){
        super.nhapThongTin();
        System.out.println("Nhập số ngày: ");
        this.noiDen = new Scanner(System.in).nextLine();
        System.out.println("Nhập số km: ");
        this.soNgay = new Scanner(System.in).nextInt();
    }

    public void xuatNgoaiThanh(){
        super.xuatThongTin();
        System.out.println("MSX: " + this.getMaSoChuyen());
        System.out.println("ten tai xe: " + this.getTenTaiXe());
        System.out.println("so xe: " + this.getSoXe());
        System.out.println("doanh thu: " + this.getDoanhThu());
    }
    public String toString (){
        return "chuyến xe ngoại thành {" + super.toString() +
                "nơi đến: " + noiDen + '\'' +
                "số ngay: " + soNgay + '\'' +
                "doanh thu: " + getDoanhThu() +
                '}';
    }
}
