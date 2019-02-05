public class Check {

    public int a= getA();
/*
    public Check(){
        a=2;
    }
*/
    public int getA(){
        return 4;
    }


    public static void main(String [] args){

        Check obj=new Check();
        System.out.println(obj.a);

    }

}
