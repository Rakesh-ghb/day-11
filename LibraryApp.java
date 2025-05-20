package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) { 
		 Library obj=new Library();
		  obj.setLibraryName("library"); 
		  obj.setTotalBooks(10000); 
		  Librarian li=new Librarian(); 
		  li.setLibrarianName("Raju"); 
		  li.setYearsOfExperince(10); 
		  obj.showLibraryDetails(); 
		  li.showLibrarianInfo(); 
		   
		 } 
		 
		} 
		 
		 
		