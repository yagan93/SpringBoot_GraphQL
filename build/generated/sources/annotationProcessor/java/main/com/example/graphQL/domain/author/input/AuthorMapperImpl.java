package com.example.graphQL.domain.author.input;

import com.example.graphQL.domain.author.Author;
import com.example.graphQL.domain.book.Book;
import com.example.graphQL.domain.book.input.BookCreateInput;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T20:43:10+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public Author fromDTO(AuthorCreateInput dto) {
        if ( dto == null ) {
            return null;
        }

        Author author = new Author();

        author.setFirstName( dto.getFirstName() );
        author.setLastName( dto.getLastName() );
        author.setBooks( bookCreateInputSetToBookSet( dto.getBooks() ) );

        return author;
    }

    @Override
    public List<Author> fromDTOs(List<AuthorCreateInput> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Author> list = new ArrayList<Author>( dtos.size() );
        for ( AuthorCreateInput authorCreateInput : dtos ) {
            list.add( fromDTO( authorCreateInput ) );
        }

        return list;
    }

    @Override
    public Set<Author> fromDTOs(Set<AuthorCreateInput> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Author> set = new LinkedHashSet<Author>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( AuthorCreateInput authorCreateInput : dtos ) {
            set.add( fromDTO( authorCreateInput ) );
        }

        return set;
    }

    @Override
    public AuthorCreateInput toDTO(Author BO) {
        if ( BO == null ) {
            return null;
        }

        AuthorCreateInput authorCreateInput = new AuthorCreateInput();

        authorCreateInput.setFirstName( BO.getFirstName() );
        authorCreateInput.setLastName( BO.getLastName() );
        authorCreateInput.setBooks( bookSetToBookCreateInputSet( BO.getBooks() ) );

        return authorCreateInput;
    }

    @Override
    public List<AuthorCreateInput> toDTOs(List<Author> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<AuthorCreateInput> list = new ArrayList<AuthorCreateInput>( BOs.size() );
        for ( Author author : BOs ) {
            list.add( toDTO( author ) );
        }

        return list;
    }

    @Override
    public Set<AuthorCreateInput> toDTOs(Set<Author> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<AuthorCreateInput> set = new LinkedHashSet<AuthorCreateInput>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Author author : BOs ) {
            set.add( toDTO( author ) );
        }

        return set;
    }

    protected Book bookCreateInputToBook(BookCreateInput bookCreateInput) {
        if ( bookCreateInput == null ) {
            return null;
        }

        Book book = new Book();

        book.setTitle( bookCreateInput.getTitle() );
        if ( bookCreateInput.getPrice() != null ) {
            book.setPrice( bookCreateInput.getPrice().floatValue() );
        }

        return book;
    }

    protected Set<Book> bookCreateInputSetToBookSet(Set<BookCreateInput> set) {
        if ( set == null ) {
            return null;
        }

        Set<Book> set1 = new LinkedHashSet<Book>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( BookCreateInput bookCreateInput : set ) {
            set1.add( bookCreateInputToBook( bookCreateInput ) );
        }

        return set1;
    }

    protected BookCreateInput bookToBookCreateInput(Book book) {
        if ( book == null ) {
            return null;
        }

        BookCreateInput bookCreateInput = new BookCreateInput();

        bookCreateInput.setTitle( book.getTitle() );
        if ( book.getPrice() != null ) {
            bookCreateInput.setPrice( book.getPrice().doubleValue() );
        }

        return bookCreateInput;
    }

    protected Set<BookCreateInput> bookSetToBookCreateInputSet(Set<Book> set) {
        if ( set == null ) {
            return null;
        }

        Set<BookCreateInput> set1 = new LinkedHashSet<BookCreateInput>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Book book : set ) {
            set1.add( bookToBookCreateInput( book ) );
        }

        return set1;
    }
}
