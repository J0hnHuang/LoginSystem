import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String user1 = "jimboy";
   int pass1 = 123;
   String user2 = "PC";
   int pass2 = 321;
   String user3 = "Discord";
   int pass3 = 567;

   System.out.println("Username: ");
   String user = scan.nextLine();
   System.out.println("Password: ");
   int pass = scan.nextInt(); 


   if(user.equals(user1) && pass == pass1){
    System.out.println("Welcome, " + user1);
  }else if(user.equals(user2) && pass == pass2){
    System.out.println("Welcome, " + user2);
  }else if(user.equals(user3) && pass == pass3){
    System.out.println("Welcome, " + user3);
  }else{
    System.out.println("Wrong username or password");
  }

  while( !(user.equals(user1) && pass == pass1) && !(user.equals(user2) && pass == pass2) && !(user.equals(user3) && pass == pass3)){
   System.out.println("Username: ");
   user = scan.nextLine();
   user = scan.nextLine();
   System.out.println("Password: ");
   pass = scan.nextInt();

  if(user.equals(user1) && pass == pass1){
    System.out.println("Welcome, " + user1);
  }else if(user.equals(user2) && pass == pass2){
    System.out.println("Welcome, " + user2);
  }else if(user.equals(user3) && pass == pass3){
    System.out.println("Welcome, " + user3);
  }else{
    System.out.println("Wrong username or password");
  }


  }
}
}