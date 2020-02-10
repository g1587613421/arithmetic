/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.员工的重要性;

import java.util.HashMap;
import java.util.List;

public class Main {
    int imp=0;
    HashMap<Integer,Employee> data=new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        //寻找id对应的员工
        for (Employee employee1 : employees) {
          data.put(employee1.id, employee1);
        }
        plus(data.get(id));

        return imp;
    }
void plus(Employee employee){
     imp+=employee.importance;
     employee.importance=0;
    for (Integer subordinate : employee.subordinates) {
        plus(data.get(subordinate));

    }
}


}

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

