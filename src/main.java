import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import operations.Calculator;
import operations.ErrorInInput;
import operations.Fraction;
import  org.w3c.dom.Document;



public class Main {

    public static void main(String[] args) {
        if (args.length != 0) {
            Path path = Paths.get(args[0]);
            try {
                System.setIn(Files.newInputStream(path));
            } catch (IOException e) {
                System.out.println("Не удалось найти файл, Вы можете ввести данные вручную");
            }
        }
        Calculator calculator = new Calculator();
        Tokenizer tokenizer = new Tokenizer();
        Scanner scanner = new Scanner(System.in);
        String input;
        try {
            while (!(input = scanner.nextLine()).isEmpty()) {
                try {
                    System.out.println(input + " = " + calculator.calculate(tokenizer.tokenize(input)));
                } catch (ErrorInInput e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        catch (NoSuchElementException ex) {

        }
    }

    private void createXML(List<Fraction> answers) throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

    }
}
