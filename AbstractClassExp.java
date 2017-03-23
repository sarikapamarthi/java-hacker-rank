package introduction;

import java.util.*;

//abstract class
abstract class Book {
	String title;

	// setTitle method should be implemented in child class
	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

// child class mybook extends abstract parent class and implemented the method
// settitle
class MyBook extends Book {
	void setTitle(String s) {
		title = s;
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// Book new_novel=new Book(); This line prHMain.java:25: error: Book is
		// abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		// object is created for child class which extends the parent class and
		// aquires its properties
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}

