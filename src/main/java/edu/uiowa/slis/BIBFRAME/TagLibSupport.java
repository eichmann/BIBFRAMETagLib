package edu.uiowa.slis.BIBFRAME;

import javax.servlet.http.HttpServletRequest;

import java.util.Hashtable;
import java.util.Properties;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.Syntax;
import org.apache.jena.tdb.TDBFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uiowa.tagUtil.property.PropertyLoader;

@SuppressWarnings("serial")
public class TagLibSupport extends javax.servlet.jsp.tagext.TagSupport {
	private static final Log log = LogFactory.getLog(TagLibSupport.class);
	static protected String prefix = 
		"PREFIX ld4l: <http://bib.ld4l.org/ontology/>"
			+ "PREFIX ld4lcornell: <http://draft.ld4l.org/cornell/>"
			+ "PREFIX madsrdf: <http://www.loc.gov/mads/rdf/v1#>"
			+ "PREFIX oa: <http://www.w3.org/ns/oa#>"
			+ "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
			+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
			+ "PREFIX void: <http://rdfs.org/ns/void#>"
			+ "PREFIX worldcat: <http://www.worldcat.org/oclc/>"
			+ "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>";
	static Hashtable<String, String> classNameHash = new Hashtable<String, String>();
	static Hashtable<String, String> classLocalNameHash = new Hashtable<String, String>();

