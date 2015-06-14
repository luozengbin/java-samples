#!/usr/bin/env groovy

class MyClass {
    def name
    String getName()
        {
            "[" + name + "]"
        }
    
}

MyClass c = new MyClass()
c.name = "ワカナ アキラ"
println c.name                  // [ワカナ アキラ]
