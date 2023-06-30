package Ex3;

import java.util.Scanner;

class Car {
    private static final char CAR_CHAR = 'O';
    private int position;

    public Car(int initialPosition) {
        this.position = initialPosition;
    }

    public int getPosition() {
        return position;
    }

    public void moveLeft() {
        position = Math.max(0, position - 1);
    }

    public void moveRight(int trackLength) {
        position = Math.min(trackLength - 1, position + 1);
    }

    public void draw(int trackLength) {
        for (int i = 0; i < trackLength; i++) {
            if (i == position) {
                System.out.print(CAR_CHAR);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

class Player {
    private static final char LEFT_INPUT = 'a';
    private static final char RIGHT_INPUT = 'd';
    private static final char QUIT_INPUT = 'q';
    private char lastInput;

    public char getLastInput() {
        return lastInput;
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        lastInput = scanner.nextLine().charAt(0);
    }

    public boolean wantsToQuit() {
        return lastInput == QUIT_INPUT;
    }

    public boolean wantsToMoveLeft() {
        return lastInput == LEFT_INPUT;
    }

    public boolean wantsToMoveRight() {
        return lastInput == RIGHT_INPUT;
    }
}

class Game {
    private static final int TRACK_LENGTH = 10;
    private static final char TRACK_CHAR = '-';
    private static final int POINTS_PER_STEP = 10;
    private static final char OBSTACLE = 'b';
    private Car car;
    private Player player;
    private int score;

    public Game() {
        this.car = new Car(TRACK_LENGTH / 2);
        this.player = new Player();
        this.score = 0;
    }

    public void start() {
        System.out.println("Welcome to Car Racing Game!");
        System.out.println("Use 'a' to move left, 'd' to move right, and 'q' to quit.");

        while (true) {
            System.out.println("Score: " + score);
            drawTrack();
            drawObstacle();
            car.draw(TRACK_LENGTH);
            player.readInput();

            if (player.wantsToQuit()) {
                break;
            }
            if (player.wantsToMoveLeft()) {
                car.moveLeft();
            } else if (player.wantsToMoveRight()) {
                car.moveRight(TRACK_LENGTH);
            }
            if(obstacle(car.getPosition())){
                break;
            }

            score += POINTS_PER_STEP;
        }

        System.out.println("Game over! Final score: " + score);
    }

    private void drawTrack() {
        for (int i = 0; i < TRACK_LENGTH; i++) {
            System.out.print(TRACK_CHAR);
        }
        System.out.println();
    }

    private boolean obstacle(int carPosition){
        int position = (int) (Math.random() * TRACK_LENGTH) - 1;
        return position == carPosition;
    }
    private void drawObstacle(){
        int position = (int) Math.ceil(Math.random() * TRACK_LENGTH) - 1;
        for (int i = 0; i < TRACK_LENGTH; i++) {
            if (i == position) {
                System.out.print(OBSTACLE);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public class CarRacingGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}



