package chapter12.view;

import java.util.Scanner;

import chapter12.controller.BookController;

public class BookView {
	private final BookController bookController;
	private final Scanner sc;
	
	public BookView() {
		this.bookController = new BookController();
		this.sc = new Scanner(System.in);
	}
	public void showMenu() {
		int choice = 0;
		while (choice != 4) {
			System.out.println("== Book Management System ==");
			System.out.println("1. Add a Book");
			System.out.println("2. Show all Book");
			System.out.println("3. Search for a Book title");
			System.out.println("4. Quit");
		}
	}
}
