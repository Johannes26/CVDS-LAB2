package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	   if(args.length==0){
        System.out.println( "Hello World!" );
	   }
         else{
			System.out.print("Hello");
			for(int x=0; x<args.length; x++){
				System.out.print(" "+args[x]);
			}
			System.out.print("!");
		
	   }	
    }
}
