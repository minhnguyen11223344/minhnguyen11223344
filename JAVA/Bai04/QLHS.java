package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs;
	public QLHS() {
		dshs= new ArrayList<HocSinh>();
	}
	
	public void themHocSinh(HocSinh hs){
		dshs.add(hs);
	}
	
	public void nhapDanhSach(Scanner sc){
		//int n= sc.nextInt();
		System.out.println("Nhap thong tin hoc sinh");
		int n= sc.nextInt();sc.nextLine();
		for(int i=0;i<n;i++) {
			HocSinh hs= new HocSinh();
			hs.nhapThongTin(sc);
			themHocSinh(hs);
			System.out.println("------------------------");
		}
	}
	
	public void inDanhSach() {
		for(HocSinh hs: dshs) {
			hs.InTTHS();
		}
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan) {
		System.out.println("Danh sach hoc sinh lop "+namSinh + "va que quan"+ queQuan +" :");
		for (HocSinh hs : dshs) {
			if((namSinh==hs.ngaySinh.getYear() + 1900)&&(queQuan.equals(hs.queQuan))) {
				hs.InTTHS();
				System.out.println("------------------------");
			}
		}
	}
	
	public void timKiemHocSinh(String lop) {
		System.out.println("Danh sach hoc sinh lop "+lop+" :");
		for (HocSinh hs : dshs) {
			if(lop.equals(hs.getLop())) {
				hs.InTT();
				System.out.println("------------------------");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		QLHS ql= new QLHS();
		ql.nhapDanhSach(sc);
		ql.inDanhSach();
		ql.timKiemHocSinh("K67CNPM");
		ql.timKiemHocSinh(2004, "Ha Noi");
	}
}


