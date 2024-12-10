package jp.ac.uryukyu.ie.e245719;
public class NullTest {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
