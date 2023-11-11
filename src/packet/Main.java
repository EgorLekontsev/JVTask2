package packet;
public class Main {
	private static int x = 2;
	private static int y = 14;
	public static void main(String[] args) {
        System.out.println("Before: x="+x+", y="+y);
        Swap();
        System.out.println("After: x="+x+", y="+ y);
	}
	public static void Swap(){
        x = x - y;
        y = x + y; 
        x = y - x;
    }
}
