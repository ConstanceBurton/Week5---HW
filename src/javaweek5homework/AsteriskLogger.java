package javaweek5homework;

public class AsteriskLogger implements Logger {

  @Override
  public void Log(String str) {
    System.out.println("***" + str + "***"); //print asterisk string then asterisks again
    
  }

  @Override
  public void Error(String str) {
    System.out.println("***Error: " + str + "***");
    
  }
  

}
