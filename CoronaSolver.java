//import file reading
import java.io.*;
import java.util.*;

public class CoronaSolver {

  //Initialize output string
  private String output = "";
  private int totalDays, flightExposed, la, ny;

  //File reading
  private BufferedReader reader;
  private File inputFileName = new File("/testInputFile.txt")

  public String solve(String inputFileName){
    reader = new BufferedReader(new FileReader(inputFileName));

    //Instantiate the private instance variables using the FileReader

    totalDays = reader.readLine();
    flightExposed = reader.readLine();
    exposedUpdate();

  }

  public void exposedUpdate(){

      String laString = "";
      String nyString = "";

      char c = reader.read();
      while(c != ' '){
        laString+=c;
        c.read();
      }
      while(c != ' '){
        nyString+=c;
        c.read();
      }
      la = parseInt(laString);
      ny = parseInt(nyString);

    }
}
