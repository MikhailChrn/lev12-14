import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.InputStreamReader;
        import java.util.Scanner;

public class Solution02_2  {

    //Считать с консоли путь к файлу.
    //Вывести в консоли (на экран) содержимое файла.
    //Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();
    }
}