	static {
		classNameHash.put("http://bib.ld4l.org/ontology/Issn", "Issn");
		classNameHash.put("http://bib.ld4l.org/ontology/LegalDepositNumber", "LegalDepositNumber");
		classNameHash.put("http://schema.org/Event", "Event");
		classNameHash.put("http://bib.ld4l.org/ontology/Conference", "Conference");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#RWO", "RWO");
		classNameHash.put("http://bib.ld4l.org/ontology/Provision", "Provision");
		classNameHash.put("http://xmlns.com/foaf/0.1/Person", "Person");
		classNameHash.put("http://bib.ld4l.org/ontology/Cartography", "Cartography");
		classNameHash.put("http://www.w3.org/2000/01/rdf-schema#Class", "Class");
		classNameHash.put("http://bib.ld4l.org/ontology/MovingImage", "MovingImage");
		classNameHash.put("http://bib.ld4l.org/ontology/Fingerprint", "Fingerprint");
		classNameHash.put("http://bib.ld4l.org/ontology/NotatedMovement", "NotatedMovement");
		classNameHash.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#List", "List");
		classNameHash.put("http://bib.ld4l.org/ontology/IntegratingResource", "IntegratingResource");
		classNameHash.put("http://bib.ld4l.org/ontology/PublisherNumber", "PublisherNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/NlmShelfMark", "NlmShelfMark");
		classNameHash.put("http://bib.ld4l.org/ontology/Lccn", "Lccn");
		classNameHash.put("http://bib.ld4l.org/ontology/IssnL", "IssnL");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#Language", "Language");
		classNameHash.put("http://bib.ld4l.org/ontology/Sici", "Sici");
		classNameHash.put("http://www.w3.org/2002/07/owl#NamedIndividual", "NamedIndividual");
		classNameHash.put("http://bib.ld4l.org/ontology/Isrc", "Isrc");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#Title", "Title");
		classNameHash.put("http://bib.ld4l.org/ontology/MatrixNumber", "MatrixNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Item", "Item");
		classNameHash.put("http://bib.ld4l.org/ontology/AbbreviatedTitle", "AbbreviatedTitle");
		classNameHash.put("http://www.w3.org/2002/07/owl#ObjectProperty", "ObjectProperty");
		classNameHash.put("http://www.w3.org/2011/content#ContentAsText", "ContentAsText");
		classNameHash.put("http://www.w3.org/ns/prov#Location", "Location");
		classNameHash.put("http://bib.ld4l.org/ontology/StillImage", "StillImage");
		classNameHash.put("http://www.w3.org/TR/owl-time/TemporalEntity", "TemporalEntity");
		classNameHash.put("http://bib.ld4l.org/ontology/StudyNumber", "StudyNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/ContinuingResource", "ContinuingResource");
		classNameHash.put("http://bib.ld4l.org/ontology/DdcShelfMark", "DdcShelfMark");
		classNameHash.put("http://bib.ld4l.org/ontology/Identifier", "Identifier");
		classNameHash.put("http://www.w3.org/2002/07/owl#OntologyProperty", "OntologyProperty");
		classNameHash.put("http://www.w3.org/2000/01/rdf-schema#Datatype", "Datatype");
		classNameHash.put("http://bib.ld4l.org/ontology/ShelfMark", "ShelfMark");
		classNameHash.put("http://vivoweb.org/ontology/core#Meeting", "Meeting");
		classNameHash.put("http://bib.ld4l.org/ontology/Strn", "Strn");
		classNameHash.put("http://bib.ld4l.org/ontology/UdcShelfMark", "UdcShelfMark");
		classNameHash.put("http://bib.ld4l.org/ontology/VideoRecordingNumber", "VideoRecordingNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Nbn", "Nbn");
		classNameHash.put("http://bib.ld4l.org/ontology/MusicPlateNumber", "MusicPlateNumber");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Concept", "Concept");
		classNameHash.put("http://www.w3.org/ns/oa#Motivation", "Motivation");
		classNameHash.put("http://bib.ld4l.org/ontology/Manuscript", "Manuscript");
		classNameHash.put("http://www.w3.org/2002/07/owl#AnnotationProperty", "AnnotationProperty");
		classNameHash.put("http://xmlns.com/foaf/0.1/Organization", "Organization");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#PartNumberElement", "PartNumberElement");
		classNameHash.put("http://bib.ld4l.org/ontology/ManufacturerProvision", "ManufacturerProvision");
		classNameHash.put("http://xmlns.com/foaf/0.1/Agent", "Agent");
		classNameHash.put("http://www.w3.org/ns/oa#Annotation", "Annotation");
		classNameHash.put("http://bib.ld4l.org/ontology/ComposerContribution", "ComposerContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/IssueNumber", "IssueNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/TechnicalReportNumber", "TechnicalReportNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Contribution", "Contribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Dataset", "Dataset");
		classNameHash.put("http://bib.ld4l.org/ontology/ConductorContribution", "ConductorContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Collection", "Collection");
		classNameHash.put("http://bib.ld4l.org/ontology/NarratorContribution", "NarratorContribution");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#NonSortElement", "NonSortElement");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#SubTitleElement", "SubTitleElement");
		classNameHash.put("http://www.w3.org/2011/content#Content", "Content");
		classNameHash.put("http://bib.ld4l.org/ontology/Instance", "Instance");
		classNameHash.put("http://bib.ld4l.org/ontology/ThreeDimensionalObject", "ThreeDimensionalObject");
		classNameHash.put("http://www.lingvoj.org/ontology#Lingvo", "Lingvo");
		classNameHash.put("http://bib.ld4l.org/ontology/Nban", "Nban");
		classNameHash.put("http://www.w3.org/2002/07/owl#SymmetricProperty", "SymmetricProperty");
		classNameHash.put("http://bib.ld4l.org/ontology/StockNumber", "StockNumber");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#Authority", "Authority");
		classNameHash.put("http://bib.ld4l.org/ontology/KeyTitle", "KeyTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/Doi", "Doi");
		classNameHash.put("http://bib.ld4l.org/ontology/NotatedMusic", "NotatedMusic");
		classNameHash.put("http://bib.ld4l.org/ontology/Electronic", "Electronic");
		classNameHash.put("http://bib.ld4l.org/ontology/Multimedia", "Multimedia");
		classNameHash.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property", "Property");
		classNameHash.put("http://bib.ld4l.org/ontology/Tactile", "Tactile");
		classNameHash.put("http://bib.ld4l.org/ontology/Work", "Work");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#PartNameElement", "PartNameElement");
		classNameHash.put("http://www.w3.org/2002/07/owl#FunctionalProperty", "FunctionalProperty");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#ConceptScheme", "ConceptScheme");
		classNameHash.put("http://bib.ld4l.org/ontology/DistributorProvision", "DistributorProvision");
		classNameHash.put("http://www.w3.org/2000/01/rdf-schema#Resource", "Resource");
		classNameHash.put("http://bib.ld4l.org/ontology/Isbn", "Isbn");
		classNameHash.put("http://bib.ld4l.org/ontology/PerformerContribution", "PerformerContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/OclcIdentifier", "OclcIdentifier");
		classNameHash.put("http://bib.ld4l.org/ontology/Family", "Family");
		classNameHash.put("http://bib.ld4l.org/ontology/Topic", "Topic");
		classNameHash.put("http://bib.ld4l.org/ontology/AuthorContribution", "AuthorContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/SourceStatus", "SourceStatus");
		classNameHash.put("http://www.w3.org/2002/07/owl#Restriction", "Restriction");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#MainTitleElement", "MainTitleElement");
		classNameHash.put("http://bib.ld4l.org/ontology/Audio", "Audio");
		classNameHash.put("http://bib.ld4l.org/ontology/Classification", "Classification");
		classNameHash.put("http://bib.ld4l.org/ontology/Ean", "Ean");
		classNameHash.put("http://www.w3.org/2002/07/owl#InverseFunctionalProperty", "InverseFunctionalProperty");
		classNameHash.put("http://bib.ld4l.org/ontology/Monograph", "Monograph");
		classNameHash.put("http://bib.ld4l.org/ontology/LcOverseasAcqNumber", "LcOverseasAcqNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/MusicPublisherNumber", "MusicPublisherNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Text", "Text");
		classNameHash.put("http://bib.ld4l.org/ontology/LccShelfMark", "LccShelfMark");
		classNameHash.put("http://bib.ld4l.org/ontology/PostalRegistrationNumber", "PostalRegistrationNumber");
		classNameHash.put("http://www.w3.org/2002/07/owl#Thing", "Thing");
		classNameHash.put("http://bib.ld4l.org/ontology/FiniteResource", "FiniteResource");
		classNameHash.put("http://bib.ld4l.org/ontology/Serial", "Serial");
		classNameHash.put("http://www.w3.org/2002/07/owl#DatatypeProperty", "DatatypeProperty");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#TitleElement", "TitleElement");
		classNameHash.put("http://www.w3.org/2002/07/owl#Ontology", "Ontology");
		classNameHash.put("http://bib.ld4l.org/ontology/CreatorContribution", "CreatorContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Coden", "Coden");
		classNameHash.put("http://bib.ld4l.org/ontology/EditorContribution", "EditorContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Ismn", "Ismn");
		classNameHash.put("http://bib.ld4l.org/ontology/Upc", "Upc");
		classNameHash.put("http://bib.ld4l.org/ontology/PublisherProvision", "PublisherProvision");
		classNameHash.put("http://purl.org/dc/terms/LinguisticSystem", "LinguisticSystem");

		classLocalNameHash.put("Issn", "http://bib.ld4l.org/ontology/Issn");
		classLocalNameHash.put("LegalDepositNumber", "http://bib.ld4l.org/ontology/LegalDepositNumber");
		classLocalNameHash.put("Event", "http://schema.org/Event");
		classLocalNameHash.put("Conference", "http://bib.ld4l.org/ontology/Conference");
		classLocalNameHash.put("RWO", "http://www.loc.gov/mads/rdf/v1#RWO");
		classLocalNameHash.put("Provision", "http://bib.ld4l.org/ontology/Provision");
		classLocalNameHash.put("Person", "http://xmlns.com/foaf/0.1/Person");
		classLocalNameHash.put("Cartography", "http://bib.ld4l.org/ontology/Cartography");
		classLocalNameHash.put("Class", "http://www.w3.org/2000/01/rdf-schema#Class");
		classLocalNameHash.put("MovingImage", "http://bib.ld4l.org/ontology/MovingImage");
		classLocalNameHash.put("Fingerprint", "http://bib.ld4l.org/ontology/Fingerprint");
		classLocalNameHash.put("NotatedMovement", "http://bib.ld4l.org/ontology/NotatedMovement");
		classLocalNameHash.put("List", "http://www.w3.org/1999/02/22-rdf-syntax-ns#List");
		classLocalNameHash.put("IntegratingResource", "http://bib.ld4l.org/ontology/IntegratingResource");
		classLocalNameHash.put("PublisherNumber", "http://bib.ld4l.org/ontology/PublisherNumber");
		classLocalNameHash.put("NlmShelfMark", "http://bib.ld4l.org/ontology/NlmShelfMark");
		classLocalNameHash.put("Lccn", "http://bib.ld4l.org/ontology/Lccn");
		classLocalNameHash.put("IssnL", "http://bib.ld4l.org/ontology/IssnL");
		classLocalNameHash.put("Language", "http://www.loc.gov/mads/rdf/v1#Language");
		classLocalNameHash.put("Sici", "http://bib.ld4l.org/ontology/Sici");
		classLocalNameHash.put("NamedIndividual", "http://www.w3.org/2002/07/owl#NamedIndividual");
		classLocalNameHash.put("Isrc", "http://bib.ld4l.org/ontology/Isrc");
		classLocalNameHash.put("Title", "http://www.loc.gov/mads/rdf/v1#Title");
		classLocalNameHash.put("MatrixNumber", "http://bib.ld4l.org/ontology/MatrixNumber");
		classLocalNameHash.put("Item", "http://bib.ld4l.org/ontology/Item");
		classLocalNameHash.put("AbbreviatedTitle", "http://bib.ld4l.org/ontology/AbbreviatedTitle");
		classLocalNameHash.put("ObjectProperty", "http://www.w3.org/2002/07/owl#ObjectProperty");
		classLocalNameHash.put("ContentAsText", "http://www.w3.org/2011/content#ContentAsText");
		classLocalNameHash.put("Location", "http://www.w3.org/ns/prov#Location");
		classLocalNameHash.put("StillImage", "http://bib.ld4l.org/ontology/StillImage");
		classLocalNameHash.put("TemporalEntity", "http://www.w3.org/TR/owl-time/TemporalEntity");
		classLocalNameHash.put("StudyNumber", "http://bib.ld4l.org/ontology/StudyNumber");
		classLocalNameHash.put("ContinuingResource", "http://bib.ld4l.org/ontology/ContinuingResource");
		classLocalNameHash.put("DdcShelfMark", "http://bib.ld4l.org/ontology/DdcShelfMark");
		classLocalNameHash.put("Identifier", "http://bib.ld4l.org/ontology/Identifier");
		classLocalNameHash.put("OntologyProperty", "http://www.w3.org/2002/07/owl#OntologyProperty");
		classLocalNameHash.put("Datatype", "http://www.w3.org/2000/01/rdf-schema#Datatype");
		classLocalNameHash.put("ShelfMark", "http://bib.ld4l.org/ontology/ShelfMark");
		classLocalNameHash.put("Meeting", "http://vivoweb.org/ontology/core#Meeting");
		classLocalNameHash.put("Strn", "http://bib.ld4l.org/ontology/Strn");
		classLocalNameHash.put("UdcShelfMark", "http://bib.ld4l.org/ontology/UdcShelfMark");
		classLocalNameHash.put("VideoRecordingNumber", "http://bib.ld4l.org/ontology/VideoRecordingNumber");
		classLocalNameHash.put("Nbn", "http://bib.ld4l.org/ontology/Nbn");
		classLocalNameHash.put("MusicPlateNumber", "http://bib.ld4l.org/ontology/MusicPlateNumber");
		classLocalNameHash.put("Concept", "http://www.w3.org/2004/02/skos/core#Concept");
		classLocalNameHash.put("Motivation", "http://www.w3.org/ns/oa#Motivation");
		classLocalNameHash.put("Manuscript", "http://bib.ld4l.org/ontology/Manuscript");
		classLocalNameHash.put("AnnotationProperty", "http://www.w3.org/2002/07/owl#AnnotationProperty");
		classLocalNameHash.put("Organization", "http://xmlns.com/foaf/0.1/Organization");
		classLocalNameHash.put("PartNumberElement", "http://www.loc.gov/mads/rdf/v1#PartNumberElement");
		classLocalNameHash.put("ManufacturerProvision", "http://bib.ld4l.org/ontology/ManufacturerProvision");
		classLocalNameHash.put("Agent", "http://xmlns.com/foaf/0.1/Agent");
		classLocalNameHash.put("Annotation", "http://www.w3.org/ns/oa#Annotation");
		classLocalNameHash.put("ComposerContribution", "http://bib.ld4l.org/ontology/ComposerContribution");
		classLocalNameHash.put("IssueNumber", "http://bib.ld4l.org/ontology/IssueNumber");
		classLocalNameHash.put("TechnicalReportNumber", "http://bib.ld4l.org/ontology/TechnicalReportNumber");
		classLocalNameHash.put("Contribution", "http://bib.ld4l.org/ontology/Contribution");
		classLocalNameHash.put("Dataset", "http://bib.ld4l.org/ontology/Dataset");
		classLocalNameHash.put("ConductorContribution", "http://bib.ld4l.org/ontology/ConductorContribution");
		classLocalNameHash.put("Collection", "http://bib.ld4l.org/ontology/Collection");
		classLocalNameHash.put("NarratorContribution", "http://bib.ld4l.org/ontology/NarratorContribution");
		classLocalNameHash.put("NonSortElement", "http://www.loc.gov/mads/rdf/v1#NonSortElement");
		classLocalNameHash.put("SubTitleElement", "http://www.loc.gov/mads/rdf/v1#SubTitleElement");
		classLocalNameHash.put("Content", "http://www.w3.org/2011/content#Content");
		classLocalNameHash.put("Instance", "http://bib.ld4l.org/ontology/Instance");
		classLocalNameHash.put("ThreeDimensionalObject", "http://bib.ld4l.org/ontology/ThreeDimensionalObject");
		classLocalNameHash.put("Lingvo", "http://www.lingvoj.org/ontology#Lingvo");
		classLocalNameHash.put("Nban", "http://bib.ld4l.org/ontology/Nban");
		classLocalNameHash.put("SymmetricProperty", "http://www.w3.org/2002/07/owl#SymmetricProperty");
		classLocalNameHash.put("StockNumber", "http://bib.ld4l.org/ontology/StockNumber");
		classLocalNameHash.put("Authority", "http://www.loc.gov/mads/rdf/v1#Authority");
		classLocalNameHash.put("KeyTitle", "http://bib.ld4l.org/ontology/KeyTitle");
		classLocalNameHash.put("Doi", "http://bib.ld4l.org/ontology/Doi");
		classLocalNameHash.put("NotatedMusic", "http://bib.ld4l.org/ontology/NotatedMusic");
		classLocalNameHash.put("Electronic", "http://bib.ld4l.org/ontology/Electronic");
		classLocalNameHash.put("Multimedia", "http://bib.ld4l.org/ontology/Multimedia");
		classLocalNameHash.put("Property", "http://www.w3.org/1999/02/22-rdf-syntax-ns#Property");
		classLocalNameHash.put("Tactile", "http://bib.ld4l.org/ontology/Tactile");
		classLocalNameHash.put("Work", "http://bib.ld4l.org/ontology/Work");
		classLocalNameHash.put("PartNameElement", "http://www.loc.gov/mads/rdf/v1#PartNameElement");
		classLocalNameHash.put("FunctionalProperty", "http://www.w3.org/2002/07/owl#FunctionalProperty");
		classLocalNameHash.put("ConceptScheme", "http://www.w3.org/2004/02/skos/core#ConceptScheme");
		classLocalNameHash.put("DistributorProvision", "http://bib.ld4l.org/ontology/DistributorProvision");
		classLocalNameHash.put("Resource", "http://www.w3.org/2000/01/rdf-schema#Resource");
		classLocalNameHash.put("Isbn", "http://bib.ld4l.org/ontology/Isbn");
		classLocalNameHash.put("PerformerContribution", "http://bib.ld4l.org/ontology/PerformerContribution");
		classLocalNameHash.put("OclcIdentifier", "http://bib.ld4l.org/ontology/OclcIdentifier");
		classLocalNameHash.put("Family", "http://bib.ld4l.org/ontology/Family");
		classLocalNameHash.put("Topic", "http://bib.ld4l.org/ontology/Topic");
		classLocalNameHash.put("AuthorContribution", "http://bib.ld4l.org/ontology/AuthorContribution");
		classLocalNameHash.put("SourceStatus", "http://bib.ld4l.org/ontology/SourceStatus");
		classLocalNameHash.put("Restriction", "http://www.w3.org/2002/07/owl#Restriction");
		classLocalNameHash.put("MainTitleElement", "http://www.loc.gov/mads/rdf/v1#MainTitleElement");
		classLocalNameHash.put("Audio", "http://bib.ld4l.org/ontology/Audio");
		classLocalNameHash.put("Classification", "http://bib.ld4l.org/ontology/Classification");
		classLocalNameHash.put("Ean", "http://bib.ld4l.org/ontology/Ean");
		classLocalNameHash.put("InverseFunctionalProperty", "http://www.w3.org/2002/07/owl#InverseFunctionalProperty");
		classLocalNameHash.put("Monograph", "http://bib.ld4l.org/ontology/Monograph");
		classLocalNameHash.put("LcOverseasAcqNumber", "http://bib.ld4l.org/ontology/LcOverseasAcqNumber");
		classLocalNameHash.put("MusicPublisherNumber", "http://bib.ld4l.org/ontology/MusicPublisherNumber");
		classLocalNameHash.put("Text", "http://bib.ld4l.org/ontology/Text");
		classLocalNameHash.put("LccShelfMark", "http://bib.ld4l.org/ontology/LccShelfMark");
		classLocalNameHash.put("PostalRegistrationNumber", "http://bib.ld4l.org/ontology/PostalRegistrationNumber");
		classLocalNameHash.put("Thing", "http://www.w3.org/2002/07/owl#Thing");
		classLocalNameHash.put("FiniteResource", "http://bib.ld4l.org/ontology/FiniteResource");
		classLocalNameHash.put("Serial", "http://bib.ld4l.org/ontology/Serial");
		classLocalNameHash.put("DatatypeProperty", "http://www.w3.org/2002/07/owl#DatatypeProperty");
		classLocalNameHash.put("TitleElement", "http://www.loc.gov/mads/rdf/v1#TitleElement");
		classLocalNameHash.put("Ontology", "http://www.w3.org/2002/07/owl#Ontology");
		classLocalNameHash.put("CreatorContribution", "http://bib.ld4l.org/ontology/CreatorContribution");
		classLocalNameHash.put("Coden", "http://bib.ld4l.org/ontology/Coden");
		classLocalNameHash.put("EditorContribution", "http://bib.ld4l.org/ontology/EditorContribution");
		classLocalNameHash.put("Ismn", "http://bib.ld4l.org/ontology/Ismn");
		classLocalNameHash.put("Upc", "http://bib.ld4l.org/ontology/Upc");
		classLocalNameHash.put("PublisherProvision", "http://bib.ld4l.org/ontology/PublisherProvision");
		classLocalNameHash.put("LinguisticSystem", "http://purl.org/dc/terms/LinguisticSystem");
	}

