#!/usr/bin/env groovy

// 整数、０以外が真
assert 1
assert !0

// 文字列、文字長さが０以外が真
assert "0"
assert !""

// 浮点小数(0.0)以外が真
assert 0.1
assert !0.0

// 空リスト以外が真
assert [1]
assert ![]

// 空マップ以外が真
assert [key:'value']
assert ![:]

assert "abcdefg" =~ /c.*f/
assert !("abcdefg" =~ /x.*z/)

Iterator iter = [1, 2, 3, 4, 5].iterator()

while(iter.hasNext()) 
{
    def n = iter.next()
    if (n == 5) {
        assert !iter            // 最後の要素なら、False
    } else {
        assert iter
    }
}


class Complex 
{
    double re
    double im
    boolean asBoolean() 
        {
            !(re == 0 && im == 0) // 両方が０の場合に限って偽
        }
}

assert !new Complex(im:0, re:0)
assert new Complex(im:1, re:0)
assert new Complex(im:0, re:1)
assert new Complex(im:1, re:1)
