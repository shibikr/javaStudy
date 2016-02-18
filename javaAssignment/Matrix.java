public class Matrix{

  public int row,column;
  public int[][] matrix;

  public Matrix(int row,int column){
    this.row = row;
    this.column = column;
    this.matrix = new int[row][column];
  };

  public int[][] createMatrix(int[] values){
    int count = 0;
    for(int i = 0;i < this.row;i++){
      for(int j = 0;j < this.column;j++){
        matrix[i][j] = values[count];
        count++;
      };
    };
    return matrix;
  };

  public void printMatrix(){
    for(int i = 0;i < this.row;i++){
      for(int j = 0;j < this.column;j++){
        System.out.println(matrix[i][j]);
      };
    };
  };

};
