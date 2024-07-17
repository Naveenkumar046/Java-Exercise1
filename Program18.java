import java.util.*;
class Book{
String book_name;
int isbn_number;
String author_name;
String publisher;


public void Book(String book_name, int isbn_number, String author_name, String publisher){
this.book_name = book_name;
this.isbn_number = isbn_number;
this.author_name = author_name;
this.publisher = publisher;
}

public void setbook_name(String book_name){
this.book_name = book_name;
}
public String getbook_name(){
return book_name;
}

public void setisbn_number(int isbn_number){
this.isbn_number = isbn_number;
}
public int getisbn_number(){
return isbn_number;
}

public void setauthor_name(String author_name){
this.author_name = author_name;
}
public String getauthor_name(){
return author_name;
}

public void setpublisher(String publisher){
this.publisher = publisher;
}
public String getpublisher(){
return publisher;
}

public void getBookInfo(){
System.out.printf("\nThe Book's Description: \n Book name: %s \n ISBN Number: %d  \n Author_name: %s \n Publisher: %s", book_name, isbn_number, author_name, publisher);
}
}

public class Program18{
public static void main(String[] args){
Book arr[] = new Book[30];
arr[1] = new Book();
arr[1].setbook_name("Harry Potter");
arr[1].setisbn_number(5001);
arr[1].setauthor_name("J K Rowling");
arr[1].setpublisher("Mervin publications");
arr[1].getBookInfo();
}
}