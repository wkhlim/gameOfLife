# Game of Life 
Java Implementation of Conway's Game Of Life

## Summary
Given a 200*200 matrix and the coordinates of initial live cells, please implement a program to output the next 100
states according to Conway's Game of Life.

### Basic Rules
1. Any live cell with fewer than two live neighbours dies in the next generation as if caused by underpopulation.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies in the next generation, as if by overpopulation.
4. Any dead cell with exactly three live neighbours becomes a live cell in the next generation, as if by reproduction.

### Assumptions
The input string must be in the following format e.g. start and end with square bracket [] with 
multiple XY coordinates ([x,y]) and all the XY coordinates must be valid for a 200 x200 matrix:

"[[1,1]]"

"[[5, 5], [6, 5], [7, 5], [5, 6], [6, 6], [7, 6]]"

### Input
Input the coordinates of coordinates of initial live cells

### Output
Output the coordinates of initial live cells for the next 100 states.

Scenario 1
input:

[[1, 1]]

Output of the next 100 state:

[]

Scenario 2
input:

[[5, 5], [6, 5], [7, 5], [5, 6], [6, 6], [7, 6]]

output of the next 100 state:

1: [[5, 5], [6, 4] [7, 5], [5, 6], [6, 7], [7, 6]]

2: [[5, 5], [6, 4] [7, 5], [5, 6], [6, 7], [7, 6]]

3: [[5, 5], [6, 4] [7, 5], [5, 6], [6, 7], [7, 6]]
...


### Build and Execution

To build the application:
gradlew clean build

To run the application:
gradlew run 

To run the application with args :

gradlew run --args='"[[1, 1]]"'

gradlew run --args='"[[5, 5], [6, 5], [7, 5], [5, 6], [6, 6], [7, 6]]"'

