//import file reading
import java.io.*;
import java.util.*;

public class CoronaSolver {

  //Initialize output string
  private String output = "";
  private int totalDays, flightExposed, la, ny;

  //File reading
  private BufferedReader reader;
  private File inputFileName = new File("testInputFile.txt");

  public String solve(String inputFileName) throws IOException{
    //READ THE FILE
    reader = new BufferedReader(new FileReader(inputFileName));
    System.out.println("BufferedReader succesfully created.");
    //Instantiate the private instance variables using the FileReader
    totalDays = Integer.parseInt(reader.readLine());
    System.out.println("Total Days: " + totalDays);
    //.readLine() returns String
    flightExposed = Integer.parseInt(reader.readLine());
    System.out.println("Infected patients on flight: " + flightExposed);

    //Update next day
    System.out.println("Updating...");
    exposedUpdate();


    //RETURN THE OUTPUT
    return output;
  }

  public void exposedUpdate() throws IOException{
      String laString = "";
      String nyString = "";
      //.read() returns int
      char c = (char)reader.read();

      while(c != ' '){
        laString+=c;
        reader.read();
      }
      while(c != ' '){
        nyString+=c;
        reader.read();
      }
      la = Integer.parseInt(laString);
      System.out.println("LA: " + la);
      ny = Integer.parseInt(nyString);
      System.out.println("NY: " + ny);

    }
}
