package M3_as7;

public class Yahtzee {
    public static void main(String[] args) {
        int a;
        a = keeprolling();
        System.out.println(a);
    }

    public static int rollDice() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 5;
        randomNumber = randomNumber + 1;
        int random = (int) randomNumber;
        return random;
    }
    public static int keeprolling(){
        int dice1=rollDice();
        int dice2=rollDice();
        int dice3=rollDice();
        int dice4=rollDice();
        int dice5=rollDice();
        int count=1;
        while(!((dice1==dice2) && (dice1==dice3) && (dice1==dice4) && (dice1==dice5))){
            dice1=rollDice();
            dice2=rollDice();
            dice3=rollDice();
            dice4=rollDice();
            dice5=rollDice();
            count=count+1;
        }
        return count;
    }
}