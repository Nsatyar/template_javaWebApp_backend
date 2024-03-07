package com.example;

import java.util.ArrayList;
import java.util.List;

public class SnakeGame {
    private List<Point> snake;
    private Point food;
    private int score;
    private int direction;

    public SnakeGame() {
        snake = new ArrayList<>();
        snake.add(new Point(0, 0));
        food = new Point(5, 5);
        score = 0;
        direction = 0;
    }

    public void move() {
        Point head = snake.get(0);
        Point newHead = new Point(head.getX(), head.getY());

        switch (direction) {
            case 0: // Up
                newHead.setY(newHead.getY() - 1);
                break;
            case 1: // Down
                newHead.setY(newHead.getY() + 1);
                break;
            case 2: // Left
                newHead.setX(newHead.getX() - 1);
                break;
            case 3: // Right
                newHead.setX(newHead.getX() + 1);
                break;
        }

        snake.add(0, newHead);

        if (newHead.equals(food)) {
            score++;
            generateFood();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    public void changeDirection(int newDirection) {
        if (Math.abs(direction - newDirection) != 2) {
            direction = newDirection;
        }
    }

    private void generateFood() {
        // Generate new food at a random position
        // ...
    }

    public int getScore() {
        return score;
    }

    public List<Point> getSnake() {
        return snake;
    }

    public Point getFood() {
        return food;
    }
}
