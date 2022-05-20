import java.io.*;
        import java.util.ArrayList;

public class Solution03_1 {

    //Прочесть с консоли имя файла.
    //Считывать строки с консоли, пока пользователь не введет строку "exit".
    //Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.

    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла для записи: ");
        String outputFileName = reader.readLine();

        System.out.println("Введите строки для записи");
        ArrayList<String> list = new ArrayList<>();
        String str;
        do {
            str = reader.readLine();
            list.add(str);
        } while (str.equals("exit") != true);
        reader.close();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName)))
        {
            for (String wrStr : list) bufferedWriter.write(wrStr + "\n");
            bufferedWriter.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
