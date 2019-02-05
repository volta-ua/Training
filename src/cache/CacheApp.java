package cache;

import java.util.Arrays;

public class CacheApp {

    public static void main(String[] args) {
        Library lib=new Library();
        lib.add(new Book("Robinson Crueso","Daniel Defo",1805,"111111111","",new Foto("google/rc"),Ganres.XIX,21999));
        lib.add(new Book("War and peace","Dostoievskyi Mykhailo Fedorovych",1855,"22211111","",new Foto("google/wp"),Ganres.XIX,32999));
        lib.add(new Book("Faust",null,1618,"SDSDSDEE1","",new Foto("google/f"),Ganres.RENAISSANCE,49999));
        lib.add(new Book("Bible","",0,"0000000000","",new Foto("google/bible"),Ganres.ANCIENT,99999));
        lib.add(new Book("Thinking in Java","Bruice Eckel",2001,"WWWHTTPS","",new Foto("google/tJ"),Ganres.POSTMODERN,77000));
        lib.add(new Book("Kobzar","Taras Shevchenko",1850,"TARASSH","",new Foto("google/kobzar"),Ganres.XIX,99998));
        lib.add(new Book("History of Ukraine - Rus","Mykola arkas",1905,"UKRAINERUS","",new Foto("google/urh"),Ganres.MODERN,60370));

        System.out.println(lib);
        System.out.println("===============================================================================================================================" +
                "===============================================================================================================================");
        Book[]result=lib.getBooksByMask("18.+",Attributes.YEAR);

        for(Book b : result)
            System.out.print(b);

    }

}
