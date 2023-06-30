package OOPExercise.EX7;

import java.util.List;

public class Library {
    List<Book> books;

    boolean add(Book book) {
        if(!books.contains(book)){
            return false;
        }
        books.add(book);
        return true;
    }

    boolean removeByTitle(String title) {
        for(int i = 0 ; i < books.size() ; i ++){
            if(books.get(i).getTitle().equals(title)){
                books.remove(i);
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }

    boolean removeByAuthor(String author) {
        for(int i = 0 ; i < books.size() ; i ++){
            if(books.get(i).getAuthor().equals(author)){
                books.remove(i);
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }

    // Bài tập nâng cao (optional)
//    boolean remove(BookProp prop) {
//
//    }
}
