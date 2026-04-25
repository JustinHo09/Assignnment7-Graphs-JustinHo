public class GraphDraw {

    public static void main(String[] args){
        String input = "ANT CUN BOG AMA DC TOL SAN";
        draw(input);
    }

    public static void draw(String s){
        if(s == null || s.equals("")){
            return;
        }

        // Fill array with each string separated by space
        String[] verticies = s.split(" ");
        int left;
        int right;

        int n = verticies.length;
        int[][] adjMatrix = new int[n][n];

        for( int i =0; i < n; i++){
            // calculate its left edge
            left = ((2*i)+2) % n;
            adjMatrix[i][left] = 1;
            // calculate its right edge
            right = ((2*i)+1) % n;
            adjMatrix[i][right] = 1;
        }


        for(int i=0; i< n; i++){
            System.out.print("\t\t" + verticies[i]);
        }

        System.out.print("\n");
        
        for(int i=0; i<n;i++){
            System.out.print(verticies[i]);
            for(int j=0;j<n;j++){
                System.out.print("\t\t"+adjMatrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
