package Log4jcon.log;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	log.debug("hello");
    	log.info("hello");
    	log.warn("hello");
    	log.error("hello");
    	log.fatal("hello");
    	
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
