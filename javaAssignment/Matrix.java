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

  private boolean isOrderSame(Matrix matrix1){
    return (this.row == matrix1.row) && (this.column == matrix1.column);
  };

  public Matrix addMatrix(Matrix matrix){
    Matrix result = new Matrix(this.row,this.column);
    if(this.isOrderSame(matrix)){
      for(int i=0;i<this.row;i++){
        for(int j=0;j<this.column;j++){
            result.initializeValues(i,j,this.getElementAt(i,j)+matrix.getElementAt(i,j));
        };
      };
      return result;
    }
    return null;
  };

  private boolean canBothMatrixMultiply(Matrix matrix){
    return (this.column == matrix.row);
  };

  public Matrix multiplyMatrix(Matrix matrix){
    Matrix result = new Matrix(this.row,matrix.column);
    int sum = 0;
    if(this.canBothMatrixMultiply(matrix)){
      for (int i = 0; i < this.row; i++) {
        for (int j = 0; j < matrix.column; j++) {
          for (int k = 0; k < matrix.row; k++) {
            sum = sum + (this.getElementAt(i,k)*matrix.getElementAt(k,j));
          }
          result.initializeValues(i,j,sum);
          sum = 0;
        }
      }
      return result;
    }
    return null;
  };

  private boolean isSquareMatrix(){
    return (this.row == this.column);
  };

  public int getDeterminant(){
    int determinant = 0;
    if(isSquareMatrix()){
      if(this.row == 1)
        return this.getElementAt(0,0);
      if(this.row == 2)
        return ((this.getElementAt(0,0)*this.getElementAt(1,1))
               -(this.getElementAt(0,1)*this.getElementAt(1,0)));
    }
    return determinant;
  };

};
