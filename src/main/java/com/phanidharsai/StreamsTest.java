package com.phanidharsai;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {
        StreamsTest streamsTest = new StreamsTest();
        streamsTest.solution();
    }
 
    private void solution() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA",111,"D1",1000));
        employees.add(new Employee("BBB",222,null,2000));
        employees.add(new Employee("CCC",333,"D2",3000));
        employees.add(new Employee("DDD",444,"D3",4000));
        employees.add(new Employee("EEE",555,"D2",5000));
        employees.add(new Employee("FFF",666,"D2",6000));
 
        System.out.println(employees);
        //TODO print employee names belongs to dept "D2" -  using streams functions
        List<String> names = employees.stream().filter(s->s.getDeptno()!=null).filter(s->s.getDeptno().equals("D2")).map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);
 
        //TODO Print the sum of all employees salaries using streams -  expected to print 21000
        int sumOfSalary= employees.stream().map(s->s.getSalary()).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfSalary);
 
        //TODO Given a sentence find the word that has the highest length using Streams. expected to print "Welcome"
        String  input = " Welcome to Javaaaaaa world";
        String[] words = input.split(" ");
        String word = Arrays.stream(words).sorted((s1,s2)->Integer.compare(s2.length(),s1.length())).findFirst().get();
        String word1 = Arrays.stream(words).max(Comparator.comparingInt(a->a.length())).get();

        System.out.println(word1 +" phani");


        //TODO Should print most repeated number from the array, using streams or Java 7 features... 
        // number 5 repeated most of the (3)times, Should print 5 and not 3
        int numbers[] = {5, 7, 5, 7, 5, 2};
        List<Integer> list=Arrays.asList(5,7,5,7,7,7,5,2,2,2,2,2,5,5,5,5,5);
         int vamshiHighest= list.stream()
                 .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                 .entrySet().stream()
                 .max(Map.Entry.comparingByValue())
                 .map(Map.Entry::getKey).get();
         System.out.println(vamshiHighest+" vamshi");
        long highest = list.stream().distinct()
                .max(Comparator.comparingInt(a->Collections.frequency(list,a)))
                .orElse(0);

        List<Integer> numbers1 = Arrays.asList(1, 2, 1, 3, 2, 1, 3, 1, 4);

        long highestCount = numbers1.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .values()
                .stream()
                .mapToLong(Long::valueOf)
                .max()
                .orElse(0L);
        System.out.println(highestCount+" qwewere");
        HashMap<Integer,Integer> map =  new HashMap();
        int value=1;
        int maxFreq = 1;
        int maxValue=0;
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
                if(map.get(numbers[i])>maxFreq){
                    maxValue=numbers[i];
                }
            }
            else{
                map.put(numbers[i],value);
            }
        }
        System.out.println(map);
        System.out.println(maxValue);


        //Optional example
        if(employees==null){
            throw new RuntimeException();
        }else{
            processEmp(employees);
        }
 
    }
    private void processEmp(List<Employee> employees) {
    
    }
    private class Employee {
 
        private String name;
        private int id;
        private String deptno;
        private int salary;
        private List<String> addresses;
 
        public Employee(String name, int id, String deptno, int salary) {
            this.name = name;
            this.id = id;
            this.deptno = deptno;
            this.salary = salary;
        }
 
        @Override
        public String toString() {
            return name + "::" + id + "::" + deptno + "::" + salary;
        }
 
        public String getName() {
            return name;
        }
 
        public int getId() {
            return id;
        }
 
        public String getDeptno() {
            return deptno;
        }
 
        public int getSalary() {
            return salary;
        }
 
    }
}