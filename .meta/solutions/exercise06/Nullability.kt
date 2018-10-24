fun getSafeStringLength(string: String?): Int = Int.MAX_VALUE

class Employee(val name: String, val manager: Employee?)
fun getManagerName(employeet: Employee): String? = employee.manager?.name