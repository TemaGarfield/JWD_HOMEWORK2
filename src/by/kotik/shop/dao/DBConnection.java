package by.kotik.shop.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DBConnection {
    public static String getData(String path) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(path));
        String data = "";

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (!line.isEmpty()) {
                data += line + '\n';
            }
        }

        return data;
    }
}
