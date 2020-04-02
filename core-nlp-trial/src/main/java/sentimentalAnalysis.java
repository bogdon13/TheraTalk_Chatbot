import java.util.List; 

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class sentimentalAnalysis {
	
	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipleine.getPipleine();
		
		String sampleString = "I hate pineapple on pizza.";
		
		CoreDocument coreDocument = new CoreDocument(sampleString);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> coreSentence = coreDocument.sentences();
		
		
		for(CoreSentence cs: coreSentence) {
			String sentiment = cs.sentiment();
			
			System.out.println(sentiment);
		}
	}
}
