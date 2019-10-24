package ch.epfl.sweng.defensive.neutral.returned.value;

import java.util.Scanner;
import java.util.Optional;

import ch.epfl.sweng.defensive.neutral.returned.value.goolge.Goolge;
import ch.epfl.sweng.defensive.neutral.returned.value.model.Result;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a search phrase:");
        String line = scanner.nextLine().trim();
        if (!line.isEmpty()) {
            String[] keywords = line.split(" ");
            Optional<Result> data = Goolge.search(keywords);
            while (data.isPresent()) {
                Result result = data.get();
                System.out.println(result);
                System.out.println("...");
                scanner.nextLine();
                data = result.next();
            }
            System.out.println();
        }
    }
}