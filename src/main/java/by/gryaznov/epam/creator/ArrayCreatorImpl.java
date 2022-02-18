package by.gryaznov.epam.creator;

import by.gryaznov.epam.exception.ReaderException;
import by.gryaznov.epam.reader.ReaderFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayCreatorImpl implements ReaderFromFile {
    static Logger logger = LogManager.getLogger();

    @Override
    public List<String> readFile(String pathToFile) throws ReaderException {
        List<String> finalFile = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(pathToFile));
            while (scanner.hasNextLine()) {
                Scanner s2 = new Scanner(scanner.nextLine());
                while (s2.hasNextLine()) {
                    String s = s2.next();
                    finalFile.add(s);
                }
            }
        } catch (IOException e) {
            logger.error("IOException");
        }
        return finalFile;
    }


}
