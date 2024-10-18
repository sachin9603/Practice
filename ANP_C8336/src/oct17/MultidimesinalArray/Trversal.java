package oct17.MultidimesinalArray;

public class Trversal {
	
	public static void main(String[] args) {
		
		//spiral traversal
        int[][] matrix = {
                {1, 2, 3, 4,},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        
        int direction = 0;
        int top = 0;
        int left = 0;
        int down = matrix.length - 1;
        int right = matrix.length - 1;

        while (top <= down && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i]+ " ");
                }
               
                direction += 1;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++) {
                    System.out.print(matrix[i][right]+" ");
                }
                right -= 1;
                direction += 1;
            } else if (direction == 2) {
                for (int i = right; i >= top; i--) {
                    System.out.print(matrix[down][i]+" ");
                }
                down -= 1;
                direction += 1;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--) {
                    System.out.print(matrix[i][left] +" ");
                }
                left += 1;
                top += 1;
                direction = (direction + 1) % 4;
            }
        }
	}

}
