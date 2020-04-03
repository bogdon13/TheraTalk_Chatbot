import java.util.List;


import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class sentimentalAnalysis {
	
	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipleine.getPipleine();
		
		String sampleString = "";
		
		CoreDocument coreDocument = new CoreDocument(sampleString);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> coreSentence = coreDocument.sentences();
		
		String sentiment = "";
		
		for(CoreSentence cs: coreSentence) {
			sentiment = cs.sentiment();
		}
		//System.out.println(sentiment);
		
		String positive = "positive";
		String negative = "negative";
		String neutral = "neutral";
		
		String [] positiveResponse = new String[] {"My response is based entirely on what you say.","I am a friendly robot. There is no need to be afraid of me.","Wow! That's a coincidence. We have something in common.","You and I are on the same wavelength."};
		String [] negativeResponse = new String[] {"Likewise, jerk","When I suck as bad as you, then I'll worry.","100,000 sperm and you were the fastest?", "You don't exactly make great conversation yourself.","Great. Another idiot to talk to."};
		String [] neutralResponse = new String[] {"Better get some rest.","Maybe you could exercise.","You are very astute."};
		
		
		int randomNumber = (int) (Math.random()*3);
		
		//System.out.println(randomNumber);
		
		if(sentiment.equalsIgnoreCase(positive)) {
			System.out.println(positiveResponse[randomNumber]);			
		}
		else if(sentiment.equalsIgnoreCase(positive)) {
			System.out.println(negativeResponse[randomNumber]);
		}
		else {
			System.out.println(neutralResponse[randomNumber]);
		}
		
	}
}
