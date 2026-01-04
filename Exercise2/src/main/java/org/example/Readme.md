## Topic 
Write a program that reads a first group verb and displays its conjugation in the present tense in
the following form:
Entrez un verbe du premier groupe : chanter

* ➔ je chante
* ➔ tu chantes
* ➔ il/elle chante
* ➔ nous chantons
* ➔ vous chantez
* ➔ ils/elles chantant

NB : The program will check that the verb ends in er (in French) and assume that it is a regular verb.

### Key Components

#### 1. User Input Handling
- **`Scanner` Class**: Captures user input via `System.in`
- **`nextLine()` Method**: Reads complete verb input as a string

```java
Scanner scanner = new Scanner(System.in);
String verbe = scanner.nextLine();
```

#### 2. String Manipulation Methods

* `trim()`: Removes leading and trailing whitespace

* `toLowerCase()`: Converts input to lowercase for case-insensitive comparison
```java
    verbe = verbe.trim().toLowerCase();
```

* `endsWith("er")`: Checks if verb ends with "er" suffix
```java
    if(verbe.endsWith("er"){}
```

* `substring()`: Extracts the verb stem by removing "er" ending
```java
    verbe = verbe.substring(0,verbe.length()-2);
```

### Process

#### 1. Handling the Irregular Verb "aller"

```java
if (verbe.equals("aller")) {
    System.out.println("Je vais");
    System.out.println("Tu vas");
    System.out.println("Il/Elle  va");
    System.out.println("Nous allons");
    System.out.println("Vous allez");
    System.out.println("Ils/Elles vont");
}
```

**Explanation:**

- Checks if the input verb is **"aller"**, which is irregular.
- Prints the correct present tense conjugation directly.

---

#### 2. Conjugation of Regular First-Group Verbs (-er)

```java
else if (verbe.endsWith("er")) {
    verbe = verbe.substring(0, verbe.length() - 2);
    System.out.println("Je " + verbe + "e");
    System.out.println("Tu " + verbe + "es");
    System.out.println("Il/Elle " + verbe + "e");
    System.out.println("Nous " + verbe + "ons");
    System.out.println("Vous " + verbe + "ez");
    System.out.println("Ils/Elles " + verbe + "ent");
}
```

**Explanation:**

- Checks if the verb ends with `"er"` → indicates a **first-group verb**.
- `substring(0, verbe.length() - 2)` removes the `"er"` ending to get the **verb stem**.
- Concatenates the stem with appropriate endings for **present tense conjugation**:
    - je → e
    - tu → es
    - il/elle → e
    - nous → ons
    - vous → ez
    - ils/elles → ent

---

#### 3. Handling Invalid Input

```java
else {
    System.out.println("Le verbe entré n'est pas du premier groupe");
}
```

**Explanation:**

- Any verb that does not end in `"er"` and is not `"aller"` is considered invalid.
- The program prints an error message.

---

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
(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise2\src\main\java\org\example> javac Main.java
```
```shell
# Run your program 
(base) PS C:\Users\info\Desktop\StringsAndArraysInJava\Exercise2\src\main\java\org\example> java Main.class
```

#### 1. Enter a first-group verb: chanter

- User enters `chanter`
- Program detects it ends with `-er` → regular verb
- Verb stem = `chant`
- Program prints conjugation:

```shell
Entrez un verbe du premier groupe : 
chanter
```

```terminaloutput
je chante
tu chantes
il/elle chante
nous chantons
vous chantez
ils/elles chantent
```



#### 2. Enter a first-group verb: aller

- User enters `aller` → irregular verb
- Program prints the correct conjugation directly:

```shell
Entrez un verbe du premier groupe : 
aller
```
```terminaloutput
Je vais
Tu vas
Il/Elle  va
Nous allons
Vous allez
Ils/Elles vont
```

#### 3. Enter a invalid verb: finir

- User enters `finir` → does **not** end with `-er`
- Program prints an error message:

```shell
Entrez un verbe du premier groupe : 
finir
```

```terminaloutput
Le verbe entré n'est pas du premier groupe 
```