#!/usr/bin/env groovy

class MyClass    {

    static foo()
        {
            println this        // => MyClass
            println this.class  // => java.lang.Class
        }              
}

MyClass.foo()
