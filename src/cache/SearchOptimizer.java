package cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public enum SearchOptimizer {
    OPTIMIZER;
    private static Map<Request,Library> cache=new HashMap();
    private static Library lib;

    public static Library doSearch(String search, Attributes attr, Library lib){
        Request request=new Request(search, attr);
         if (cache.containsKey(request)){
             int randomNum = 1 + (int)(Math.random() * 2);
             SearchOptimizer.executionSpeed(randomNum);
             return cache.get(request);
         }
        SearchOptimizer.executionSpeed(70);
         Library libFound=lib.getBooksByMask(search, attr);
        cache.put(new Request(search,attr),libFound);
        return libFound;
    }

    private static void executionSpeed(int level){
        try {
            Thread.sleep(level*1);
            System.out.print("... loading ... ");
            Thread.sleep(level*2);
            System.out.print("loading ... ");
            Thread.sleep(level*3);
            System.out.println("loading");
            Thread.sleep(level*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class Request{
        String search;
        Attributes attr;

        public Request(String search, Attributes attr) {
            this.search = search;
            this.attr = attr;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Request request = (Request) o;
            return Objects.equals(search, request.search) &&
                    attr == request.attr;
        }

        @Override
        public int hashCode() {
            return Objects.hash(search, attr);
        }
    }
}
