import  java.util.*;
public class diceroller {
    static  void printdie(int diceroller){
        String dice1= """
                  ----------
                |           |
                |     ●     |
                |           |
                  ----------
                """;
        String dice2="""
                  ---------
                |  ●        |
                |           |
                |        ●  |
                  --------
                """;
        String dice3="""
                  ---------
                |  ●        |
                |     ●     |
                |        ●  |
                  --------
                """;
        String dice4="""
                  ----------
                |  ●    ●   |
                |           |
                |  ●    ●   |
                   ---------
                """;
        String dice5="""
                  ---------
                |  ●     ●  |
                |     ●     |
                |  ●     ●  |
                  ---------
                """;
        String dice6="""
                  ---------
                |  ●    ●  |
                |  ●    ●  |
                |  ●    ●  |
                  --------
                """;
        switch (diceroller){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);


        }

    }
    public static void main(String[] args) {
        Random rn=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of dice you want to roll :");
        int diceroll=sc.nextInt();
        if(diceroll<0){
            System.out.println("please enter number greater than 0 :");
        }
        int total=0;
        for(int i=0;i<diceroll;i++){
            int dicerol=rn.nextInt(1,7); //it will genrate random number from 1-6
            printdie(dicerol);
            total=total+dicerol;


        }
        System.out.println("tottal number of diceroll :"+total);
        sc.close();
    }
}
