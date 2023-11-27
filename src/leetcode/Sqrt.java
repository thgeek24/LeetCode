package leetcode;

public class Sqrt {
    public int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt((x)));
    }

    public static void main(String[] args) {
        Sqrt st = new Sqrt();
        System.out.println(st.mySqrt(8));
    }
}
