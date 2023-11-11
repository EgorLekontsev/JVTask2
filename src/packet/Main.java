package packet;
public class Main {
	private static int x = 2; //Объявляем и инициализируем наши 2 целочисленные переменные
	private static int y = 14;
	public static void main(String[] args) { //Смотрим результат до и после
        System.out.println("Before: x="+x+", y="+y); //2 и 14
        Swap(); //Вызываем метод, для изменения переменных посредством математических операций
        System.out.println("After: x="+x+", y="+ y); //14 и 2
	}
	public static void Swap(){
        x = x - y;
        y = x + y; 
        x = y - x;
    }
}
