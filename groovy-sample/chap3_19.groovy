#!/usr/bin/env groovy

assert "abc" instanceof String
assert 'abc' instanceof String

// シングルクォートの場合変数評価しない
a = "ABC"
println "a = ${a}"              // a = ABC
println 'a = ${a}'              // a = ${a}

// トリプルクォートで文字列改行をそのまま出力する
println '''１行目
２行目
３行目'''

println """１行目
２行目
３行目"""

// スラッシュを用いた文字列リテラル
assert (/abc/ instanceof String)
assert (/abc/ == "abc")

a = "abc"
assert (/123 $a 456/ == "123 abc 456")

// バックスラッシュの扱い
