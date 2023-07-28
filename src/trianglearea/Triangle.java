package trianglearea;

public class Triangle {
    public int findEdgeOfATriangle(int side1, int side2) {
        int thirdEdge = (side1 + side2) - 1;
        if (side1 < 0 && side2 < 0) {
            return -1;
        } else if (side1 == 0 && side2 == 0) {
            return 0;
        } else {
            return thirdEdge;
        }
    }
}
