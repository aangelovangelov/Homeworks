import java.util.Scanner;

public class Pr20_TheHeiganDance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerHP = 18_500;
        double heiganHP = 3_000_000;
        int playerRow = 7;
        int playerCol = 7;
        boolean isPoisened = false;
        boolean isHeiganDead = false;
        boolean isPlayerDead = false;
        String killedBySpell = "";
        double damageForHeigan = sc.nextDouble();
        sc.nextLine();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if ("".equals(line)) {
                break;
            }
            String[] input = line.split(" ");
            String comand = input[0];
            int spellRow = Integer.parseInt(input[1]);
            int spellCol = Integer.parseInt(input[2]);

            heiganHP -= damageForHeigan;
            isHeiganDead = heiganHP <= 0;

            if (isPoisened) {
                playerHP -= 3500;
                isPoisened = false;
                isPlayerDead = playerHP <= 0;
            }

            if (isHeiganDead || isPlayerDead) {
                break;
            }

            boolean isInSpellRange = (spellRow - 1) <= playerRow && playerRow <= (spellRow + 1) &&
                    (spellCol - 1) <= playerCol && playerCol <= (spellCol + 1);
            if (isInSpellRange) {
                boolean canMoveUp = playerRow - 1 >= 0 && playerRow - 1 < spellRow - 1;
                if (canMoveUp) {
                    playerRow--;

                } else {
                    boolean canMoveRight = playerCol + 1 <= 14 && playerCol + 1 > spellCol + 1;
                    if (canMoveRight) {
                        playerCol++;

                    } else {
                        boolean canMoveDown = playerRow + 1 <= 14 && playerRow + 1 > spellRow + 1;
                        if (canMoveDown) {
                            playerRow++;

                        } else {
                            boolean canMoveLeft = playerCol - 1 >= 0 && playerCol - 1 < spellCol - 1;
                            if (canMoveLeft) {
                                playerCol--;

                            } else {// can`t move and take the damage

                                if ("Cloud".equals(comand)) {
                                    playerHP -= 3500;
                                    isPoisened = true;
                                    killedBySpell = comand;
                                } else {//"Eruption".equals(comand)
                                    playerHP -= 6000;
                                    killedBySpell = comand;
                                }

                                isPlayerDead = playerHP <= 0;

                                if (isPlayerDead) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (isHeiganDead) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganHP);
        }

        if (isPlayerDead) {
            if ("Cloud".equals(killedBySpell)) {
                killedBySpell = "Plague " + killedBySpell;
            }
            System.out.println("Player: Killed by " + killedBySpell);
        } else {
            System.out.println("Player: " + playerHP);
        }

        System.out.println("Final position: " + playerRow + ", "+ playerCol);

    }
}
