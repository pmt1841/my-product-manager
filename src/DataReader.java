import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<Product> readData() {
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Main.DEFAULT_PATH))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] value = line.split(",");

                int id = Integer.parseInt(value[0]);
                String name = value[1];
                double price = Double.parseDouble(value[2]);
                String brand = value[3];
                String manufacturer = value[4];
                String description = value[5];

                productList.add(new Product(id, name, price, brand, manufacturer, description));
            }

        } catch (IOException e) {
            System.out.println("Cannot read file");
        }

        return productList;
    }

    public List<Product> readData(String path) {
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] value = line.split(",");

                int id = Integer.parseInt(value[0]);
                String name = value[1];
                double price = Double.parseDouble(value[2]);
                String brand = value[3];
                String manufacturer = value[4];
                String description = value[5];

                productList.add(new Product(id, name, price, brand, manufacturer, description));
            }

        } catch (IOException e) {
            System.out.println("Cannot read file");
        }

        return productList;
    }
}
