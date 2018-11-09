package com.quynh.bai1;

import java.util.Scanner;

public class Xe {
    private int maSoChuyen;
    private String tenTaiXe;
    private int soXe;
    private int doanhThu;

    public Xe(){
        this.maSoChuyen = 00;
        this.tenTaiXe = "abc";
        this.soXe = 11;
        this.doanhThu = 100000;
    }

    public Xe(int maSoChuyen, String tenTaiXe, int soXe, int doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public int getMaSoChuyen() {
        return maSoChuyen;
    }
    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }
    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }
    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }
    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhapThongTin(){
        System.out.println("Nhập mã số chuyến: ");
        this.maSoChuyen = new Scanner(System.in).nextInt();
        System.out.println("Nhập tên tài xế: ");
        this.tenTaiXe = new Scanner(System.in).nextLine();
        System.out.println("Nhập số xe: ");
        this.soXe = new Scanner(System.in).nextInt();
        System.out.println("Nhập doanh thu: ");
        this.doanhThu = new Scanner(System.in).nextInt();
    }

    public void xuatThongTin(){
        System.out.println("mã số chuyến: " + this.maSoChuyen);
        System.out.println("tên tài xế: " + this.tenTaiXe);
        System.out.println("số xe: " + this.soXe);
        System.out.println("doanh thu: " + this.doanhThu);
    }

    @Override
    public String toString()  {

        return "Xe{" +
                "ma so chuyen: " + maSoChuyen +
                "ten tai xe: " + tenTaiXe + '\'' +
                "so xe: " + soXe + '\'' +
                '}';
        }
}
