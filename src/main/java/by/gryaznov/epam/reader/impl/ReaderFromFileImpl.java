package by.gryaznov.epam.reader.impl;

import by.gryaznov.epam.exception.ReaderException;
import by.gryaznov.epam.reader.ReaderFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ReaderFromFileImpl implements ReaderFromFile {
    static Logger logger = LogManager.getLogger();

    @Override
    public List<String> readFile(String pathToFile) {
        List<String> finalFile = new ArrayList<>();
        try{Scanner scanner = new Scanner(new File(pathToFile));
        while (scanner.hasNextLine()) {
            Scanner s2 = new Scanner(scanner.nextLine());
            while (s2.hasNextLine()) {
                String s = s2.next();
                finalFile.add(s);
            }
        }

        } catch(IOException e){
            logger.error("IOException");
        }
        return finalFile;
    }
}
