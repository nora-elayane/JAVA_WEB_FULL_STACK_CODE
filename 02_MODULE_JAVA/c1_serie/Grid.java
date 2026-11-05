public class Grid{
    public static void main(String[] args){
        int[] place = {0 , 0} ;
        int[][] grid = {
                {0,0,0,1,0},
                {0,0,1,1,0},
                {0,0,0,1,0},
                {1,0,0,0,0},
                {1,0,1,0,0}} ;
        System.out.println(checkgrid(grid ,place));
                        }
    public static boolean checkgrid(int[][] grid , int[] place){
        if(place[0] == grid.length - 1 && place[1] == grid.length - 1 ){
            return true ;}
                    int[] left = null  ;
                    int[] up = null ;
                    int[] right = null ;
                    int[] down = null ;
                    boolean leftSafe = false ;
                    boolean upSafe = false ;
                    boolean rightSafe = false ;
                    boolean downSafe = false ;
                    int i = place[0] ;
                    int j = place[1] ;
                    grid[place[0]][place[1]] = 2 ;
                if(j-1 >= 0 ){
                    left = new int[]{i, j - 1};
                }
                if(i-1 >= 0){
                    up = new int[]{i - 1, j};
                }
                if(j+1 < grid[i].length){
                    right = new int[]{i , j+1} ;
                }
                if(i+1 < grid.length){
                    down = new int[]{i+1 , j} ;
                }
                if(left != null ){
                    if(grid[left[0]][left[1]] == 0){
                        leftSafe = true ;
                    }
                }
                if( up != null){
                    if(grid[up[0]][up[1]] == 0){
                        upSafe = true ;
                    }   }

                if(right != null ){
                    if(grid[right[0]][right[1]] == 0){
                        rightSafe = true ;
                    }
                }

                if(down != null ){
                    if(grid[down[0]][down[1]] == 0){
                        downSafe = true ;
                    }
                }
                if(downSafe){
                   if( checkgrid(grid , down)) { return true;}
                }
                if(rightSafe){
                    if(checkgrid(grid , right)) {return true ;}
                }
                if(upSafe){
                   if(checkgrid(grid , up)){return true ;}
                }
                if(leftSafe){
                   if(checkgrid(grid , left)){ return true ;}
                }
        grid[place[0]][place[1]] = 0 ;
        return false ;

    }
}