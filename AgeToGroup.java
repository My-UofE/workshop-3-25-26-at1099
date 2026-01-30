public class AgeToGroup {
    public static void main(String[] args){
        int x = (int)(Math.random() * 101)-50;
        x = (x > 0) ? x : 0;
        System.out.println("x:" + x);
    }
}