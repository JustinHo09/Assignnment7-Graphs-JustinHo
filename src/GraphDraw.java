public class GraphDraw {

    public static void main(String[] args){
        String input = "ANT CUN BOG AMA DC TOL SAN";
        draw(input);
    }

    public static void draw(String s){
        if(s == null || s.equals("")){
            return;
        }

        // Find how many words there are by finding how many spaces there are
        int spaceCount=0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                spaceCount++;
            }
        }
        //O(n)
        // Fill array with each string separated by space
        int n = spaceCount+1;
        String[] verticies = new String[n];
        // Fill the verticies with the names and build the names
        // O(k^2) S(k)
        int index = 0;
        String current = "";
        for(int i=0; i< s.length();i++){
            if(s.charAt(i) != ' '){
                current += s.charAt(i);
            }else{
                verticies[index] = current;
                current = "";
                index++;
            }
        }
        verticies[index] = current;
        int left;
        int right;

        // O and S(n^2)
        int[][] adjMatrix = new int[n][n];

        // O(n)
        for( int i =0; i < n; i++){
            // calculate its left edge
            left = ((2*i)+2) % n;
            adjMatrix[i][left] = 1;
            // calculate its right edge
            right = ((2*i)+1) % n;
            adjMatrix[i][right] = 1;
        }

        //O(n)
        for(int i=0; i< n; i++){
            System.out.print("\t\t" + verticies[i]);
        }

        System.out.print("\n");
        // O(n^2)
        for(int i=0; i<n;i++){
            System.out.print(verticies[i]);
            for(int j=0;j<n;j++){
                System.out.print("\t\t"+adjMatrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
