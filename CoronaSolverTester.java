import java.util.*;
import java.io.*;

public class CoronaSolverTester{
  public static void main(String[] args) throws IOException{
    CoronaSolver corona = new CoronaSolver();
    corona.solve("testInputFile.txt");
    System.out.print("Done!");
  }
}
