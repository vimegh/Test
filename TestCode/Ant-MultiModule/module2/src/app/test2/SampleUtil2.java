package app.test2;
public class SampleUtil2 {
   private String message;

   //Constructor
   //@param message to be printed
   public SampleUtil2(String message){
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