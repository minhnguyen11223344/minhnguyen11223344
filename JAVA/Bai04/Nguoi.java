package bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {

	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;

	public Nguoi() {

	}

	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public Nguoi(String hoTen,Date ngaySinh, String queQuan) {
		this(hoTen, ngaySinh);
		this.queQuan = queQuan;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String ngaySinhstr = sc.nextLine();
		ngaySinh= stringToDate(ngaySinhstr);
		System.out.println("Nhap que quan : ");
		queQuan = sc.nextLine();
	}

	private Date stringToDate(String ngaySinhstr) {
		// TODO Auto-generated method stub
		Date ngaySinhDate=null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaySinhDate=sdf.parse(ngaySinhstr);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Loi dinh dang nam sinh");
		}
		return ngaySinhDate;
	}

	public void InTT() {
		System.out.println("Ten cua ban la : " + hoTen);
		System.out.println("Ngay sinh : " + ngaySinh);
		System.out.println("Que quan : " + queQuan);
	}

//		public static void main(String[] args) {
//			Nguoi ng= new Nguoi();
//			Scanner sc = new Scanner(System.in);
//			ng.nhapThongTin(sc);
//			
//			ng.InTT();
//		}

}
