
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<Integer>[] w = new List[2];
        w[0] = Arrays.asList(1, 2, 3);
        w[1] = Arrays.asList(1, 2, 3);
        System.out.println(w[0].equals(w[1]));
//        Arrays.sort(w, (o1, o2) -> {});
        System.out.println(w);
    }
}
