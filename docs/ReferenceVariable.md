# Reference Variable

## [Declaring Reference Variable](https://chortle.ccsu.edu/java5/notes/chap09c/ch09C_11.html)

There are several ways to declare a reference variable:

`ClassName variableName;`

- This declares a reference variable and declares the class of the object it will later refer to. No object is created.

`ClassName variableName  =  new ClassName( parameter, parameter, ... );`

- This declares a reference variable and declares the class of the object. But now, at run time, a new object is constructed and a reference to that object is put in the variable. Sometimes parameters are needed when the object is constructed.

`ClassName variableNameOne, variableNameTwo;`

- This declares two reference variables, both potentially referring to objects of the same class. No objects are created. You can do this with more than two variables, if you want.

`ClassName variableNameOne  =  new ClassName( parameter, parameter, ... ), variableNameTwo  =  new ClassName( parameter, parameter, ... ) ;`

- This declares two reference variables. At run time, two objects are created and their references are assigned to the variables. Again, you can do this for more than two as long as you follow the pattern.
