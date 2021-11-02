package bkap.run;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import bkap.enity.Book;

public class Test {
	static List<Book> listBo = new ArrayList<Book>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		do {
			System.out.println("1. Nhập thông tin n sách");
			System.out.println("2. Tính lợi nhuận sách");
			System.out.println("3. Hiển thị thông tin sách");
			System.out.println("4. Sắp xếp sách theo lợi nhuận giảm dần");
			System.out.println("5. Hiển thị 3 quyển sách có giá bán cao nhất");
			System.out.println("6. Tìm kiếm sách theo tên sách");
			System.out.println("7. Cho phép cập nhật tiêu đề sách theo mã sách");
			System.out.println("8. Thoat");
			System.out.println("Su lua chon cua ban: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: 
				t.inputListBook(sc);
				break;
			case 2:
				t.calSalaryListBo();
				break;
			case 3:
				t.displayListBo();
				break;
			case 4:
				t.sortBookPrfit();
				break;
			case 5:
				t.Sx();
				break;
			case 6:
				t.searchBookName(sc);
				break;
			case 7:
				t.updateTitle(sc);
				break;
			
			default:
				System.err.println("Vui long chon tu 1-7");
				break;
			}
		} while(true);
	}
	public void inputListBook(Scanner sc) {
		System.out.println("Nhap vao so sach can nhap thong tin: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap thong tin sach thu: %d\n", i+1);
			Book boo = new Book();
			boo.inputData();
			listBo.add(boo);
		}
	}
	public void calSalaryListBo() {
		for (Book book : listBo) {
			book.calProfit();
		}
		System.out.println("Tinh loi nhuan sach xong");
	}
	public void displayListBo() {
		System.out.println("Thong tin tat ca sach: ");
		for (Book book : listBo) {
			book.displayData();
		}
	}
	public void sortBookPrfit() {
		for (int i = 0; i < listBo.size()-1; i++) {
			for (int j = i+1; j < listBo.size(); j++) {
				if (listBo.get(i).getFrofit()<listBo.get(j).getFrofit()) {
					Book temp = listBo.get(i);
					listBo.set(i, listBo.get(j));
					listBo.set(j, temp);
				}
			}
		}
	}
	public void Sx() {
		for(int i=0; i<listBo.size(); i++) {
			if(i==0||i==1||i==2)
			listBo.get(i).displayData();
		}
	}
	public void searchBookName(Scanner sc) {
		System.out.println("Nhap vao ten sach can tim kiem: ");
		String seach = sc.nextLine();
		System.out.println("Sach can tim la: ");
		boolean check = false;
		for (Book book : listBo) {
			if (book.getBookName().equals(seach)) {
				book.displayData();
				check = true;
			}
		}
		if (!check) {
			System.out.println("Khong tim thay sach nao co ten nhu vay");
		}
	}
	public void updateTitle(Scanner sc) {
		System.out.println("Nhap vao ma sach can cap nhat tieu de sach: ");
		String update = sc.nextLine();
		for (Book book : listBo) {
			if (book.getBookId().equals(update)) {
				book.setTitle(sc.nextLine());
			}
		}
	}
	
	
}
