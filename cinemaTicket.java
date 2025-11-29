import java.util.Scanner;

public class cinemaTicket
{
    static double basePrice;
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the corresponding age group: 1.Child\t  2.Adult\t  3.Senior\t");
        int age = scan.nextInt();
        System.out.println("Enter the corresponding movie language: 1.Hindi\t  2.English\t");
        int movieLang = scan.nextInt();
        scan.nextLine();
        System.out.println("Does the customer have student ID? (yes/no)");
        String Student = scan.nextLine();
        boolean isStudent =(Student.charAt(0) == 'y');
        System.out.println("Is it currently a festival? (yes/no)");
        String Festival = scan.nextLine();
        boolean isFestival =(Festival.charAt(0) == 'y');

        switch(age)
        {
            case 1: 
                basePrice = 150; 
                break;
            case 2: 
                basePrice = 250; 
                break;
            case 3: 
                basePrice = 200; 
                break;
            default:
                System.out.println("Invalid age group!");
                break;
        }
        
        switch(movieLang)
        {
            case 1: 
                basePrice += 50; 
                break;
            case 2: 
                basePrice += 100; 
                break;
            default:
                System.out.println("Invalid movie language!");
                break;
        }

        if(isStudent && isFestival)
        {
            basePrice = basePrice - (basePrice * 0.35);   
        }
        else if(isStudent)
        {
            basePrice = basePrice - (basePrice * 0.20);   
        }
        else if(isFestival)
        {
            basePrice = basePrice - (basePrice * 0.15);  
        }

        System.out.println("The price of the movie ticket is Rs " + basePrice);
    }
}
