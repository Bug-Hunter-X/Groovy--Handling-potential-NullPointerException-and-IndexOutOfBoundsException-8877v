```groovy
class MyClass {
    def myMethod(param) {
        try {
            if (param == null) {
                return "Null value"
            } else if (param instanceof List && param.size() <= 0) {
                return "Empty List"
            } else if (param instanceof List) {
                int index = 10 // Example index
                if (index >= param.size() || index < 0) {
                    return "Index out of bounds"
                }
                return param.get(index).toString().toUpperCase()
            }
            return param.toString().toUpperCase()
        } catch (NullPointerException e) {
            return "NullPointerException caught: ${e.message}"
        } catch (IndexOutOfBoundsException e) {
            return "IndexOutOfBoundsException caught: ${e.message}"
        } catch (Exception e) {
            return "An unexpected error occurred: ${e.message}"
        }
    }
}

// Example usage:
MyClass instance = new MyClass()
println instance.myMethod(null)            // Output: Null value
println instance.myMethod(123)             // Output: 123
println instance.myMethod([1, 2, 3])     // Output: 2
println instance.myMethod([])              // Output: Empty List
println instance.myMethod([1,2,3].get(10)) // Output: Index out of bounds
```