	boolean useSPARQL = true;
	Dataset dataset = null;
	String tripleStore = null;
	String endpoint = null;
	Properties properties = null;

	private void loadProperties() {
		if (properties != null)
			return;

		String theURI = ((HttpServletRequest)pageContext.getRequest()).getRequestURI();
		String applicationRoot = theURI.substring(0, theURI.indexOf('/', 1));
		log.info("loading " + applicationRoot + ".properties");
		properties = PropertyLoader.loadProperties(applicationRoot + ".properties");

		String redirect = properties.getProperty("BIBFRAMETagLib_properties");
		if (redirect != null) {
			log.info("loading BIBFRAMETagLib redirection: " + redirect);
			properties = PropertyLoader.loadProperties(redirect);
		}

		useSPARQL = properties.getProperty("useSPARQL", "true").equals("true");
		endpoint = properties.getProperty("endpoint", "localhost");
		tripleStore = properties.getProperty("tripleStore", "localhost");

	}


	public ResultSet getResultSet(String queryString) {
		loadProperties();
		if (useSPARQL) {
			Query theClassQuery = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution theClassExecution = QueryExecutionFactory.sparqlService(endpoint, theClassQuery);
			return theClassExecution.execSelect();
		} else {
			dataset = TDBFactory.createDataset(tripleStore);
			Query query = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			return qexec.execSelect();
		}
	}

	public void freeConnection() {
		if (!useSPARQL) {
			//dataset.close();
		}
	}

	public String getLocalName(String classString) {
		if (classString == null) {
			return null;
		}
		return classNameHash.get(classString);
	}

}
