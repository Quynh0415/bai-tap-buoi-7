package com.quynh.bai1;

import java.util.Scanner;

public class NoiThanh extends Xe {
    private int soTuyen;
    private int soKm;

    public NoiThanh(){
        super();
        this.soKm = 200;
        this.soTuyen = 2;
    }

   public NoiThanh(int maSoChuyen, String tenTaiXe, int soXe,int soTuyen, int soKm, int doanhThu ){
       super(maSoChuyen, tenTaiXe, soXe, doanhThu);
       this.soTuyen = soTuyen;
       this.soKm = soKm;
   }

    public int getSoTuyen(){
       return soTuyen;
    }
    public void setSoTuyen(int soTuyen){
       this.soTuyen = soTuyen;
    }

    public int getSoKm(){
       return soKm;
    }
    public void setSoKm(int soKm){
       this.soKm = soKm;
    }

    public void nhapNoiThanh(){
        super.nhapThongTin();
        System.out.println("Nhập số tuyến: ");
        this.soTuyen = new Scanner(System.in).nextInt();
        System.out.println("Nhập số km: ");
        this.soKm = new Scanner(System.in).nextInt();
    }

    public void xuatNoiThanh(){
        super.xuatThongTin();
        System.out.println("MSX: " + this.getMaSoChuyen());
        System.out.println("ten tai xe: " + this.getTenTaiXe());
        System.out.println("so xe: " + this.getSoXe());
        System.out.println("doanh thu: " + this.getDoanhThu());
    }
    public String toString (){
        return "chuyến xe nội thành {" + super.toString() +
                "số tuyến: " + soTuyen + '\'' +
                "số Km: " + soKm + '\'' +
                "doanh thu: " + getDoanhThu() +
                '}';
    }
}
