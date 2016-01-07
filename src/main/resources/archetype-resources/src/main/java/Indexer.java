package $discou;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.open.kmi.discou.DiscouIndexer;
import uk.ac.open.kmi.discou.vle.VLEIndexer;

/**
 * Hello world!
 *
 */
public class Indexer 
{
	private DiscouIndexer discouIndexer;
	private static final Logger log = LoggerFactory.getLogger(VLEIndexer.class);

	public Indexer(String indexHome, String spotlight) {
		discouIndexer = new DiscouIndexer(new File(indexHome), spotlight);
	}
	
	public Indexer(String indexHome) {
		discouIndexer = new DiscouIndexer(new File(indexHome));
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
