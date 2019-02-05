package container;

public class MyArray {

    private String [] array;
    private int maxSize=10;
    private int lastIndex=-1;

    public int length(){
        return 0;
    }

    public void put(String s){
        array[++lastIndex]=s;
    }

    public String get(){
        if (lastIndex>0){

        }
        return array[0];
    }

}

class Demo{

    public static void main(String [] args){
        MyArray array = new MyArray();

        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4rd");
        array.put("5rd");

        System.out.println("Длина: " + array.length());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println("Длина: " + array.length());

        System.out.println(array.get());
        System.out.println(array.get());

        System.out.println("Длина перед тем как положить эелемент: " + array.length());
        array.put("new Elem");
        System.out.println("Длина после того как положили: " + array.length());
        System.out.println(array.get());
    }

}
