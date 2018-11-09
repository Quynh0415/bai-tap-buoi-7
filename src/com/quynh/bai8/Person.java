package com.quynh.bai8;

import java.util.Scanner;

public class Person {
    private String hoTen;
    private String diaChi;

    public Person(){

    }

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapHocVien(){
        System.out.println("Nhập vào họ tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        this.diaChi = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Học Viện {" +
                "họ tên: "+ hoTen + '\'' +
                "địa chỉ: " + diaChi + '\'' +
                "}";
    }
}
