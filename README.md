# [Eight-Queens](https://en.wikipedia.org/wiki/Eight_queens_puzzle)
Solving the Eight Queens Problem using Backtracking

- The eight queens puzzle is the problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other; thus, a solution requires that no two queens share the same row, column, or diagonal. There are 92 solutions. The problem was first posed in the mid-19th century. In the modern era, it is often used as an example problem for various computer programming techniques.

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/231668020-2f474fa6-ac7b-45f7-9417-cd592c4875a1.png" alt="Image">
</p>

- This java program solves the Eight Queens problem using the backtracking approach. I used a common algorithm design technique called backtracking for solving this problem. The backtracking approach searches for a candidate solution incrementally, abandoning that option as soon as it determines that the candidate cannot possibly be a valid solution, and then looks for a new candidate. You can use a two-dimensional array to represent a chessboard. However, since each row can have only one queen, it is sufficient to use a one-dimensional array to denote the position of the queen in the row. 

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/231668815-0617c673-1d17-43ff-ac91-654dee9a78b3.png" alt="Image">
</p>

- The search starts from the first row with k = 0, where k is the index of the current row being considered. The algorithm checks whether a queen can be possibly placed in the jth column in the row for j = 0, 1, c , 7, in this order. The search is implemented as follows:

  - If successful, it continues to search for a placement for a queen in the next row. If the current row is the last row, a solution is found.
  - If not successful, it backtracks to the previous row and continues to search for a new placement in the next column in the previous row.
  - If the algorithm backtracks to the first row and cannot find a new placement for a queen in this row, no solution can be found.
 
- After implementing the backtracking algorithm, successful demo:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/231669546-0c014498-2523-449e-9960-573aa53ff02f.png" alt="Image">
</p>

- The program invokes search() to search for a solution. Initially, no queens are placed in any rows. The search now starts from the first row with k = 0 and finds a place for the queen. If successful, place it in the row and consider the next row. If not successful, backtrack to the previous row. The findPosition(k) method searches for a possible position to place a queen in row k starting from queen[k] + 1. It checks whether a queen can be placed at start, start + 1, . . . , and 7, in this order. If possible, return the column index; otherwise, return -1.

## [Implementation](https://github.com/af4092/Eight-Queens/blob/main/src/EightQueens.java)

- The `EightQueens class` extends the Application class, which is the main entry point for JavaFX applications.
- The SIZE constant is set to 8, representing the size of the chessboard.
- The queens array is initialized with -1 values to represent the positions of the queens on the chessboard. Each index in the array corresponds to a row, and the value at that index represents the column where the queen is placed.
- The start method is overridden, which is the entry point for the JavaFX application.
- The search method is called to find a solution for the Eight Queens puzzle using a `backtracking algorithm`. It iterates through each row and tries to find a valid position for the queen in that row.
- The `findPosition` method is used to find a valid column position for the queen in the given row. It checks if a position is valid by calling the `isValid` method.
- The `isValid` method checks if the given position (row, column) is valid by ensuring that no other queens threaten the current queen. It checks for conflicts in the same column, diagonal, and anti-diagonal.
- The chessboard is represented using a `GridPane`, and Label objects are added to each cell of the grid. The labels array is used to keep track of the labels.
- The chessboard is displayed using a Scene object with the appropriate dimensions based on the size of the chessboard.
- Images of queens are loaded using the Image class and set as the graphic for the labels representing the positions of the queens on the chessboard.
- The application window is created using a Stage object, and the scene is set to the stage. The stage is then displayed.
