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
  public void isOrderSame_gives_true_if_both_matrices_have_same_order(){
    Matrix m1 = new Matrix(2,2);
    Matrix m2 = new Matrix(2,2);
    boolean result = m1.isOrderSame(m2);
    assertEquals(true,result);
  };

  @Test
  public void isOrderSame_gives_false_if_both_matrices_dose_not_have_same_order(){
    Matrix m1 = new Matrix(2,2);
    Matrix m2 = new Matrix(2,3);
    boolean result = m1.isOrderSame(m2);
    assertEquals(false,result);
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
  }

};
