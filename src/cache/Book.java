package cache;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int year;
    private String isbn;
    private String comment;
    private Foto foto;
    private Ganres ganre;
    private int cost;

    public Book(String title, String author, int year, String isbn, String comment, Foto foto, Ganres ganre, int cost) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.comment = comment;
        this.foto = foto;
        this.ganre = ganre;
        this.cost = cost;
    }

    public String getField(Attributes attr){
        String result=null;
        switch(attr){
            case AUTHOR:
                result=getAuthor();
                break;
            case COMMENT:
                result=getComment();
                break;
            case COST:
                result=String.valueOf(getCost());
                break;
            case FOTO:
                result=getFoto().toString();
                break;
            case GANRE:
                result=getGanre().toString();
                break;
            case ISBN:
                result=getIsbn();
                break;
            case TITLE:
                result=getTitle();
                break;
            case YEAR:
                result=String.valueOf(getYear());
                break;
        }
        return result;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Ganres getGanre() {
        return ganre;
    }

    public void setGanre(Ganres ganre) {
        this.ganre = ganre;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                cost == book.cost &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn) &&
                Objects.equals(comment, book.comment) &&
                Objects.equals(foto, book.foto) &&
                Objects.equals(ganre, book.ganre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, isbn, comment, foto, ganre, cost);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                ", comment='" + comment + '\'' +
                ", foto=" + foto +
                ", ganre='" + ganre + '\'' +
                ", cost=" + cost +
                "}\n";
    }

}