public class Field {
    public static final int EMPTY = 0;
    public static final int TRACE = 1;
    public static final int ROBOT = 2;

    private static final int DEFAULT_SIZE = 3;

    int[][] data;
    Robot robot;

    public  Field (){ this (DEFAULT_SIZE, DEFAULT_SIZE, new Robot(0, 0)); }

    public  Field (Robot r) {
        this(DEFAULT_SIZE, DEFAULT_SIZE, r);
    }

    public  Field (int width, int heidht, Robot r) {
        data = new int[width][heidht];
        robot = r;
        clearField();
  //      data[robott.getX()][robott.getY()] = ROBOT;
    }

    private void clearField () {
        for ( int i= 0; i < data.length; i++) {
            for (int j = 0; j< data[0].length; j++) {
                data [i][j] = EMPTY;

            }
        }
    }

    public void  display() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                switch (data[i][j]){
                    case EMPTY: {
                    System.out.print("_");
                    break;
                }
                    case TRACE: {
  //                      System.out.print(robott.getTrace());
                    }

                    }

            }

        }
    }

}
