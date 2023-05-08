package Students_Comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Student_Comparator {
	  public static void main(String[] args) {
		  
	        List<Student> studentList = new ArrayList<>();
	        studentList.add(new Student(1,"Aastha"));
	        studentList.add(new Student(1,"Anand"));
	        studentList.add(new Student(2,"Sunny"));
	        studentList.add(new Student(2,"Reema"));

	                                                     
	        Comparator<Student> byId = Comparator.comparing(Student::getId);
	        Comparator<Student> byName = Comparator.comparing(Student::getName);
	        studentList.sort(byId.thenComparing(byName));
	        for(Student p:studentList){
	            System.out.println(p.toString());
	        }
	    }
	}
	 class Student implements Comparator<Student> {
	    private int id;
	    private String name;

	     public int getId() {
	         return id;
	     }

	     public void setId(int id) {
	         this.id = id;
	     }

	     public String getName() {
	         return name;
	     }

	     public void setName(String name) {
	         this.name = name;
	     }

	     public Student(int id, String name) {
	         this.id = id;
	         this.name = name;
	     }

	     @Override
	     public String toString() {
	         return "Student{" + "id=" + id + ", name= " + name  + '}';
	     }

	     @Override
	    public int compare(Student p1, Student p2) {
	        int result = Integer.compare(p1.getId(), p2.getId());
	        if (result == 0) {
	            result = p1.getName().compareTo(p2.getName());
	        }
	        return result;
	    }
	}