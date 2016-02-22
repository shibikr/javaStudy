import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixTest{
  @Test
  public void initializeValues_and_getElementAt_Test() {
    Matrix m = new Matrix(2,3);
    int[] values = {1,2,3,4,5,6};
    int count = 0;
    for(int i = 0 ;i<2;i++){
      for(int j=0;j<3;j++){
        m.initializeValues(i,j,values[count]);
        count++;
      };
    };
    assertEquals(1, m.getElementAt(0,0));
    assertEquals(2, m.getElementAt(0,1));
    assertEquals(3, m.getElementAt(0,2));
    assertEquals(4, m.getElementAt(1,0));
    assertEquals(5, m.getElementAt(1,1));
    assertEquals(6, m.getElementAt(1,2));
  };

  @Test
  public void addMatrixTest_should_return_added_matrix_when_order_of_both_matrices_are_same(){
    Matrix m1 = new Matrix(2,2);
    Matrix m2 = new Matrix(2,2);
    int[] values1 = {1,2,3,4};
    int[] values2 = {1,2,3,4};
    int count1 = 0,count2 = 0;
    for(int i = 0 ;i<2;i++){
      for(int j=0;j<2;j++){
        m1.initializeValues(i,j,values1[count1]);
        count1++;
      };
    };
    for(int i = 0 ;i<2;i++){
      for(int j=0;j<2;j++){
        m2.initializeValues(i,j,values2[count2]);
        count2++;
      };
    };
    Matrix result = m1.addMatrix(m2);
    assertEquals(2, result.getElementAt(0,0));
  };

  @Test
  public void addMatrixTest_should_return_null_when_order_of_both_matrices_are_not_same(){
    Matrix m1 = new Matrix(2,2);
    Matrix m2 = new Matrix(2,3);
    int[] values1 = {1,2,3,4};
    int[] values2 = {1,2,3,4,5,6};
    int count1 = 0,count2 = 0;
    for(int i = 0 ;i<2;i++){
      for(int j=0;j<2;j++){
        m1.initializeValues(i,j,values1[count1]);
        count1++;
      };
    };
    for(int i = 0 ;i<2;i++){
      for(int j=0;j<3;j++){
        m2.initializeValues(i,j,values2[count2]);
        count2++;
      };
    };
    assertEquals(null, m1.addMatrix(m2));
  };

  @Test
  public void multiplyMatrix_should_give_multiplied_matrix(){
    Matrix m1 = new Matrix(3,3);
    Matrix m2 = new Matrix(3,3);
    int[] values = {1,2,3,4,5,6,7,8,9};
    int count = 0;
    for(int i = 0 ;i<3;i++){
      for(int j=0;j<3;j++){
        m1.initializeValues(i,j,values[count]);
        m2.initializeValues(i,j,values[count]);
        count++;
      };
    };
    Matrix result = m1.multiplyMatrix(m2);
    assertEquals(result.getElementAt(0,0),30);
    assertEquals(result.getElementAt(0,1),36);
    assertEquals(result.getElementAt(0,2),42);
    assertEquals(result.getElementAt(1,0),66);
    assertEquals(result.getElementAt(1,1),81);
    assertEquals(result.getElementAt(1,2),96);
    assertEquals(result.getElementAt(2,0),102);
    assertEquals(result.getElementAt(2,1),126);
    assertEquals(result.getElementAt(2,2),150);
  };

  @Test
  public void multiplyMatrix_should_give_null_if_matrices_can_not_be_multiplied(){
    Matrix m1 = new Matrix(3,2);
    Matrix m2 = new Matrix(3,3);
    assertEquals(null,m1.multiplyMatrix(m2));
  };

  @Test
  public void getDeterminant_should_return_0_if_matrix_is_not_square_matrix(){
    Matrix m = new Matrix(3,2);
    assertEquals(0,m.getDeterminant());
  };

  @Test
  public void getDeterminant_should_return_the_value_of_the_matrix_if_matrix_is_of_order_1x1(){
    Matrix m = new Matrix(1,1);
    m.initializeValues(0,0,5);
    assertEquals(5,m.getDeterminant());
  };

  @Test
  public void getDeterminant_should_return_the_determinant_of_a_2x2_matrix(){
    Matrix m = new Matrix(2,2);
    m.initializeValues(0,0,1);
    m.initializeValues(0,1,2);
    m.initializeValues(1,0,3);
    m.initializeValues(1,1,4);
    assertEquals(-2,m.getDeterminant());
  };

};
