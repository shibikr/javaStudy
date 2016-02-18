import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixTest{
  @Test
  public void createMatrixTest() {
    Matrix m = new Matrix(2,2);
    int[] values = {1,2,3,4};
    int[][] matrix = m.createMatrix(values);
    assertEquals(2,matrix[1].length);
    assertEquals(1, matrix[0][0]);
    assertEquals(2, matrix[0][1]);
    assertEquals(3, matrix[1][0]);
    assertEquals(4, matrix[1][1]);
  };
};
