import java.util.Stack;
public class Weakly {

    public static void main(String[] args){
        int [][] matrix = {{0,1,0},
                           {0,0,0},
                            {0,1,0}};
        System.out.println("Weakly Connected: "+ isWeakly(matrix));
    }

    public static boolean isWeakly(int [][] adjMatrix){

        int n = adjMatrix.length;
        if(n<=1){
            return true;
        }

        Stack<Integer> vertecies;
        boolean [] visited = new boolean[n];

        // Count how many nodes are visited, should be all
        int count=0;

        // Do a DFS traversal



        // If all nodes are visited its connected and at least weakly
        if(count == n){
            return true;
        }

        return false;
    }

    public static void traversal(int startIndex,int[][] adjMatrix, boolean[] visited){

    }
}
