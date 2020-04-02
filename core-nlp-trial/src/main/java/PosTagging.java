import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class PosTagging {
	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipleine.getPipleine();
		
		String string = "Hey! This is Ryan and I live in Los Angeles.";
		
		CoreDocument coredocument = new CoreDocument(string);
		
		stanfordCoreNLP.annotate(coredocument);
		
		//System.out.println(coredocument.tokens());
		
		List<CoreLabel> corelabellist =  coredocument.tokens();		
				
		for(CoreLabel corelabel: corelabellist) {
			String position = corelabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
			System.out.println(corelabel.originalText() + " = " + position);
		}
	}
}
