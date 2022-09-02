package com.example.graphQL.domain.book.input;

import com.example.graphQL.domain.book.Book;
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
public class BookMapperImpl implements BookMapper {

    @Override
    public Book fromDTO(BookCreateInput dto) {
        if ( dto == null ) {
            return null;
        }

        Book book = new Book();

        book.setTitle( dto.getTitle() );
        if ( dto.getPrice() != null ) {
            book.setPrice( dto.getPrice().floatValue() );
        }

        return book;
    }

    @Override
    public List<Book> fromDTOs(List<BookCreateInput> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( dtos.size() );
        for ( BookCreateInput bookCreateInput : dtos ) {
            list.add( fromDTO( bookCreateInput ) );
        }

        return list;
    }

    @Override
    public Set<Book> fromDTOs(Set<BookCreateInput> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Book> set = new LinkedHashSet<Book>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( BookCreateInput bookCreateInput : dtos ) {
            set.add( fromDTO( bookCreateInput ) );
        }

        return set;
    }

    @Override
    public BookCreateInput toDTO(Book BO) {
        if ( BO == null ) {
            return null;
        }

        BookCreateInput bookCreateInput = new BookCreateInput();

        bookCreateInput.setTitle( BO.getTitle() );
        if ( BO.getPrice() != null ) {
            bookCreateInput.setPrice( BO.getPrice().doubleValue() );
        }

        return bookCreateInput;
    }

    @Override
    public List<BookCreateInput> toDTOs(List<Book> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<BookCreateInput> list = new ArrayList<BookCreateInput>( BOs.size() );
        for ( Book book : BOs ) {
            list.add( toDTO( book ) );
        }

        return list;
    }

    @Override
    public Set<BookCreateInput> toDTOs(Set<Book> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<BookCreateInput> set = new LinkedHashSet<BookCreateInput>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Book book : BOs ) {
            set.add( toDTO( book ) );
        }

        return set;
    }
}
