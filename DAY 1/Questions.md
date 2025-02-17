## <U>Questions</u>
1. What is a Variable ?<br>
Variables are containers for storing data values.<br><hr>
2. What is a DataType ?<br>
 A variable in Java must be a specified data type.<br>
 Data types are divided into two groups:<br>
    - Primitive data types - includes byte, short, int, long, float, double, boolean and char
    - Non-primitive data types - such as String, Arrays and Classes<br><hr>
3. What is TypeCasting ?<br>
    Type casting is when you assign a value of one primitive data type to another type.<br>
    There are two types of casting:
    - Widening Casting (automatically) - converting a smaller type to a larger type size <i>byte -> short -> char -> int -> long -> float -> double</i>
    - Narrowing Casting (manually) - converting a larger type to a smaller size type <i>double -> float -> long -> int -> char -> short -> byte</i><br><hr>
4. What is Decision Making Statements ?<br>

    <hr>
5. What is a Modifier ?<br>
    The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.<br>
    We divide modifiers into two groups:
    - Access Modifiers - controls the access level
    - Non-Access Modifiers - do not control access level, but provides other functionality<br>
    
    |Modifiers|Description|
    |---|---|
    public |The code is accessible for all classes|
    private	|The code is only accessible within the declared class|
    protected	|The code is accessible in the same package and subclasses|
    default |The code is only accessible in the same package. This is used when you don't specify a modifier|
    <br>
6. What is Looping Statements ?<br>
    Loops can execute a block of code as long as a specified condition is reached.<br>
    Loops are handy because they save time, reduce errors, and they make code more readable.<br>
    - <b>While</b> : The while loop loops through a block of code as long as a specified condition is true<br>
    - <b>Do While</b> : The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.<br>
    - <b>For</b> : When you know exactly how many times you want to loop through a block of code, use the for loop<br><hr>
7. What is jump Statements ( Break,Continue )<br>
   <b>Break</b> : The break statement can also be used to jump out of a loop.<br>
   <b>Continue</b> : The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.<br><hr>
8. What is Method ?<br>
    A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.<br>
    Why use methods? To reuse code: define the code once, and use it many times.<br>
    <b>Return Type</b> : If you want the method to return a value, you can use a primitive data type such as int, char, etc. instead of void, and use the return keyword inside the method<br>
    <b>Modifiers</b> :  Access modifiers helps to restrict the scope of a class, constructor, variable, method, or data member. It provides security, accessibility, etc. to the user depending upon the access modifier used with the element.<br>
    <b>Return Statements</b> : The return statement is used for returning a value when the execution of the block is completed.<br>
    <hr>
9. What is KeyWords ?<br>
     Keywords are the Reserved words in a programming language that are used for some internal process or represent some predefined actions. These words are therefore not allowed to use as variable names or objects.There are 67 Keywords in Java.<br><hr>
10. Difference Between Return Type & Return Statements.<br>
    A void return type means the method does not return a value. If a method has a non-void return type, then it must contain a return statement that specifies the value to return. The return type must match with the value in the return statement.<br><hr>
11. What is an Identifier ?<br>
    A void return type means the method does not return a value. If a method has a non-void return type, then it must contain a return statement that specifies the value to return. The return type must match with the value in the return statement.<br><u>Rules For Naming Java Identifiers</u> <br>
    There are certain rules for defining a valid Java identifier. These rules must be followed, otherwise, we get a compile-time error.
    - The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).
    - Identifiers should not start with digits([0-9]).
    - Java identifiers are case-sensitive.
    - There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.
    - Reserved Words can’t be used as an identifier.<br>
    <hr>
    

    
    