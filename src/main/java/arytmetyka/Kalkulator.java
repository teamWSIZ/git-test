package arytmetyka;

/**
 * Created on 09.09.16, at 18:26
 */
public class Kalkulator {
    public int add(int x, int y) {
        return x + y;
    }
    public int sub(int x, int y) {
        return x - y;
    }
    public int times(int x, int y) {
        return x * y;
    }
    public int div(int x, int y) {
        if (y==0) {
            throw new ArithmeticException("Nie dziel ... nigdy przez zero!");
        }
        return x / y;
    }
public void petla(int x){
    for (int i = 0; i <x ; i++) {
        System.out.println("to wyswietla sie "+ i+ "raz w petli");
        System.out.println("test");
    }

}
}
