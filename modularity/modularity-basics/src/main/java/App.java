import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        compute();
    }

    public static List<Double> compute() throws FileNotFoundException {
        File file = new File("data");
//        List<Double> normalized = new ArrayList<>();
        Scanner scanner = new Scanner(file);

//        List<Double> numbers = new ArrayList<>();
//        while (scanner.hasNextDouble()) {
//            double number = scanner.nextDouble();
//            numbers.add(number);
//        }
        List<Double> numbers = importFiles(scanner);
//        double sum = 0;
//        for (double f : numbers) {
//            sum += f;
//        }
        //double mean = sum / numbers.size();
        double mean = MeanOfArray(numbers);

//        double sumSquare = 0;
//        for (double f : numbers) {
//            double diff = f - mean;
//            sumSquare += diff * diff;
//        }

//        double std = Math.sqrt(sumSquare / numbers.size());
        double std = calcStd(mean, numbers);

//        for (double f : numbers) {
//            normalized.add((f - mean) / std);
//        }
        List<Double> normalized = normalizer(mean, std, numbers);
        System.out.println(normalized);

//        try {
//            FileWriter fw = new FileWriter("output");
//            for (double n : normalized) {
//                fw.write(Double.toString(n));
//                fw.write("\n");
//            }
//            fw.close();
//        } catch (Exception e) {
//            System.out.println("Error writing output file");
//        }
//        System.out.println("Wrote output file.");
        exportFile(normalized);
        scanner.close();
        return normalized;
    }

    public static  List<Double> importFiles(Scanner scanner){
        List<Double> numbers = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            numbers.add(number);
        }
        return numbers;
    }

    public static  double MeanOfArray(List<Double> numbers){
        double sum = 0;
        for (double f : numbers) {
            sum += f;
        }
        return sum / numbers.size();
    }

    public static double calcStd(double mean, List<Double> numbers){
        double sumSquare = 0;
        for (double f : numbers) {
            double diff = f - mean;
            sumSquare += diff * diff;
        }
        return Math.sqrt(sumSquare / numbers.size());
    }

    public static List<Double> normalizer(double mean, double std, List<Double> numbers){
        List<Double> normalized = new ArrayList<>();
        for (double f : numbers) {
            normalized.add((f - mean) / std);
        }
        return normalized;
    }

    public static List<Double> exportFile(List<Double> normalized){
        try {
            FileWriter fw = new FileWriter("output");
            for (double n : normalized) {
                fw.write(Double.toString(n));
                fw.write("\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error writing output file");
        }
        System.out.println("Wrote output file.");
        return (normalized);
    }
}
