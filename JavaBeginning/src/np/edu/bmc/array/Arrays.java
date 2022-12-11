
package np.edu.bmc.array;

public class Arrays {
    public static void main(String[] args) {
        int num1[] = {1,2,3,4,5};//not recommended in java programming
        int []num2 = {11,2,3,4,5};//recommended in java programming
        System.out.println(num1[1]);
        System.out.println(num2[0]);
        String[] name= {"ram","shyam","Hari","ssita","gita"};
        System.out.println(name[1]);
        //modifying|replacing the array elements
        name[1]="aayaan";
        System.out.println(name[1]);
        
        String[] name1 = new String[5];
        name1[1]="rahul";
        
        for(int index=0;index<=name1.length;index++){
            System.out.println(name1[index]);  
            
       
        }
         for (int var: num1 ){
            System.out.println(var);
        }
          for (String var: name ){
            System.out.println(var);
        }
    }
    
}
