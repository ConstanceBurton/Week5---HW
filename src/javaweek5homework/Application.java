package javaweek5homework;

public class Application {

  public static void main(String[] args) {

    Logger asterisklogger = new AsteriskLogger();
    
    asterisklogger.Log("Hello");
    System.out.println();
    
    asterisklogger.Error("Hello");
    System.out.println();
    
    Logger spacedlogger = new SpacedLogger();
    
    spacedlogger.Log("Hello");
    System.out.println();
    
    spacedlogger.Error("Hello");
    System.out.println();
    
    
  }

}
