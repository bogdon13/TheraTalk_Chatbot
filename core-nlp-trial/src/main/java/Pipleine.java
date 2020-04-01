import java.util.*;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipleine {
	private static Properties properties;
	private static String propertiesName= "";
	private static StanfordCoreNLP stanfordCoreNLP;
	
	private Pipleine() {}
	
	static {
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	
	public static StanfordCoreNLP getPipleine() {
		if(stanfordCoreNLP == null) {
			stanfordCoreNLP = new StanfordCoreNLP(properties);
		}
		
		return stanfordCoreNLP;
	}
	
}
