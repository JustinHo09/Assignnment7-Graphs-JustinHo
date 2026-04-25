public class Path {

    public static void main(String[] args){
        int[][] input = {{0,1,0,0},
                         {0,0,1,0},
                         {0,0,0,1},
                         {1,0,0,0}
        };
        printCycle(input);
    }

    public static void printCycle(int[][] matrix){
        if(matrix == null || matrix.length < 4){
            System.out.println("No cycle length of 4 exists");
            return;
        }
        int n  = matrix.length;
        // For all conditions it cannot point to itself otherwise length != 4 for that path,
        // Furthurmore for this path they cannot point to any previous 1, otherwise
        // it would just be a shorter path.
        for(int v1 = 0; v1 < n; v1++){
            for(int v2 = 0; v2 < n; v2++){
                // Check if the vertex 1 points to vertex 2
                if(v1 != v2 && matrix[v1][v2] != 0){
                    for(int v3 = 0; v3 < n; v3++){
                        // Check if vertex 2 points to vertex 3
                        if(v3 != v2 && v3!= v1 && matrix[v2][v3] != 0){
                            for(int v4 = 0; v4 < n; v4 ++){
                                // check if vertex 3 points to vertex 4
                                if(v4 != v3 &&  v4 != v2 && v4 != v1 && matrix[v3][v4] != 0){
                                    //check if vertex 4 points to vertex 1
                                    if(matrix[v4][v1] != 0){
                                        System.out.println("Cycle(vertice's index): " + v1 + " -> " + v2 +
                                                " -> " + v3 + " -> " + v4 + " -> " + v1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }





    }
}
