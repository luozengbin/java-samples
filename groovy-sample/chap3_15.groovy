#!/usr/bin/env groovy

// Integer x
// x = 3             // Integer型代入
// x = "hello"       // org.codehaus.groovy.runtime.typehandling.GroovyCastException: Cannot cast object 'hello' with class 'java.lang.String' to class 'java.lang.Integer'

class MyClass {
    String toString()              // The return type of java.lang.Object toString() in MyClass is incompatible with java.lang.String in java.lang.Object
        {
            "MyClass"
        }
}

println new MyClass()           // --> MyClass
