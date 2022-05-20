import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.InputStreamReader;

public class Solution03_2 {

    //Прочесть с консоли имя файла.
    //Считывать строки с консоли, пока пользователь не введет строку "exit".
    //Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));

        StringBuilder builder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }

        writer.write(builder.toString());
        writer.close();
    }
}
