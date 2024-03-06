package Jobsheet2;

public class Dragon {
    int x, y, width, height;

    public Dragon (int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    void moveLeft(){
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
        printPosition();
    }

    void moveRight(){
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
        printPosition();
    }

    void moveUp(){
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
        printPosition();
    }

    void moveDown(){
        if (y < height) {
            y++;
        } else {
            detectCollision();
        }
        printPosition();
    }

    void printPosition(){
        System.out.printf("(%d, %d)\n", x,y);
    }

    void detectCollision () {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {

        Dragon d = new Dragon(2, 2, 0, 0);
        d.printPosition();
        d.moveRight();
        d.moveLeft();
    }
}
