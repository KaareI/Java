import java.util.Scanner;

public class  yl30 {

public static void main (String[] args){

Scanner reader = new Scanner(System.in);
System.out.print("Up to what number?");
int targetNumber = Integer.parseInt(reader.nextLine());
int number = 0;

while(targetNumber > number){
    number++;
    System.out.print(number + "\n");
}

}

}