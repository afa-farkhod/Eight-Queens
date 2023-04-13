# Eight-Queens
Solving the Eight Queens Problem using Backtracking

The eight queens puzzle is the problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other; thus, a solution requires that no two queens share the same row, column, or diagonal. There are 92 solutions. The problem was first posed in the mid-19th century. In the modern era, it is often used as an example problem for various computer programming techniques.

![image](https://user-images.githubusercontent.com/24220136/231668020-2f474fa6-ac7b-45f7-9417-cd592c4875a1.png)

This java program solves the Eight Queens problem using the backtracking approach. I used a common algorithm design technique called backtracking for solving this problem. The backtracking approach searches for a candidate solution incrementally, abandoning that option as soon as it determines that the candidate cannot possibly be a valid solution, and then looks for a new candidate. You can use a two-dimensional array to represent a chessboard. However, since each row can have only one queen, it is sufficient to use a one-dimensional array to denote the position of the queen in the row. 

![image](https://user-images.githubusercontent.com/24220136/231668815-0617c673-1d17-43ff-ac91-654dee9a78b3.png)

The search starts from the first row with k = 0, where k is the index of the current row being considered. The algorithm checks whether a queen can be possibly placed in the jth column in the row for j = 0, 1, c , 7, in this order. The search is implemented as follows:

 ■ If successful, it continues to search for a placement for a queen in the next row. If the current row is the last row, a solution is found.
 
 ■ If not successful, it backtracks to the previous row and continues to search for a new placement in the next column in the previous row.
 
 ■ If the algorithm backtracks to the first row and cannot find a new placement for a queen in this row, no solution can be found.
 
 After implementing the backtracking algorithm, successful demo:
 
![image](https://user-images.githubusercontent.com/24220136/231669546-0c014498-2523-449e-9960-573aa53ff02f.png)

The program invokes search() to search for a solution. Initially, no queens are placed in any rows. The search now starts from the first row with k = 0 and finds a place for the queen. If successful, place it in the row and consider the next row. If not successful, backtrack to the previous row. The findPosition(k) method searches for a possible position to place a queen in row
k starting from queen[k] + 1. It checks whether a queen can be placed at start, start + 1, . . . , and 7, in this order. If possible, return the column index; otherwise, return -1.
