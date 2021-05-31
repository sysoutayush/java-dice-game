import java.util.Random;

public class Program
{
    public static void six(){
        System.out.print("---------\n|*  *|\n|*  *|\n|*  *|---------");
    }
   
    public static void five(){
        System.out.print("---------\n|*  *|\n|  *  |\n|*  *|---------");
    }
    
    public static void four(){
        System.out.print("---------\n|*  *|\n|    |\n|*  *|---------");
    }
    
    public static void three(){
        System.out.print("---------\n|*   |\n| *  |\n|  * |---------");
    } 
    
    public static void two(){
        System.out.print("---------\n|   *|\n|    |\n|*   |---------");
    } 
    
    
    public static void one(){
        System.out.print("---------\n|    |\n|  *  |\n|    |---------");
    }

private static int random() {
    Random r=new Random();
    int a =r.nextInt(6)+1;
    return a;
}

public static void main(String[] args) {
    int you =random();
    int computer=random();
    System.out.println("you");
    switch(you){
        case 1: one();break;
        case 2: two();break;
        case 3: three();break;
        case 4: four();break;
        case 5: five();break;
        case 6: six();break;
    }
    System.out.println("\n");
    System.out.println("computer");
    switch(computer){
        case 1: one();break;
        case 2: two();break;
        case 3: three();break;
        case 4: four();break;
        case 5: five();break;
        case 6: six();break;
    }
    if (you>computer)
    {
        System.out.println("\nlucky! YOU WON");
    }
    if(computer>you){
        System.out.println("\nUnlucky! YOU LOSE");
    }
    if(computer==you){
        System.out.println("\n GAME DRAW");
    }
}
}