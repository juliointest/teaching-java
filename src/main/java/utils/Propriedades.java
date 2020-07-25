package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propriedades {
    public static String getPropriedade(String chave) {
        String propriedade = null;

        try (InputStream input = new FileInputStream("./src/main/resources/config.properties")) {

            Properties property = new Properties();
            property.load(input);

            propriedade = property.getProperty(chave);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return propriedade;
    }
}
