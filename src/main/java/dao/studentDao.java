package dao;

import po.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studentDao {
    private static Map map = new HashMap();

    public static Map Initialization() {
        map.put("001", new student("li", "001", "m", "dsadas "));
        map.put("002", new student("shan", "002", "s", "dsadasdas"));
        map.put("003", new student("wo", "003", "s", "czxncm,zx"));
        map.put("004", new student("zhao", "004", "m", "ueoiwqueio"));
        return map;
    }
    public static void addstudent(student student){
        String number=student.getNumber();
        map.put(number,student);
    }

   public static student getstudetnt(String number) {
        student student = (student) map.get(number);
        return student;
    }
    public static void deletestudent(String number){
        map.remove(number);
    }
    public static Map getStudentList(){
        return map;
    }

}
