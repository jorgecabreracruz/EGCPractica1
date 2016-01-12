package es.egc.app;
import org.apache.log4j.*; 

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log=Logger.getLogger(App.class); 
	
    public static void main( String[] args )
    {
		log.info("Returning a sample log msg");
        System.out.println( "Hello World!" );
    }
}
