package bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	private String msv;

	public SinhVien() {
	}

	public SinhVien(String hoTen, String msv) {
		this.hoTen = hoTen;
		this.msv = msv;
	}

	public void nhapThongTinSV(Scanner sc) {
		SinhVien sv = new SinhVien();
		super.nhapThongTin(sc);
		System.out.println("nhap ma sinh vien : ");
		msv=sc.nextLine();
	}

	public void inThongTinSV(SinhVien sv) {
		super.InTT();
		System.out.println("Ma Sinh Vien : "+ msv );
	}

	public String getMsv() {
		return msv;
	}
	
}