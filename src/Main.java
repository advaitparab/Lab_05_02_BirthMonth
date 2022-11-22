import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line;

        int birhtMonth=0;

        while(true){

            try{

                System.out.print("Enter your Birth Month : ");

                line = sc.nextLine();

                birhtMonth = Integer.parseInt(line);

                if(birhtMonth>=0&&birhtMonth<=12){

                    System.out.println("Your birth month is:"+birhtMonth);

                    break;

                }else{

                    System.out.println("You entered an incorrect month value: "+birhtMonth);

                }

            }catch(Exception e){

                System.out.println("You did not enter a number");

            }

        }

        sc.close();

    }
    }