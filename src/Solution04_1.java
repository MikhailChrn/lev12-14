import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution04_1 {

    //Ввести имя файла с консоли.
    //Прочитать из него набор чисел.
    //Вывести в консоли только четные, отсортированные по возрастанию.

    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String inputPath = scanner.nextLine();
        scanner.close();

        InputStream inStream = new FileInputStream(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inStream));

        ArrayList<Integer> list = new ArrayList<>();

        while (bufferedReader.ready()) {
            Integer i = Integer.parseInt(bufferedReader.readLine());
            if ((i % 2) == 0) list.add(i);
        }

        Collections.sort(list);
        for (Integer i : list) System.out.println(i);

        bufferedReader.close();
        inStream.close();
    }
}
