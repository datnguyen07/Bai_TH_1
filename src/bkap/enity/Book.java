package bkap.enity;

import java.util.Scanner;

public class Book {
	private String BookId;
	private String BookName;
	private float importPrice;
	private float Price;
	private float frofit;
	private String Title;
	private String Author;
	private String Content;
	private boolean BookStatus;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookId, String bookName, float importPrice, float price, float frofit, String title,
			String author, String content, boolean bookStatus) {
		super();
		BookId = bookId;
		BookName = bookName;
		this.importPrice = importPrice;
		Price = price;
		this.frofit = frofit;
		Title = title;
		Author = author;
		Content = content;
		BookStatus = bookStatus;
	}
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public float getImportPrice() {
		return importPrice;
	}
	public void setImportPrice(float importPrice) {
		this.importPrice = importPrice;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public float getFrofit() {
		return frofit;
	}
	public void setFrofit(float frofit) {
		this.frofit = frofit;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public boolean isBookStatus() {
		return BookStatus;
	}
	public void setBookStatus(boolean bookStatus) {
		BookStatus = bookStatus;
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma Sach: ");
		this.BookId = sc.nextLine();
		System.out.println("Nhap Ten Sach: ");
		this.BookName = sc.nextLine();
		System.out.println("Nhap Gia Nhap Sach: ");
		this.importPrice = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap gia ban sach: ");
		this.Price = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap tieu de sach: ");
		this.Title = sc.nextLine();
		System.out.println("Nhap ten tac gia: ");
		this.Author = sc.nextLine();
		System.out.println("Nhap noi dung sach: ");
		this.Content = sc.nextLine();
		System.out.println("Nhap trang thai sach");
		this.BookStatus = Boolean.parseBoolean(sc.nextLine());
		
		}
	
	public void displayData() {
		System.out.printf("Ma sach: %s - Ten sach: %s - Gia nhap sach: %f - Gia ban sach: %f\n", this.BookId, this.BookName, this.importPrice, this.Price);
		System.out.printf("Loi nhuan sach: %f - Tieu de sach: %s - Tac gia: %s - Noi dung sach: %s\n", this.frofit, this.Title, this.Author, this.Content, this.BookStatus);
		
	}
	public void calProfit() {
		this.frofit = getPrice() - getImportPrice();
	}

}
