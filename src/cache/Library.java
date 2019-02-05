package cache;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Library{
    private List<Book> list=new LinkedList();

    @Override
    public String toString() {
        return this.print();
    }

    public void add(Book book){
        if (book==null)
            return;
        list.add(book);
    }

    public boolean remove(Book book){
        if (book==null)
            return false;
        if (list.indexOf(book)==-1)
            return false;
        else{list.remove(book);
            return true;
        }
    }

    public Book[] getBooksByMask(String search, Attributes attr){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Book[]foundBooks=new Book[this.list.size()-1];
        int counter=0;
        for(Book b : list){
            String ss=b.getField(attr);
            if(b.getField(attr).matches("(.*)"+search+"(.*)"))
                foundBooks[counter++]=b;
        }
        if (counter==0)
            return null;
        foundBooks= Arrays.copyOf(foundBooks,counter);
        return foundBooks;
    }

    private String print(){
        String print="";
        String separator="\t";
        for(Book b : list){
            print+=thirtySymbols(b.getTitle())+separator+
                    thirtySymbols(b.getAuthor())+separator+
                        thirtySymbols(b.getYear())+separator+
                            thirtySymbols(b.getIsbn())+separator+
                                thirtySymbols(b.getComment())+separator+
                                    thirtySymbols(b.getFoto())+separator+
                                        thirtySymbols(b.getGanre())+separator+
                                            thirtySymbols(b.getCost())+"\n";
        }
        return print;
    }

    private String thirtySymbols(Object o){
        int symbAmount=30;
        final String smbToFill=".";
        if (o==null)
            return IntStream.range(0, symbAmount).mapToObj(x -> smbToFill).collect(Collectors.joining());
        if (o.toString().length()>symbAmount){
            return o.toString().substring(0,symbAmount);
        }else{
                return o.toString()+IntStream.range(0, symbAmount-o.toString().length()).mapToObj(x -> smbToFill).collect(Collectors.joining());
        }
    }
}