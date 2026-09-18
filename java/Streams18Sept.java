// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;

// class Employee {
//     int id;
//     String name;
//     int age;
//     String department;
//     double salary;

//     Employee(int id, String name, int age, String department, double salary) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//         this.department = department;
//         this.salary = salary;
//     }

//     @Override
//     public String toString() {
//         return id + " " + name + " " + age + " " + department + " " + salary;
//     }
// }
import java.util.*;
import java.util.stream.*;
class Employee {
    int id;
    String name;
    int age;
    String department;
    String city;
    String gender;
    double salary;

    Employee(int id, String name, int age, String department,
             String city, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.city = city;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " +
               department + " " + city + " " +
               gender + " " + salary;
    }
}
class Main {
        public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>(List.of(
    new Employee(1, "Aman", 25, "IT", "Delhi", "Male", 45000),
    new Employee(2, "Riya", 32, "HR", "Mumbai", "Female", 60000),
    new Employee(3, "Ankit", 35, "IT", "Delhi", "Male", 80000),
    new Employee(4, "Priya", 28, "Finance", "Pune", "Female", 55000),
    new Employee(5, "Arjun", 40, "IT", "Bangalore", "Male", 90000),
    new Employee(6, "Neha", 30, "HR", "Delhi", "Female", 40000),
    new Employee(7, "Rahul", 26, "IT", "Mumbai", "Male", 50000),
    new Employee(8, "Ananya", 33, "Finance", "Pune", "Female", 70000),

    new Employee(9, "Aman", 29, "IT", "Delhi", "Male", 65000),
    new Employee(10, "Simran", 31, "HR", "Mumbai", "Female", 55000),
    new Employee(11, "Karan", 27, "IT", "Bangalore", "Male", 70000),
    new Employee(12, "Pooja", 36, "Finance", "Delhi", "Female", 75000),
    new Employee(13, "Vikas", 42, "IT", "Delhi", "Male", 85000),
    new Employee(14, "Sneha", 24, "HR", "Pune", "Female", 45000),
    new Employee(15, "Raj", 38, "IT", "Mumbai", "Male", 60000),
    new Employee(16, "Aman", 30, "Finance", "Pune", "Male", 50000),
    new Employee(17, "Meera", 34, "IT", "Delhi", "Female", 65000),
    new Employee(18, "Rohan", 23, "HR", "Mumbai", "Male", 50000)
));
            
            Map<String,List<Employee>> result=new HashMap<>();
           for(Employee e:employees){
               result.computeIfAbsent(e.department,k->new ArrayList<>()).add(e);
           
        }
        //     System.out.print(result);
            // Map<String,Long> map=employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
            // System.out.print(map);
            // Map<String,Integer> result=new HashMap<>();
            // for(Employee e:employees){
            //     result.put(e.department,result.getOrDefault(e.department,0)+1);
            // }
            // System.out.print(result);
            // Map<String,Double> total=employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.summingDouble(e->e.salary)));
            // System.out.print(total);
            
            // Map<String,Double> total=new HashMap<>();
            // for(Employee e:employees){
            //     total.put(e.department,total.getOrDefault(e.department,0.0)+e.salary);
            // }
            // System.out.print(total);
            // Map<String,Double> result=employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.averagingDouble(e->e.salary)));
            // System.out.print(result);
            // Map<String,Double> total=new HashMap<>();
            // Map<String,Integer> count=new HashMap<>();
            // for(Employee e:employees){
            //     total.put(e.department,total.getOrDefault(e.department,0.0)+e.salary);
            //     count.put(e.department,count.getOrDefault(e.department,0)+1);
            // }
            // Map<String,Double> average=new HashMap<>();
            // for(String dept:total.keySet()){
            //     average.put(dept,total.get(dept)/count.get(dept));
            // }
            // System.out.print(average);
            // Map<String,Employee> result=employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingDouble(e->e.salary)),Optional::get)));
            // System.out.print(result);
            // Map<String,Employee> result=employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e->e.salary)),Optional::get)));
            // System.out.println(result);
            // Map<String,Employee> result=new HashMap<>();
            // for(Employee e:employees){
            //     if(!result.containsKey(e.department)||e.salary<result.get(e.department).salary){
            //         result.put(e.department,e);
            //     }
            // }
            // System.out.println(result);
    // Map<String,Employee> result=employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e->e.salary)),Optional::get)));
    //         System.out.println(result);
    // Map<String,Employee> map=new HashMap<>();
    // for(Employee e:employees){
    //   if(!map.containsKey(e.department)||e.salary>map.get(e.department).salary){
    //       map.put(e.department,e);
    //   }
    // }
    //  System.out.println(map);
//     public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>(List.of(
//     new Employee(1, "Aman", 25, "IT", 45000),
//     new Employee(2, "Riya", 32, "HR", 60000),
//     new Employee(3, "Ankit", 35, "IT", 80000),
//     new Employee(4, "Priya", 28, "Finance", 55000),
//     new Employee(5, "Arjun", 40, "IT", 90000),
//     new Employee(6, "Neha", 30, "HR", 40000),
//     new Employee(7, "Rahul", 26, "IT", 50000),
//     new Employee(8, "Ananya", 33, "Finance", 70000)
// ));
//         for(Employee e:employees){
//             if(e.salary>=40000&&e.salary<=80000){
//                 System.out.println(e);
//             }
//         }
        
        // double averageSalary=employees.stream().mapToDouble(e->e.salary).average().orElse(0);
        // System.out.print(averageSalary);
        // double total=0;
        // for(Employee e:employees){
        //     total+=e.salary;
        // }
        // double average=total/employees.size();
        // System.out.print(average);
        // long count=employees.stream().filter(e->e.department=="IT").count();
        // System.out.print(count);
        
        // int count=0;
        // for(Employee e:employees){
        //     if(e.department.equals("IT")){
        //         count++;
        //     }
        // }
        // System.out.print(count);
        // Employee highest=employees.stream().max(Comparator.comparingDouble(e->e.salary)).orElse(null);
        // System.out.print(highest);
        // Employee highest=employees.get(0);
        // for(Employee e:employees){
        //     if(e.salary>highest.salary){
        //         highest=e;
        //     }
        // }
        // System.out.print(highest);
        // employees.stream().sorted(Comparator.comparing(e->e.name)).forEach(System.out::println);
        
        // Collections.sort(employees,new Comparator<Employee>(){
        //     @Override
        //     public int compare(Employee e1,Employee e2){
        //         return e1.name.compareTo(e2.name);
        //     }
        // });
        // System.out.print(employees);
        // employees.stream().sorted(Comparator.comparingDouble(e->e.salary)).forEach(System.out::println);
        // Collections.sort(employees,new Comparator<Employee>(){
        //     @Override 
        //     public int compare(Employee e1,Employee e2){
        //         return Double.compare(e1.salary,e2.salary);
        //     }
        // });
        // System.out.println(employees);
        
        // employees.stream().filter(e->e.salary>50000).forEach(System.out::println);
        // for(Employee e:employees){
        //     if(e.salary>50000){
        //         System.out.println(e);
        //     }
        // }
        
    }
}