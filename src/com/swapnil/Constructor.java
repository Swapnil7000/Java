package src.com.swapnil;

class Cube {
    int length;
    int bredth;
    int height;

    public int getCubeVolume() {
        return length * bredth * height;
    }

    // Constructor to intialize length,bredth,height
    Cube() {
        length = 10;
        bredth = 20;
        height = 30;
    }

    // length,bredth,height is initialized by passing parameters
    Cube(int l, int b, int h) {
        length = l;
        bredth = b;
        height = h;
    }
}

class Constructor {
    public static void main(String[] args) {
        Cube c1 = new Cube();
        Cube c2 = new Cube(20, 20, 20);
        System.out.println("Volume of cube c1 is " + c1.getCubeVolume());
        System.out.println("Volume of cube c2 is " + c2.getCubeVolume());

    }
}