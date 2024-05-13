/*
 * Q 4. Write a Java program which creates only one object.
         If user attempts to create second object, he should not be able to create it.
        (Using user defined Exception).

 */

package Thrusday_Lab;

@SuppressWarnings("serial")
class Single_Object extends Exception {
    public Single_Object(String message) 
    {
        super(message);
    }
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
        try 
        {
        	Second_Object obj1 = Second_Object.getInstance();
            System.out.println("Object 1 created successfully.");

            // Uncommenting the next line will result in an exception
            Second_Object obj2 = Second_Object.getInstance();
        } 
        catch (Single_Object e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

class Second_Object {
    private static Second_Object instance;

    private Second_Object() 
    {
        // Private constructor to prevent instantiation outside of this class
    }

    public static Second_Object getInstance() throws Single_Object 
    {
        if (instance == null) 
        {
            instance = new Second_Object();
            return instance;
        } 
        else 
        {
            throw new Single_Object("Only one object can be created.");
        }
    }
}

