public class Path {

    public static void main(String[] args){
        int[][] input = {{},
                         {},
                         {},
                         {}
        };
        printCycle(input);
    }

    public static void printCycle(int[][] matrix){
        if(matrix == null || matrix.length < 4){
            System.out.println("No cycle length of 4 exists");
            return;
        }
        // For all conditions it cannot point to itself otherwise length != 4 for that path,
        // Furthurmore for this path they cannot point to any previous 1, otherwise
        // it would just be a shorter path.
        // Check if the vertex 1 points to vertex 2

        // Check if vertex 2 points to vertex 3

        // check if vertex 3 points to vertex 4

        //check if vertex 4 points to vertex 1
    }
}
