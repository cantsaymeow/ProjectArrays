package by.gryaznov.epam.main;
import by.gryaznov.epam.reader.impl.ReaderFromFileImpl;
import by.gryaznov.epam.service.impl.ServiceArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomMain {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        ReaderFromFileImpl file = new ReaderFromFileImpl();
        file.readFile("src\\main\\resources\\array");
        ServiceArrayImpl testService = new ServiceArrayImpl();
        logger.info(testService.findMax());
    }

}
