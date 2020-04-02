import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NamedEntityRecognition {

	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipleine.getPipleine();
		
		String sampleText = "I wish to go to Paris in my summer holidays but I am actually going to Brussels first.";
		
		CoreDocument coreDocument = new CoreDocument(sampleText);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreLabel> coreLabels = coreDocument.tokens();
		
		//System.out.println(coreLabels);
		
		for(CoreLabel cl: coreLabels) {
			String namedEntity = cl.get(CoreAnnotations.NamedEntityTagAnnotation.class);
			
			System.out.println(cl.originalText() + " = " + namedEntity);
			
		}
	}

}
