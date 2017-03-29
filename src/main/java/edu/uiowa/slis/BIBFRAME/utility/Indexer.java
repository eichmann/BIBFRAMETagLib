package edu.uiowa.slis.BIBFRAME.utility;

import java.io.File;
import java.io.IOException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.LockObtainFailedException;

import edu.uiowa.slis.BIBFRAME.TagLibSupport;

public class Indexer {
    protected static Logger logger = Logger.getLogger(Indexer.class);
    static TagLibSupport theTag = new TagLibSupport();
    
    static String lucenePath = "/Volumes/LD4L/lucene/stanford/titles";
    static String prefix = 
	    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "
	    + " PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "
	    + " PREFIX foaf: <http://xmlns.com/foaf/0.1/> "
	    + " PREFIX mads: <http://www.loc.gov/mads/rdf/v1#> "
	    + " PREFIX bib: <http://bib.ld4l.org/ontology/> ";


    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws CorruptIndexException, LockObtainFailedException, IOException {
	PropertyConfigurator.configure("log4j.info");

	if (args.length > 0 && args[0].equals("work"))
	    lucenePath = "/Volumes/LD4L/lucene/" + "stanford" + "/" + args[0];
	if (args.length > 0 && args[0].equals("person"))
	    lucenePath = "/Volumes/LD4L/lucene/" + "stanford" + "/" + args[0];

	IndexWriter theWriter = new IndexWriter(FSDirectory.open(new File(lucenePath)), new StandardAnalyzer(org.apache.lucene.util.Version.LUCENE_30), true, IndexWriter.MaxFieldLength.UNLIMITED);
	
	if (args.length > 0 && args[0].equals("work"))
	    indexWorkTitles(theWriter);
	if (args.length > 0 && args[0].equals("person"))
	    indexPersons(theWriter);

	logger.info("optimizing index...");
	theWriter.optimize();
	theWriter.close();
    }
    
    static void indexWorkTitles(IndexWriter theWriter) throws CorruptIndexException, IOException {
	int count = 0;
	String query =
		"SELECT DISTINCT ?work ?title WHERE { "
		+ "?work rdf:type bib:Work . "
		+ "?work bib:hasTitle ?x . "
		+ "?x rdfs:label ?title . "
    		+ "} LIMIT 8000000";
	ResultSet rs = theTag.getResultSet(prefix + query);
	while (rs.hasNext()) {
	    QuerySolution sol = rs.nextSolution();
	    String work = sol.get("?work").toString();
	    String title = sol.get("?title").toString();
	    logger.debug("work: " + work + "\ttitle: " + title);
	    
	    Document theDocument = new Document();
	    theDocument.add(new Field("uri", work, Field.Store.YES, Field.Index.NOT_ANALYZED));
	    theDocument.add(new Field("title", title, Field.Store.YES, Field.Index.NOT_ANALYZED));
	    theDocument.add(new Field("content", title, Field.Store.NO, Field.Index.ANALYZED));
	    theWriter.addDocument(theDocument);
	    count++;
	    if (count % 10000 == 0)
		logger.info("count: " + count);
	}
	logger.info("total titles: " + count);
    }
    
    static void indexPersons(IndexWriter theWriter) throws CorruptIndexException, IOException {
	int count = 0;
	String query =
		"SELECT DISTINCT ?puri ?name WHERE { "
		+ "?uri rdf:type mads:Authority . "
		+ "?uri mads:identifiesRWO ?puri . "
		+ "?uri mads:authoritativeLabel ?name . "
		+ "?puri rdf:type foaf:Person . "
    		+ "} ";
	ResultSet rs = theTag.getResultSet(prefix + query);
	while (rs.hasNext()) {
	    QuerySolution sol = rs.nextSolution();
//	    String authorityURI = sol.get("?uri").toString();
	    String personURI = sol.get("?puri").toString();
	    String name = sol.get("?name").toString();
	    logger.debug("uri: " + personURI + "\tname: " + name);
	    
	    Document theDocument = new Document();
	    theDocument.add(new Field("uri", personURI, Field.Store.YES, Field.Index.NOT_ANALYZED));
	    theDocument.add(new Field("name", name, Field.Store.YES, Field.Index.NOT_ANALYZED));
	    theDocument.add(new Field("content", name, Field.Store.NO, Field.Index.ANALYZED));
	    theWriter.addDocument(theDocument);
	    count++;
	    if (count % 10000 == 0)
		logger.info("count: " + count);
	}
	logger.info("total titles: " + count);
    }

}
