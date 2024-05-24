package bai3;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private int kyHoc;
	
	public HocSinh(){}
	
	public HocSinh(String hoTen, Date ngaySinh, String lop, int kyHoc, String khoaHoc){
		super(hoTen, ngaySinh);
		this.lop=lop;
		this.khoaHoc=khoaHoc;
	}

	public HocSinh(String hoTen, String lop, int kyHoc){
		this.hoTen=hoTen;
		this.kyHoc=kyHoc;
		this.lop=lop;
	}
	public void nhapThongTin(Scanner sc){
		super.nhapThongTin(sc);
		System.out.println("Lop : ");
		lop=sc.nextLine();
		System.out.println("khoa hoc : ");
		khoaHoc=sc.nextLine();
		System.out.println("ky hoc : ");
		kyHoc=sc.nextInt();
		sc.nextLine();
	}
	public void InTTHS(){
		super.InTT();
		System.out.println("Lop : " + lop);
		System.out.println("Khoa hoc : " + khoaHoc);
		System.out.println("Ky hoc : " + kyHoc);
		
	}
	public String getLop(){
		return lop;
	}
	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		Scanner sc= new Scanner(System.in);
		hs.nhapThongTin(sc);
		hs.InTTHS();
	}
}