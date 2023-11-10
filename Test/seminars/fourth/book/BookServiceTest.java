package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @Test
    void testBookService(){
        InMemoryBookRepository inMemoryBookRepository= mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);
        Book book=new Book("0") ;
        List<Book> bookList =new ArrayList<>();

        when(bookService.findBookById("0")).thenReturn(book);
        when(bookService.findAllBooks()).thenReturn(bookList);

        assertTrue(bookService.findBookById("0")==book);
        assertTrue(bookService.findAllBooks()==bookList);
    }
}
