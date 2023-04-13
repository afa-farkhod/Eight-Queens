# Eight-Queens
Solving the Eight Queens Problem using Backtracking

The eight queens puzzle is the problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other; thus, a solution requires that no two queens share the same row, column, or diagonal. There are 92 solutions. The problem was first posed in the mid-19th century. In the modern era, it is often used as an example problem for various computer programming techniques.

![image](https://user-images.githubusercontent.com/24220136/231668020-2f474fa6-ac7b-45f7-9417-cd592c4875a1.png)

This java program solves the Eight Queens problem using the backtracking approach. I used a common algorithm design technique called backtracking for solving this problem. The backtracking approach searches for a candidate solution incrementally, abandoning that option as soon as it determines that the candidate cannot possibly be a valid solution, and then looks for a new candidate. You can use a two-dimensional array to represent a chessboard. However, since each row can have only one queen, it is sufficient to use a one-dimensional array to denote the position of the queen in the row. 

![image](https://user-images.githubusercontent.com/24220136/231668815-0617c673-1d17-43ff-ac91-654dee9a78b3.png)
