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

        Stack<Integer> vertecies = new Stack<>();
        boolean [] visited = new boolean[n];

        // Count how many nodes are visited, should be all
        int count=0;

        // Do a DFS traversal
        vertecies.push(0);
        visited[0] = true;
        count++;

        int v;
        while(!vertecies.isEmpty()){
            v = vertecies.pop();

            // Check each row and its mirror for a connection, which will add all adjacent
            // verticies for the vertex represented by the row of index v
            for(int i=0; i<n; i++){
                if(!visited[i] && (adjMatrix[v][i] == 1 || adjMatrix[i][v] == 1)){
                    count++;
                    visited[i] = true;
                    vertecies.push(i);
                }
            }
        }


        // If all nodes are visited its connected and at least weakly
        if(count == n){
            return true;
        }

        return false;
    }
}
