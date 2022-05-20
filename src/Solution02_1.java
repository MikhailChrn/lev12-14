import java.io.*;
        import java.util.Scanner;

public class Solution02_1 {
    public static void main(String[] args) throws IOException {

        //Считать с консоли путь к файлу.
        //Вывести в консоли (на экран) содержимое файла.
        //Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры

        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String inputPath = scanner.nextLine();
        scanner.close();

        InputStream inStream = new FileInputStream(inputPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inStream));

        while (bufferedReader.ready()) {System.out.println(bufferedReader.readLine());}

        bufferedReader.close();
        inStream.close();
    }
}
