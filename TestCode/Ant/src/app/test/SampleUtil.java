package app.test;
public class SampleUtil {
   private String message;

   //Constructor
   //@param message to be printed
   public SampleUtil(String message){
      this.message = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }

   // add "Hi!" to the message
   public String GetMessage(){
      return message;
   }   
}