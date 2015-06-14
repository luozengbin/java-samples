#!/usr/bin/env groovy

println "---06:名前付き引数---"

// 名前付き引数
def bar(Map param) 
{
    println param.name
    println param.age
    println param.gender
    println param.xxx
}

bar(name : "akira", age : 30, gender : "man")


println "---07:コンストラクタ---"

class MyClass 
{
    String name
    int age
    def dump()
        {
            println "name = ${name}"
            println "age  = ${age}"
        }
    
}

myClass = new MyClass(name : "akira", age : 30)
myClass.dump()


println "---08:コンストラクタ(ERROR)---"

class MyClass1 
{
    String name
    int age

    public MyClass1(String name)
        {
            println "init name...."
            this.name = name
        }
    
    
    def dump()
        {
            println "name = ${name}"
            println "age  = ${age}"
        }
    
}

myClass1 = new MyClass1(name : "akira", age : 30) // groovy.lang.GroovyRuntimeException: failed to invoke constructor: public MyClass1(java.lang.String) with arguments: [] reason: java.lang.IllegalArgumentException: wrong number of arguments
myClass1.dump()
