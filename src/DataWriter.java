import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter {
    public void writeData(List<Product> productList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Main.DEFAULT_PATH))) {
            bw.write("ID\tNAME\tPRICE\tBRAND\tMANUFACTURER\tDESCRIPTION\n");
            for (Product product : productList) {
                bw.write(product.toCSV() + "\n");
            }
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    public void writeData(List<Product> productList, String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("ID\tNAME\tPRICE\tBRAND\tMANUFACTURER\tDESCRIPTION\n");
            for (Product product : productList) {
                bw.write(product.toCSV() + "\n");
            }
            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
