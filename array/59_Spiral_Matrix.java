class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int loop = n / 2;
        int x = 0;
        int y = 0;
        int i = n-1;
        int j = 1;

        while(loop!=0){
            for(;y < i; y++,j++){
                res[x][y] = j;
            }

            for( ; x < i; x++,j++){
                res[x][y] = j;
            }

            for(; y>0; y--,j++){
                res[x][y] = j;
            }
            for(; x>0; x--,j++){
                res[x][y] = j;
            }

            loop--;
            x = x+1;
            y = y+1;

        }

         if (n % 2 == 1) {
            res[n/2][n/2] = j;
        }
        return res;
    }
}