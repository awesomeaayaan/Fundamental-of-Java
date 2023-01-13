
package np.edu.bmc.Encapsulation;

public class programmers  extends Employee{
     int bonus=10000;
        public static void main(String[] args) {
            programmers pm = new programmers();
            System.out.println("the salary of the programmer is : "+pm.salary);
            System.out.println("the bonus of the programmer  is : "+ pm.bonus);
}
}
