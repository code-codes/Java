// Write a Program to Insert Employee Objects into the TreeSet where DNSO is Based on
// Ascending Order of EmployeeId and
// Customized Sorting Order is Based on Alphabetical Order of Names:

import java.util.*;

class Employee implements Comparable {

    String name;
    int eid;

    Employee(String name, inteid) {
    this.name = name;
    this.eid = eid;
    }

    public String toString() {
        return name + "-----" + eid;
    }

    public int compareTo(Object obj) {
        int eid1 = this.eid;
        Employee e = (Employee) obj;
        int eid2 = e.eid;
        if (eid1 < eid2)
            return -1;
        else if (eid1 > eid2)
            return 1;
        else
            return 0;
    }
}

class LaunchComparator5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("sachin", 10);
        Employee e2 = new Employee("ponting", 14);
        Employee e3 = new Employee("lara", 9);
        Employee e4 = new Employee("flintoff", 17);
        Employee e5 = new Employee("anwar", 23);
        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);
        TreeSet t1 = new TreeSet(new MyComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}
