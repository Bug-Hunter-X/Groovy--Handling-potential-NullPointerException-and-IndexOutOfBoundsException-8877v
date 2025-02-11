```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return "Null value"
        }
        // Some code that doesn't handle exceptions
        return param.toString().toUpperCase()
    }
}

// Example usage:
MyClass instance = new MyClass()
println instance.myMethod(null) // Output: Null value
println instance.myMethod(123)  // Output: 123
println instance.myMethod([1,2,3]) // Output: [1, 2, 3]
println instance.myMethod(null) //Output: Null value
println instance.myMethod([1,2,3].get(10)) // Throws an exception
```