public class Matrix{

  private int row,column;
  private int[][] matrix;

  public Matrix(int row,int column){
    this.row = row;
    this.column = column;
    this.matrix = new int[row][column];
  };

  public void initializeValues(int row,int column,int value){
    this.matrix[row][column] = value;
  };

  public int getElementAt(int row,int column){
    return this.matrix[row][column];
  };

  public boolean isOrderSame(Matrix matrix1){
    return (this.row == matrix1.row) && (this.column == matrix1.column);
  };

  public Matrix addMatrix( Matrix matrix){
    Matrix result = new Matrix(this.row,this.column);
    if(this.isOrderSame(matrix)){
      for(int i=0;i<this.row;i++){
        for(int j=0;j<this.column;j++){
            result.matrix[i][j] = this.getElementAt(i,j)+matrix.getElementAt(i,j);
        };
      };
      return result;
    }
    return null;
  };

  public void printMatrix(){
    for(int i = 0;i < this.row;i++){
      for(int j = 0;j < this.column;j++){
        System.out.println(this.matrix[i][j]);
      };
    };
  };
};
