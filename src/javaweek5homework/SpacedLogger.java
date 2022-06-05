package javaweek5homework;

public class SpacedLogger implements Logger{

  @Override
  public void Log(String str) {
   
      for(int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        System.out.print(ch + " ");
      }
    
  }

  @Override
  public void Error(String str) {
    System.out.print("Error: ");
    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      System.out.print(ch + " ");
      
    }
    
  }
  

}
