/**
 * The calculator class contains methods to perform addition, subtraction, multiplication, and division
 * of two float numbers.
 */
public class calculator{
    //method to add two numbers
    /**
     * The function "add" takes two float numbers as input and returns their sum.
     * 
     * @param x The first parameter is x, which is a float data type.
     * @param y The parameter "y" is a float type variable.
     * @return The sum of x and y is being returned.
     */
    float add(float x,float y) 
    {   
        return (x + y); 
    }
    
    //method to subtract two numbers
    /**
     * The function "sub" subtracts two float numbers and returns the result.
     * 
     * @param x The first parameter is x, which is a float data type.
     * @param y The parameter "y" is a float type variable.
     * @return the result of subtracting y from x.
     */
    float sub(float x ,float y )
    {
        return( x -y) ;
    }
        
        //method to multiply two numbers
    /**
     * The function "mul" takes two float numbers as input and returns their product.
     * 
     * @param x The first parameter is x, which is a float data type.
     * @param y The parameter "y" is a float data type.
     * @return the product of the two input numbers, x and y.
     */
    float mul(float x ,float y )
    {
        return (x *y);
    }
    //Method to divide two numbers
    /**
     * The function div takes two float numbers as input and returns their division.
     * 
     * @param x The first parameter, x, is a float type variable.
     * @param y The parameter "y" is a float type variable.
     * @return the result of dividing the value of x by the value of y.
     */
    float div(float x ,float y )
    {
        return(x/y);
    }
        public static void main(String[] args)
        {
            float a=5;
            float b=3;
            calculator obj = new calculator();
             System.out.println("Sum of "+a+" and " +b+ " is : " +obj.add(a,b));
             System.out.println("\nDifference of "+a+" and " +b+ " is : " +obj.sub(a,b));
             System.out.println("\nProduct of "+a+" and " +b+ " is : " +obj.mul(a,b)+"\n");
             System.out.println("\nDivision of  "+a+" by "+b+" is : "+obj.div(a,b));
        }
}