#!/usr/bin/env groovy

class SayHello 
{
    void sayHello()
        {
            println "Hello World"
        }
    
}

def foo = new SayHello()
foo.sayHello()
