
package np.edu.bmc.classnobject;

public class Student {
    int id;
    String name;
    int classLevel;
    String college;
    public Student(){
        System.out.println("Student is Created");
    }
    
    public Student(int id, String name, int classLevel,String college){
        this();
        this.id = id;
        this.name = name;
        this.classLevel = classLevel;
        this.college=college;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", classLevel=" + classLevel + ", college=" + college + '}';
    }

    

    
    
    public static void main(String[] args) {
      
        Student ram= new Student(1,"Ram",10,"bmc");
         Student shyam = new Student(2,"shyam",11,"bmc");
          Student sita= new Student(3,"sita",10,"bmc");
        System.out.println(ram);
        System.out.println(shyam);
        System.out.println(sita);
    }
    
    
}
