package com.code.booksystem.services;

import java.util.List;

import com.code.booksystem.Entity.Library;
import com.code.booksystem.dto.BookDto;

public interface LibraryService {

	List<Library> getAllBooks();

	List<Library> getBookByIsbn(Long isbn);

	boolean addBook(Library libra);



	String updateBook(Long isbn, BookDto bookDto);

	boolean deleteBook(Long isbn);

}
