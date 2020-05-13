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

  public String solve(String inputFileName){
    //READ THE FILE
    reader = new BufferedReader(new FileReader(inputFileName));

    //Instantiate the private instance variables using the FileReader
    totalDays = Integer.parseInt(reader.readLine());
    //.readLine() returns String
    flightExposed = Integer.parseInt(reader.readLine());
    exposedUpdate();

    //RETURN THE OUTPUT
    return output;
  }

  public void exposedUpdate(){
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
      ny = Integer.parseInt(nyString);

    }
}
