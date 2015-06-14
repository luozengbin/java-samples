#!/usr/bin/env groovy

// GStringでメソッド名を指定する
class MyClass {
    def method1()
        {
            return "A"
        }

    def method2()
        {
            return "B"
        }
    def method3()
        {
            return "C"
        }
    
}

c = new MyClass()

i = 1; println c."method${i}"()
i = 2; println c."method${i}"()
i = 3; println c."method${i}"()
