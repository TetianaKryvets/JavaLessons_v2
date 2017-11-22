package Files;

import java.io.*;

/**
 * User: tetiana.kryvets
 * Date: 11/16/2017
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File newFile = new File("/src/main/java/Files/Test.txt");

        writeToFile(newFile);
        readFromFile(newFile);



    }

    public static String readFromFile(File newFile) throws IOException {
        StringBuilder sb = new StringBuilder();

            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( newFile.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }

            System.out.println("Data from file: " + sb);

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    public static void writeToFile(File newFile) throws IOException {
        if (!newFile.exists()) {
            newFile.createNewFile();
        }

        //write to file
        PrintWriter rightToFile = new PrintWriter(newFile);
        rightToFile.print("Text1" + "\n");
        rightToFile.print("Text2" + "\n");
        rightToFile.print("Text3" + "\n");
        rightToFile.close();


    }
}
