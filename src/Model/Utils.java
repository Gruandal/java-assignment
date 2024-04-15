package Model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Utils {
    public static void print(Object... args) {
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static String input(Object... args) {
        Scanner scanner = new Scanner(System.in);
        if (args.length >= 1) {
            System.out.print(args[0].toString() + (args.length > 1 ? args[1].toString() : "\n"));
        }
        String result = "";
        if (scanner.hasNextLine()) {
            result = scanner.nextLine();
        }
        return result;
    }

    public static String getFileContents(String filePath, Charset charsets) {
        StringBuilder content = new StringBuilder();
        try {
            filePath = FileSystems.getDefault().getPath(filePath).normalize().toAbsolutePath().toString();
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            content.append(new String(bytes, charsets));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static String getFileContents(String filePath) {
        return getFileContents(filePath, StandardCharsets.UTF_8);
    }
}
