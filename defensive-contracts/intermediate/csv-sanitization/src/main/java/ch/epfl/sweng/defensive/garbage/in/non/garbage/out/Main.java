package ch.epfl.sweng.defensive.garbage.in.non.garbage.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void read(String file) throws FileNotFoundException {
    File document = new File(file);
    Scanner reader;
    try{
      reader = new Scanner(document);
      while(reader.hasNextLine()){
        System.out.println(reader.nextLine());
      }
      System.out.println("DONE");
    } catch (FileNotFoundException e) {
      System.out.println("The file location is wrong try again");
    }
  }
  public static void main(String[] args) throws FileNotFoundException{
    if (args.length < 4) {
      System.out.println("usage : -i <input> -o <output> -v");
      System.exit(1);
    }

    if (!args[0].equals("-i")) {
      System.out.println("missing input file");
      System.exit(1);
    }
    String inputFileName = args[1];
    System.out.println(inputFileName);

    if (!args[2].equals("-o")) {
      System.out.println("missing output file");
      System.exit(1);
    }
    String outputFileName = args[3];
    System.out.println(outputFileName);

    final Boolean verbose = args.length == 5 && args[4].equals("-v");
    read("src/access_log.csv");
  }
}