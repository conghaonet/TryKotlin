# TryKotlin
## 运算符
* !!  
 表示当前对象不为空的情况下执行, 尽量避免使用!!，可以使用let函数代替。
## 关键字
* object 用于创建单例模式
* lazy 懒属性(延迟加载)
* when 用于判断 相当于java中的switch()语句
* let 默认当前这个对象作为闭包的it参数，返回值是函数里面最后一行，或者指定return
* apply 调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象
* with函数是一个单独的函数，并不是Kotlin中的extension，所以调用方式有点不一样，返回是最后一行，然后可以直接调用对象的方法，感觉像是let和apply的结合
```
fun testWith() {
    // fun <T, R> with(receiver: T, f: T.() -> R): R = receiver.f()
    with(ArrayList<String>()) {
        add("testWith")
        add("testWith")
        add("testWith")
        println("this = " + this)
    }.let { println(it) }
}
// 运行结果
// this = [testWith, testWith, testWith]
// kotlin.Unit
```
* constructor 用于标识(二级)构造函数
* open 与java中的final相反:它允许别的类继承这个类。默认情形下，kotlin 中所有的类都是 final ,用来表示他可以被集成
## Chapter 7.3
* 定义set，get方法，以集合下标方式访问元素  
 in运算符对应的函数是contains, 用...until.. 构建一个开区间，用in运算符检查对象是否属于这个区间。
