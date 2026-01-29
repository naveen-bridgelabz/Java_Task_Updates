package Day04_SnakeAndLadder;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int playerPosition = 0;

        while(playerPosition < 100){
            // FIXED: Dice roll should be 1–6
            int diceRoll = (int) (Math.random() * 6) + 1;

            int playerOption = (int) (Math.random() * 3);

            switch (playerOption) {
                case 0:
                    System.out.println("No Play");
                    break;

                case 1:
                    System.out.println("Ladder");
                    playerPosition = playerPosition + diceRoll;
                    break;

                case 2:
                    System.out.println("Snake");
                    playerPosition = playerPosition - diceRoll;
                    break;
            }

        if(playerPosition < 0){
            playerPosition = 0;
        }
            System.out.println("Dice Roll: " + diceRoll);
            System.out.println("Player Position: " + playerPosition);
        }

        System.out.println("Player Reached 100th Position");
    }
}
