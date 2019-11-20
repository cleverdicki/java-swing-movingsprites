package id.ac.its.dicki.game;

public class Asteroid extends Sprite {
    private final int ASTD = 400;
    public Asteroid(int x, int y) {
        super(x, y);
        initAsteroid();
    }

    private void initAsteroid() {
        loadImage("resources/asteroid.png");
        getImageDimensions();
    }

    public void move() {
        if (x < 0) {
            x = ASTD;
        }
        x -= 1;
    }
}
