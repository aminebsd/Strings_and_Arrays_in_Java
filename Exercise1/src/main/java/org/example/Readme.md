## Topic 

Write a Java program that stores student grades entered via the keyboard in an array named
grades, and allows the following operations to be performed:
1. Sort and display the list of grades.
2. Display the average grade.
3. Display the highest and lowest grades.
4. Display the number of students with a grade entered by the user.
   
NB: To sort the array, use Arrays.sort().

### Key Components :

This project leverages several fundamental Java features to ensure efficient data handling and user interaction:


#### 1. User Input Handling
* **`Scanner` Class**: Utilized from the `java.util` package to capture real-time user input via the standard input stream (`System.in`). It handles various data types, such as `nextInt()` for menu navigation and `nextFloat()` for decimal grade entries.

```java
    Scanner scanner = new Scanner(System.in);
```

#### 2. Dynamic Data Storage
* **`ArrayList<Float>`**: Unlike a standard array with a fixed size, the `ArrayList` provides a dynamic structure that grows as new grades are added.
* **Generics**: The use of `<Float>` ensures type safety, preventing non-numeric values from being stored in the grade list.

```java
    List<Float> grade_list = new ArrayList<>();
```

#### 3. Control Flow & Logic
* **`While` Loop**: Implements a continuous execution cycle, allowing the user to perform multiple operations without restarting the program.
  The loop continues until the user selects option 0 to quit.
* **`Switch-Case` Statement**: Provides a clean and readable way to route user choices to specific functionalities (Add, Sort, Average, etc.).


### Program Logic :

#### 1. Menu
At each iteration, the program displays the following options:

```java
    while (flag) {
    
        System.out.println("");
        System.out.println("");
        System.out.println(" 0- Quite the menu : ");
        System.out.println(" 1- Add new Student Grade : ");
        System.out.println(" 2- display sorted grade list : ");
        System.out.println(" 3- Display the average grade : ");
        System.out.println(" 4- Display the highest and lowest grades : ");
        System.out.println(" 5- Display the number of students with a grade entered by the user : ");
    
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
```

#### 2. Choice Processing Using Switch-Case

The `switch ` statement routes the user’s selection to the corresponding functionality:
```java
    switch (choice)
```
- **Case 0 – Exit Program**  
  Terminates the loop and ends the application gracefully.
```java
    case 0 :
        flag = false;
        System.out.println("Good Bye!");
        break;
```


- **Case 1 – Add Grade**  
  Prompts the user to enter a new grade and stores it in the grade list.
```java
    case 1 :
        System.out.println("Enter grade : ");
        float grade = scanner.nextFloat();
        grade_list.add(grade);
        break;
```


- **Case 2 – Sort & Display Grades**  
  Sorts the grade list in ascending order and displays it.
```java
    case 2 :
        grade_list.sort(null);
        System.out.println(grade_list);
        break;
```


- **Case 3 – Calculate Average**  
  Computes the average grade by summing all grades and dividing by the total number of students.
```java
    case 3 :
        float somme = 0;
        float average = 0;
        for(float g:grade_list){
            somme += g ;
            average = somme /  grade_list.size();
        }
        System.out.println(average);
        break;
```


- **Case 4 – Find Minimum & Maximum**  
  Iterates through the grade list to determine the lowest and highest grades.
```java
     case 4 :
        float min = grade_list.get(0);
        float max = grade_list.get(0);
        for (float g:grade_list){
            if (g < min){
                min = g;
            }
            else if (g > max){
                max = g;
            }
        }
        System.out.println("the minimum grade is : " + min);
        System.out.println("the maximum grade is : " + max);
        break;
```


- **Case 5 – Student Count**  
  Displays the total number of grades entered.
```java
    case 5 :
        System.out.println("total student number entered : " + grade_list.size());
        break;
```


- **Default Case – Invalid Input Handling**  
  Displays an error message when the user enters an invalid menu option.
```java
    default :
        System.out.println("Wrong choice : Enter a valid choice  ");
```

### Execution Steps

#### **Git Commands**

```shell
# Initialize git in your project
git init

# Clone a repository (if you want to get code from elsewhere)
git clone https://github.com/aminebsd/Strings_and_Arrays-_in_Java.git
```

#### **Step 0: Compile and Run**

```shell
# Compile your Java program

(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise1\src\main\java\org\example> javac Main.java
(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise1\src\main\java\org\example>
```
```shell
# Run your program 
(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise1\src\main\java\org\example> java Main.class
```

#### **Step 1: Program Initialization**
1. The program starts and displays the main menu.
2. The grade list (`ArrayList<Float>`) is initialized as empty.
3. A `Scanner` object is created to read user input.
```terminaloutput
 0- Quite the menu : 
 1- Add new Student Grade : 
 2- display sorted grade list : 
 3- Display the average grade : 
 4- Display the highest and lowest grades : 
 5- Display the number of students with a grade entered by the user : 
Enter your choice : 
```

#### **Step 2: Add Grades (Case 1)**
1. User enters `1` to add a grade.
2. Program prompts: `"Enter grade : "`
3. User inputs a numeric value (e.g., `17.5`).
4. Grade is added to `grade_list`.
5. Menu is displayed again.

```terminaloutput
Enter your choice : 1
Enter grade : 
17.5
```

#### **Step 3: Sort & Display Grades (Case 2)**
1. User enters `2`.
2. Program sorts `grade_list` in ascending order using `sort(null)`.
3. Displays the sorted list.

```terminaloutput
Enter your choice : 2
[12.0, 16.5, 17.5, 18.0, 19.5]
```

#### **Step 4: Calculate Average (Case 3)**
1. User enters `3`.
2. Program calculates sum of all grades.
3. Divides by `grade_list.size()`.
4. Displays the average.
```terminaloutput
Enter your choice : 3
16.7
```

#### **Step 5: Find Min & Max (Case 4)**
1. User enters `4`.
2. Program iterates through `grade_list`.
3. Finds and displays minimum and maximum values.

```terminaloutput
Enter your choice : 4
the minimum grade is : 12.0
the maximum grade is : 19.5
```

#### **Step 6: Display Student Count (Case 5)**
1. User enters `5`.
2. Program displays `grade_list.size()`.
```terminaloutput
Enter your choice : 5
total student number entered : 5
```
#### **Step 7: Exit Program (Case 0)**
1. User enters `0`.
2. `flag` is set to `false`.
3. Loop terminates.
```terminaloutput
Enter your choice : 0
Good Bye!
```




