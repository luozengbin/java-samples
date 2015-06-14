#!/usr/bin/env groovy

// 引数オーバーロード定義されていいる場合、引数の動的な型によって実行時に決める
def hello(String s) 
{
    println "Hello(String)-> ${s}"
}

def hello(Integer i) 
{
    println "Hello(Integer)-> ${i}"
}

Object x = 3
Object y = "ABC"

hello(x) // Hello(Integer)-> 3
hello(y) // Hello(String)-> ABC
