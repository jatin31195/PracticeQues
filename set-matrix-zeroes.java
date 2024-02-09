//Optimal
class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                  if(j!=0)
                    matrix[0][j]=0;
                    else
                    col0=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]!=0)
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0)
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=0;
        }
        if(col0==0){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
        //.............................................................................................................
        //Better
        //
        // int k[]=new int[matrix[0].length];
        // int l[]=new int[matrix.length];
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(matrix[i][j]==0){
        //         k[j]=1;
        //         l[i]=1;}
        //     }
        // }
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(k[j]==1 || l[i]==1)
        //         matrix[i][j]=0;
        //     }
        // }

    //    Brute force
    //
    //    for(int i=0;i<matrix.length;i++){
    //        for(int j=0;j<matrix[i].length;j++){
    //            if(matrix[i][j]==0){
                   
    //            for(int m=0;m<matrix[i].length;m++){
    //            if(matrix[i][m]!=0){
    //             matrix[i][m]=-1234688;
    //             matrix[m][j]=-1234688;}
    //    } 
    //            }
    //        }
    //    }
    //    for(int i=0;i<matrix.length;i++){
    //        for(int j=0;j<matrix[i].length;j++){
    //            if(matrix[i][j]==-1234688 || matrix[i][j]==0)
    //            matrix[i][j]=0;
    //        }
    //    }
       
    }
}