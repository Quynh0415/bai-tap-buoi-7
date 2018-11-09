package com.quynh.bai6;

import java.util.Scanner;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay() {
    }

    public Ngay(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.ngay = nam;
    }

    public int getNgay(){
        return ngay;
    }
    public void setNgay(int ngay){
        this.ngay = ngay;
    }

    public int getThang(){
        return thang;
    }
    public void setThang(int thang){
        this.thang = thang;
    }

    public int getNam(){
        return nam;
    }
    public void setNam(int nam){
        this.nam = nam;
    }

    public void nhapNgay(){
        System.out.println("Nhập vào ngày: ");
        this.ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tháng: ");
        this.thang = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào năm: ");
        this.nam = new Scanner(System.in).nextInt();
    }

    public void xuatNgay(){
        System.out.println("ngày: " + this.ngay);
        System.out.println("tháng: " + this.thang);
        System.out.println("năm: " + this.nam);
    }
}
