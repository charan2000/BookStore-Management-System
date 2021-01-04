import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

abstract class Details{      //Abstract class is defined:
    abstract int getInt();  
}
class SubDetails extends Details{   //Concept of Inheritance"
    public int getInt(){            //Abstract method definition:
        Scanner sc1= new Scanner(System.in);
                int option = sc1.nextInt();
                sc1.close();
                return option;
    }
    String getDetails(){
        System.out.println("\nEnter Your UserName: ");
        Scanner sc2 = new Scanner(System.in);
        String str1 = sc2.nextLine();
        sc2.close();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\nEnter the password for ");
        String str2 = sc3.nextLine();
        sc3.close();
        System.out.println("\nWelcome "+str1);
        return str2;
    }
}
public class BSMS{
    public static void main(String[]args){
		System.out.println("\n ------------------Hello Welcome to the  Book Store Management System--------------------\n");
                System.out.println("\n->Please follow the steps that are provided here: ");
                System.out.println("\n->Press 1 to login to Lovely's BookStore Account:");
                SubDetails object1 = new SubDetails();
                Scanner sc1= new Scanner(System.in);
                int option = sc1.nextInt();
                sc1.close();
                if (option == 1){
                        object1.getDetails();
                        try {                                                    //Concept of Exceptional Handling:
                                File myObj = new File("text.txt");
                                Scanner myReader = new Scanner(myObj);
                                System.out.println("\n->These are the available Books for JAVA: \n");
                                while (myReader.hasNextLine()) {
                                String data = myReader.nextLine();
                                    System.out.println(data);
                                }
                                 myReader.close();
                            } catch (FileNotFoundException e) {
                                   System.out.println("An error occurred.");
                                     e.printStackTrace(); }   
                        System.out.println("\n->Please Choose the Book No. to buy from the above list:");
                        int price = 0;
                        int bNo = object1.getInt();
                        if(bNo == 1){
                            price = 499;
                            String bName = "Core Java Volume I: Fundamentals"; 
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");
                           }
                        else if(bNo == 2){
                            price = 456;
                            String bName = "Effective Java"; 
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");                            
                            }
                        else if(bNo == 3){
                            price = 369;
                            String bName = "Java: A Beginner s Guide ";
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");                     
                        }
                        else if(bNo == 4){
                            price = 399;
                            String bName = "Java - The Complete Reference ";
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");                        
                        }
                        else if(bNo == 5){
                            price = 299;
                            String bName = "Java Concurrency in Practice ";
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");                     
                        }
                        else if(bNo == 6){
                            price = 559;
                            String bName = "Test-Driven: TDD and Acceptance TDD for Java Developers ";
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");                     
                        }
                        else if(bNo == 7){
                            price = 559;
                            String bName = "Java Performance: The Definite Guide ";
                            System.out.println("\nThe book you choose is "+bName+" and the Price is: Rs"+price+"/-");                    
                        }
                        else {System.out.println("\n ->Try again and select the book from the list:");}

                            //System.out.println("\n Please Enter the Book name to verify: ");
                            //System.out.println(object1.getName()+"\n is the Book you choose! ");
                                System.out.println("\n->Press '1' to Checkout to payment:\n");
                                int pay = object1.getInt();
                                if(pay == 1){
                                 System.out.println("\n->Enter the quantity: ");
                                int quantity = object1.getInt();
                                System.out.println("\n Your Order details are: \n");
                                System.out.println("\n The Book No. : "+bNo+"  X  "+quantity+"pieces");
                                double bill = (double)price*quantity;
                                System.out.println("->Total Price is: "+bill);
                            }
                            else {System.out.println("\n->Payment Cancelled: ");}
                } 
                else {
                    System.out.println("\n->Login Cancelled! \n Try again later !!");
                }
}
}
