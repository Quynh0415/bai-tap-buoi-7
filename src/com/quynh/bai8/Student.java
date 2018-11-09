package com.quynh.bai8;

import java.util.Scanner;

public class Student extends Person {
    private float diemMon1;
    private float diemMon2;
    private float diemTB;
    private String danhGia;

    public Student(){
        super();
    }

    public Student(float diemMon1, float diemMon2, float diemTB, String danhGia) {
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemTB = diemTB;
        this.danhGia = danhGia;
    }

    public Student(String hoTen, String diaChi, float diemMon1, float diemMon2, float diemTB, String danhGia) {
        super(hoTen, diaChi);
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemTB = diemTB;
        this.danhGia = danhGia;
    }

    public float getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public float getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    private void nhapThongTinHS(){
        super.nhapHocVien();
        System.out.println("Nhập điểm môn 1: ");
        this.diemMon1 = new Scanner(System.in).nextFloat();
        System.out.println("Nhập điểm môn 2: ");
        this.diemMon2 = new Scanner(System.in).nextFloat();
    }

    public float tinhTrungBinh(){
        return diemTB = (diemMon1 + diemMon2) / 2;
    }

    public void danhGia(){
        if(diemTB > 5.0 && diemTB < 7.0){
            danhGia = "khá";
        }else if(diemTB < 5.0){
            danhGia = "trung bình";
        }else{
            danhGia = "giỏi";
        }
    }

}
