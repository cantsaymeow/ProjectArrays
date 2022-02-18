package by.gryaznov.epam.reader;

import by.gryaznov.epam.exception.ReaderException;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReaderFromFile {
    public List<String> readFile (String pathToFle) throws ReaderException;
}
