
## Topic 

Write a Java program that performs a set of operations on any character string entered from the
keyboard. This program consists of a menu with a choice of operations to perform. The
operations on this string are as follows:
    1. Enter: read a character string from the keyboard and store it in a variable.
    2. Display: display the entered string.
    3. Reverse: reverse the entered string.
    4. Number of words: count the number of words in the string. The character ‘ ’ (space) is
        considered the word separator. There may be several consecutive spaces in the string.
After each operation, the program returns to the menu after displaying the message: “Press any
key to return to the menu.”


### Key Components

#### 1. User Input Handling

* `Scanner` Class: Captures user input via System.in

* `nextLine()` Method: Reads complete string input

* `Integer.parseInt()`: Converts string input to integer for menu selection

```java
Scanner scanner = new Scanner(System.in);
int choice = Integer.parseInt(scanner.nextLine());
```

#### 2. Control Flow Logic 

* `while` Loop: Maintains continuous program execution until quit command

* `switch-case` Statement: Routes user choices to specific string operations

#### 3. String Manipulation Methods
   
* `length()`: Returns the total number of characters in the string

* `charAt()`: Accesses individual characters by index position

* Manual Reversal: Custom loop implementation for string reversal


### Program Logic 
#### 1. Menu System Structure
```java
while(!flag.equals("q")) {
    System.out.println(" ****************** Welcome ********************");
    System.out.println("1. Enter: read a character string from the keyboard.");
    System.out.println("2. Display: display the entered string.");
    System.out.println("3. Reverse: reverse the entered string.");
    System.out.println("4. Number of words: count");
    System.out.println("*********************************************** ");
    System.out.println("Enter your choice: ");
    int choice = Integer.parseInt(scanner.nextLine());
    
    switch(choice) {
        // Case implementations
    }
}
```

#### 2. Operation Implementations

##### **Case 1 – Enter String**
**Purpose:** Captures and stores a string from user input. The nextLine() method reads the complete line including spaces, unlike next() which stops at whitespace.
```java
    case 1 :
        System.out.println("Enter a string: ");
        input = scanner.nextLine();
        break;
```
---
##### **Case 2 – Display String**
**Purpose:** Shows the string currently stored in memory. This is useful for verifying what was previously entered before performing operations on it.
```java
    case 2:
        System.out.println(input);
        break;
```
---
##### **Case 3 – Reverse String**
**Purpose:** Creates and displays a reversed version of the stored string. The manual loop approach demonstrates basic string manipulation without using built-in reversal methods.
```java
    case 3 :
        String rev = "";
        for(int i = input.length()-1; i >= 0; i--){
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);
        break;
```
---
##### **Case 4 – Character Count**

```java
    case 4 :
        System.out.println(input.length());
        break;
```
---
##### **Default Case – Invalid Input Handling**
**Purpose:** Provides user feedback when an invalid menu option is selected. This prevents the program from silently ignoring incorrect inputs and helps guide users to valid choices.
```java
    default:
        System.out.println("Enter a valid choice");
        break;
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
(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise3\src\main\java\org\example> javac Main.java
```
```shell
# Run your program 
(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise3\src\main\java\org\example> java Main.class
```

#### **Step 1: Menu Display**
```terminaloutput
 ****************** Welcome ********************
1. Enter: read a character string from the keyboard. 
2. Display: display the entered string.
3. Reverse: reverse the entered string.
4. Number of words: count
*********************************************** 
Enter your choice: 
```
#### **Step 4: Switch Case Execution**

##### **Case 1 – Enter String**

- User sees: `Enter a string:`.
- User types: `Hello`.
- Result: `input = "Hello"`.
```shell
Enter your choice: 
1
Enter a string: 
hello
```
```terminaloutput
Press any key to return to the menu.
 Press 'q' to quit
```

---
##### **Case 2 – Display String**

```shell
Enter your choice: 
2
```
```terminaloutput
hello
Press any key to return to the menu.
 Press 'q' to quit 
```

---

##### **Case 3 – Reverse String**

**Process with `input = "Hello"`:**
1. Loop iterates from last character to first.
2. Builds `rev` character by character:
    - i=4: rev = "o"
    - i=3: rev = "ol"
    - i=2: rev = "oll"
    - i=1: rev = "olle"
    - i=0: rev = "olleH"

```shell
Enter your choice: 
3
```
```terminaloutput
olleh
Press any key to return to the menu.
 Press 'q' to quit 
```
---

##### **Case 4 – Number of Words**
```shell
Enter your choice: 
4
```
```terminaloutput
5
Press any key to return to the menu.
 Press 'q' to quit 
```

#### **Step 5: Program Termination**
```shell
Press any key to return to the menu.
 Press 'q' to quit 
q
```

```terminaloutput

Process finished with exit code 0
```





