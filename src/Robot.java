public class Robot {
    private static final char DEFAULT_TRACE = '#';

    public enum Directions {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public static final int UP = 0;
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;

    int x;
    int y;
    int dir;
    char trace;

    public Robot (){
        x = DEFAULT_X;
        y = DEFAULT_Y;
        dir = UP;
        trace = DEFAULT_TRACE;
    }

    public Robot (int x, int y) {
        this.x = DEFAULT_X;
        this.y = DEFAULT_Y;
        dir = UP;
        trace = DEFAULT_TRACE;
    }

    public Robot (int x, int y, int dir) {
        this.x = DEFAULT_X;
        this.y = DEFAULT_Y;
        this.dir = UP;
        trace = DEFAULT_TRACE;
    }

    public Robot (int x, int y, int dir, char trace) {
        this.x = DEFAULT_X;
        this.y = DEFAULT_Y;
        this.dir = UP;
        this.trace = DEFAULT_TRACE;
    }
}
