//class HelloWorld {
// static void main(args) {
//   println "Hello World456"
// }
//}

//repeat("Hello World", 2)
//repeat("Goodbye sunshine", 4)
//repeat("foo")
//    }

//}
def repeat(message, repeat = 5) {
    for (i in 1..repeat) {
        println message
    }
}

def range = 0..4
println range.class
assert range instanceof List

def coll = ["Groovy", "Java", "Ruby"]
println coll.class
assert  coll instanceof Collection
assert coll instanceof ArrayList

coll.add("Python")
coll << "Smalltalk"
coll[5] = "Perl"

println coll
println coll[4]
println coll[6]
println coll*.toUpperCase()

def numbers = [1,2,3,40]
println numbers - [2,3]
println numbers + 6
//assert numbers + 5 == [1,2,3,4,5]
//assert numbers - [2,3] == [1,4]

def numbers2 = [1,2,3,4]
println numbers2
println numbers2.join("+")
//assert numbers2.join(",") == "1,2,3,4"
//assert [1,2,3,4,3].count(3) == 2

def hashMap = [name:"Andy", "VPN-#":45]
println hashMap.name
println hashMap["VPN-#"]
hashMap.put("ip", "1:1:1:1")
hashMap["search"] = "baidu"
println hashMap
println hashMap.goTo
hashMap.yes = "OK!"
println hashMap.yes

hashMap.numbers2 = "numbers222"
println hashMap.numbers2

println "=========closure================"
hashMap.each{ key, value ->
    println "${key} : ${value}"
}
println "=========closure================"

println hashMap.getClass()

println "========================="
println "========================="
def acoll = ["Groovy", "Java", "Ruby"]

acoll.each {/* it ->*/
    if (it.equals("Groovy")) {
        println "$it is best language"
    } else {
        println "$it is just language"
    }
}
//Iterator iter = acoll.iterator()
//for(;iter.hasNext();){
//    println iter
//    iter.next()
//}

iter = acoll.iterator()
while (iter.hasNext()) {
    println iter.next()
}

//请记住，凡是集合或一系列的内容，都可以使用下面这样的代码进行迭代。
//【注】体会如下两个输出数据
"ITERATION".each{ // 遍历每一个字母
    print it.toLowerCase()
}

["Java", "ITERATION"].each{ // 遍历每一个 item
    println it.toLowerCase()
}

def excite = { word ->
    return "$word+-!"
}

println excite("Hello")
println excite.call("Hello")

def makeName(first, excite) {
    println "name: " + first + ", " + excite
}

makeName("Good", excite("morning"))