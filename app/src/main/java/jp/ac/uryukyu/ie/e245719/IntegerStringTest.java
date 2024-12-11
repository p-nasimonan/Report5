package jp.ac.uryukyu.ie.e245719;

public class IntegerStringTest {
    
    public static void main(String[] args) {
        try{
            String str = "壱百満";
            int value = Integer.parseInt(str);
            System.out.println(value);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
    } 
}
