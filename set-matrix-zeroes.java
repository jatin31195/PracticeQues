class Solution {
    public void setZeroes(int[][] matrix) {
        int k[]=new int[matrix[0].length];
        int l[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                k[j]=1;
                l[i]=1;}
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(k[j]==1 || l[i]==1)
                matrix[i][j]=0;
            }
        }
    //     int k=0;
    //     int l=0;
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