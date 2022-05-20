import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution05 {

    //Введи с клавиатуры 2 целых положительных числа.
    //Выведи в консоли наибольший общий делитель.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два целых положительных числа: ");
        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        System.out.println("Наибольший общий делитель двух чисел: ");
        System.out.println(searchMaxJoinDivider(searchForDividers(a), searchForDividers(b)));
    }

    public static ArrayList<Integer> searchForDividers(Integer n) {
        ArrayList<Integer> deviders = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if ((n % i) == 0) deviders.add(i);
        }
        return deviders;
    }

    public static Integer searchMaxJoinDivider (ArrayList<Integer> a, ArrayList<Integer> b) {
        Integer maxDivider = null;
        ArrayList<Integer> large;
        ArrayList<Integer> small;
        if (a.get(0) >= b.get(0)) {large = a; small = b;}
        else {large = b; small = a;}
        ArrayList<Integer> join = new ArrayList<>();
        for (int i : large) {
            for (int j : small) {
                if (j == i) {
                    join.add(j);
                }
            }
        }
        return join.get(0);
    }
}

