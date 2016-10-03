package edu.uiowa.slis.BIBFRAME;

import java.util.Hashtable;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.Syntax;
import org.apache.jena.tdb.TDBFactory;

@SuppressWarnings("serial")
public class TagLibSupport extends javax.servlet.jsp.tagext.TagSupport {
	static final boolean useSPARQL = false;
	static String endpoint = "http://marengo.info-science.uiowa.edu:2021/sparql";
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
		classNameHash.put("http://bib.ld4l.org/ontology/Dataset", "Dataset");
		classNameHash.put("http://bib.ld4l.org/ontology/Index", "Index");
		classNameHash.put("http://bib.ld4l.org/ontology/Item", "Item");
		classNameHash.put("http://bib.ld4l.org/ontology/Lccn", "Lccn");
		classNameHash.put("http://bib.ld4l.org/ontology/SourceStatus", "SourceStatus");
		classNameHash.put("http://bib.ld4l.org/ontology/Upc", "Upc");
		classNameHash.put("http://bib.ld4l.org/ontology/ConductorContribution", "ConductorContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Electronic", "Electronic");
		classNameHash.put("http://bib.ld4l.org/ontology/PeriodicalPart", "PeriodicalPart");
		classNameHash.put("http://bib.ld4l.org/ontology/ProducerProvision", "ProducerProvision");
		classNameHash.put("http://bib.ld4l.org/ontology/NlmClassification", "NlmClassification");
		classNameHash.put("http://bib.ld4l.org/ontology/SystemNumber", "SystemNumber");
		classNameHash.put("http://www.w3.org/ns/oa#Motivation", "Motivation");
		classNameHash.put("http://bib.ld4l.org/ontology/EditorContribution", "EditorContribution");
		classNameHash.put("http://xmlns.com/foaf/0.1/Person", "Person");
		classNameHash.put("http://bib.ld4l.org/ontology/Doi", "Doi");
		classNameHash.put("http://bib.ld4l.org/ontology/AwardReceipt", "AwardReceipt");
		classNameHash.put("http://bib.ld4l.org/ontology/ContainerTitle", "ContainerTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/ThreeDimensionalObject", "ThreeDimensionalObject");
		classNameHash.put("http://bib.ld4l.org/ontology/Manuscript", "Manuscript");
		classNameHash.put("http://bib.ld4l.org/ontology/MatrixNumber", "MatrixNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/IssueNumber", "IssueNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/NotatedMovement", "NotatedMovement");
		classNameHash.put("http://bib.ld4l.org/ontology/ConciseTitle", "ConciseTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/DdcShelfMark", "DdcShelfMark");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#ConceptScheme", "ConceptScheme");
		classNameHash.put("http://bib.ld4l.org/ontology/Audio", "Audio");
		classNameHash.put("http://bib.ld4l.org/ontology/MovingImage", "MovingImage");
		classNameHash.put("http://bib.ld4l.org/ontology/Instance", "Instance");
		classNameHash.put("http://bib.ld4l.org/ontology/LocalIlsIdentifer", "LocalIlsIdentifer");
		classNameHash.put("http://bib.ld4l.org/ontology/Serial", "Serial");
		classNameHash.put("http://bib.ld4l.org/ontology/FiniteResource", "FiniteResource");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#RWO", "RWO");
		classNameHash.put("http://bib.ld4l.org/ontology/Text", "Text");
		classNameHash.put("http://www.w3.org/2011/content#ContentAsText", "ContentAsText");
		classNameHash.put("http://bib.ld4l.org/ontology/IntegratingResource", "IntegratingResource");
		classNameHash.put("http://bib.ld4l.org/ontology/DissertationIdentifier", "DissertationIdentifier");
		classNameHash.put("http://www.w3.org/2011/content#Content", "Content");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#NonSortElement", "NonSortElement");
		classNameHash.put("http://bib.ld4l.org/ontology/Hdl", "Hdl");
		classNameHash.put("http://bib.ld4l.org/ontology/PolicySet", "PolicySet");
		classNameHash.put("http://bib.ld4l.org/ontology/IssnL", "IssnL");
		classNameHash.put("http://bib.ld4l.org/ontology/Isbn13", "Isbn13");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#Authority", "Authority");
		classNameHash.put("http://bib.ld4l.org/ontology/Isbn10", "Isbn10");
		classNameHash.put("http://bib.ld4l.org/ontology/MusicPlateNumber", "MusicPlateNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/MultipartMonograph", "MultipartMonograph");
		classNameHash.put("http://bib.ld4l.org/ontology/StockNumber", "StockNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Nbn", "Nbn");
		classNameHash.put("http://bib.ld4l.org/ontology/Tactile", "Tactile");
		classNameHash.put("http://bib.ld4l.org/ontology/Cartography", "Cartography");
		classNameHash.put("http://bib.ld4l.org/ontology/Issn", "Issn");
		classNameHash.put("http://bib.ld4l.org/ontology/Dissertation", "Dissertation");
		classNameHash.put("http://schema.org/Event", "Event");
		classNameHash.put("http://bib.ld4l.org/ontology/Fingerprint", "Fingerprint");
		classNameHash.put("http://bib.ld4l.org/ontology/PostalRegistrationNumber", "PostalRegistrationNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Ansi", "Ansi");
		classNameHash.put("http://purl.org/dc/terms/LinguisticSystem", "LinguisticSystem");
		classNameHash.put("http://bib.ld4l.org/ontology/Isan", "Isan");
		classNameHash.put("http://bib.ld4l.org/ontology/LccClassification", "LccClassification");
		classNameHash.put("http://bib.ld4l.org/ontology/PublisherNumber", "PublisherNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Isbn", "Isbn");
		classNameHash.put("http://xmlns.com/foaf/0.1/Agent", "Agent");
		classNameHash.put("http://bib.ld4l.org/ontology/CoverTitle", "CoverTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/CreatorContribution", "CreatorContribution");
		classNameHash.put("http://www.w3.org/ns/oa#Annotation", "Annotation");
		classNameHash.put("http://bib.ld4l.org/ontology/LccShelfMark", "LccShelfMark");
		classNameHash.put("http://purl.org/spar/fabio/Magazine", "Magazine");
		classNameHash.put("http://bib.ld4l.org/ontology/NarratorContribution", "NarratorContribution");
		classNameHash.put("http://xmlns.com/foaf/0.1/Organization", "Organization");
		classNameHash.put("http://bib.ld4l.org/ontology/Topic", "Topic");
		classNameHash.put("http://bib.ld4l.org/ontology/Ean", "Ean");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#Title", "Title");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#Language", "Language");
		classNameHash.put("http://bib.ld4l.org/ontology/CirculationStatus", "CirculationStatus");
		classNameHash.put("http://bib.ld4l.org/ontology/LegalDepositNumber", "LegalDepositNumber");
		classNameHash.put("http://purl.org/spar/fabio/Newspaper", "Newspaper");
		classNameHash.put("http://www.w3.org/2002/07/owl#Thing", "Thing");
		classNameHash.put("http://bib.ld4l.org/ontology/ContinuingResource", "ContinuingResource");
		classNameHash.put("http://bib.ld4l.org/ontology/LcOverseasAcqNumber", "LcOverseasAcqNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/Barcode", "Barcode");
		classNameHash.put("http://bib.ld4l.org/ontology/BinderTitle", "BinderTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/Policy", "Policy");
		classNameHash.put("http://bib.ld4l.org/ontology/ShelfMark", "ShelfMark");
		classNameHash.put("http://bib.ld4l.org/ontology/DistinctiveTitle", "DistinctiveTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/SpineTitle", "SpineTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/Ismn", "Ismn");
		classNameHash.put("http://vivoweb.org/ontology/core#AcademicDegree", "AcademicDegree");
		classNameHash.put("http://bib.ld4l.org/ontology/Collection", "Collection");
		classNameHash.put("http://bib.ld4l.org/ontology/MusicPublisherNumber", "MusicPublisherNumber");
		classNameHash.put("http://bib.ld4l.org/ontology/KeyTitle", "KeyTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/NotatedMusic", "NotatedMusic");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#MainTitleElement", "MainTitleElement");
		classNameHash.put("http://bib.ld4l.org/ontology/Monograph", "Monograph");
		classNameHash.put("http://bib.ld4l.org/ontology/Work", "Work");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Concept", "Concept");
		classNameHash.put("http://bib.ld4l.org/ontology/Periodical", "Periodical");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Collection", "Collection");
		classNameHash.put("http://bib.ld4l.org/ontology/TechnicalReportNumber", "TechnicalReportNumber");
		classNameHash.put("http://www.w3.org/2002/07/owl#Nothing", "Nothing");
		classNameHash.put("http://bib.ld4l.org/ontology/Coden", "Coden");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#PartNameElement", "PartNameElement");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#SubTitleElement", "SubTitleElement");
		classNameHash.put("http://bib.ld4l.org/ontology/AuthorContribution", "AuthorContribution");
		classNameHash.put("http://schema.org/GovernmentOrganization", "GovernmentOrganization");
		classNameHash.put("http://vivoweb.org/ontology/core#Meeting", "Meeting");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#OrderedCollection", "OrderedCollection");
		classNameHash.put("http://bib.ld4l.org/ontology/ComposerContribution", "ComposerContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Sici", "Sici");
		classNameHash.put("http://bib.ld4l.org/ontology/StillImage", "StillImage");
		classNameHash.put("http://bib.ld4l.org/ontology/CaptionTitle", "CaptionTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/Nban", "Nban");
		classNameHash.put("http://bib.ld4l.org/ontology/DdcClassification", "DdcClassification");
		classNameHash.put("http://bib.ld4l.org/ontology/Classification", "Classification");
		classNameHash.put("http://bib.ld4l.org/ontology/NlmShelfMark", "NlmShelfMark");
		classNameHash.put("http://www.w3.org/TR/owl-time/TemporalEntity", "TemporalEntity");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#PartNumberElement", "PartNumberElement");
		classNameHash.put("http://bib.ld4l.org/ontology/PerformerContribution", "PerformerContribution");
		classNameHash.put("http://bib.ld4l.org/ontology/Conference", "Conference");
		classNameHash.put("http://bib.ld4l.org/ontology/StudyNumber", "StudyNumber");
		classNameHash.put("http://schema.org/Audience", "Audience");
		classNameHash.put("http://bib.ld4l.org/ontology/TransliteratedTitle", "TransliteratedTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/OclcIdentifier", "OclcIdentifier");
		classNameHash.put("http://bib.ld4l.org/ontology/DistributorProvision", "DistributorProvision");
		classNameHash.put("http://bib.ld4l.org/ontology/Identifier", "Identifier");
		classNameHash.put("http://bib.ld4l.org/ontology/TranslatedTitle", "TranslatedTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/Provision", "Provision");
		classNameHash.put("http://bib.ld4l.org/ontology/UdcClassification", "UdcClassification");
		classNameHash.put("http://bib.ld4l.org/ontology/ManufacturerProvision", "ManufacturerProvision");
		classNameHash.put("http://bib.ld4l.org/ontology/Series", "Series");
		classNameHash.put("http://bib.ld4l.org/ontology/PublisherProvision", "PublisherProvision");
		classNameHash.put("http://bib.ld4l.org/ontology/Multimedia", "Multimedia");
		classNameHash.put("http://bib.ld4l.org/ontology/Iswc", "Iswc");
		classNameHash.put("http://bib.ld4l.org/ontology/Award", "Award");
		classNameHash.put("http://www.loc.gov/mads/rdf/v1#TitleElement", "TitleElement");
		classNameHash.put("http://bib.ld4l.org/ontology/Istc", "Istc");
		classNameHash.put("http://bib.ld4l.org/ontology/Contribution", "Contribution");
		classNameHash.put("http://www.w3.org/ns/prov#Location", "Location");
		classNameHash.put("http://bib.ld4l.org/ontology/UdcShelfMark", "UdcShelfMark");
		classNameHash.put("http://purl.org/spar/fabio/Journal", "Journal");
		classNameHash.put("http://www.lingvoj.org/ontology#Lingvo", "Lingvo");
		classNameHash.put("http://bib.ld4l.org/ontology/Iso", "Iso");
		classNameHash.put("http://bib.ld4l.org/ontology/Print", "Print");
		classNameHash.put("http://bib.ld4l.org/ontology/Strn", "Strn");
		classNameHash.put("http://bib.ld4l.org/ontology/Isrc", "Isrc");
		classNameHash.put("http://bib.ld4l.org/ontology/Family", "Family");
		classNameHash.put("http://bib.ld4l.org/ontology/AbbreviatedTitle", "AbbreviatedTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/RunningTitle", "RunningTitle");
		classNameHash.put("http://bib.ld4l.org/ontology/VideoRecordingNumber", "VideoRecordingNumber");

		classLocalNameHash.put("Dataset", "http://bib.ld4l.org/ontology/Dataset");
		classLocalNameHash.put("Index", "http://bib.ld4l.org/ontology/Index");
		classLocalNameHash.put("Item", "http://bib.ld4l.org/ontology/Item");
		classLocalNameHash.put("Lccn", "http://bib.ld4l.org/ontology/Lccn");
		classLocalNameHash.put("SourceStatus", "http://bib.ld4l.org/ontology/SourceStatus");
		classLocalNameHash.put("Upc", "http://bib.ld4l.org/ontology/Upc");
		classLocalNameHash.put("ConductorContribution", "http://bib.ld4l.org/ontology/ConductorContribution");
		classLocalNameHash.put("Electronic", "http://bib.ld4l.org/ontology/Electronic");
		classLocalNameHash.put("PeriodicalPart", "http://bib.ld4l.org/ontology/PeriodicalPart");
		classLocalNameHash.put("ProducerProvision", "http://bib.ld4l.org/ontology/ProducerProvision");
		classLocalNameHash.put("NlmClassification", "http://bib.ld4l.org/ontology/NlmClassification");
		classLocalNameHash.put("SystemNumber", "http://bib.ld4l.org/ontology/SystemNumber");
		classLocalNameHash.put("Motivation", "http://www.w3.org/ns/oa#Motivation");
		classLocalNameHash.put("EditorContribution", "http://bib.ld4l.org/ontology/EditorContribution");
		classLocalNameHash.put("Person", "http://xmlns.com/foaf/0.1/Person");
		classLocalNameHash.put("Doi", "http://bib.ld4l.org/ontology/Doi");
		classLocalNameHash.put("AwardReceipt", "http://bib.ld4l.org/ontology/AwardReceipt");
		classLocalNameHash.put("ContainerTitle", "http://bib.ld4l.org/ontology/ContainerTitle");
		classLocalNameHash.put("ThreeDimensionalObject", "http://bib.ld4l.org/ontology/ThreeDimensionalObject");
		classLocalNameHash.put("Manuscript", "http://bib.ld4l.org/ontology/Manuscript");
		classLocalNameHash.put("MatrixNumber", "http://bib.ld4l.org/ontology/MatrixNumber");
		classLocalNameHash.put("IssueNumber", "http://bib.ld4l.org/ontology/IssueNumber");
		classLocalNameHash.put("NotatedMovement", "http://bib.ld4l.org/ontology/NotatedMovement");
		classLocalNameHash.put("ConciseTitle", "http://bib.ld4l.org/ontology/ConciseTitle");
		classLocalNameHash.put("DdcShelfMark", "http://bib.ld4l.org/ontology/DdcShelfMark");
		classLocalNameHash.put("ConceptScheme", "http://www.w3.org/2004/02/skos/core#ConceptScheme");
		classLocalNameHash.put("Audio", "http://bib.ld4l.org/ontology/Audio");
		classLocalNameHash.put("MovingImage", "http://bib.ld4l.org/ontology/MovingImage");
		classLocalNameHash.put("Instance", "http://bib.ld4l.org/ontology/Instance");
		classLocalNameHash.put("LocalIlsIdentifer", "http://bib.ld4l.org/ontology/LocalIlsIdentifer");
		classLocalNameHash.put("Serial", "http://bib.ld4l.org/ontology/Serial");
		classLocalNameHash.put("FiniteResource", "http://bib.ld4l.org/ontology/FiniteResource");
		classLocalNameHash.put("RWO", "http://www.loc.gov/mads/rdf/v1#RWO");
		classLocalNameHash.put("Text", "http://bib.ld4l.org/ontology/Text");
		classLocalNameHash.put("ContentAsText", "http://www.w3.org/2011/content#ContentAsText");
		classLocalNameHash.put("IntegratingResource", "http://bib.ld4l.org/ontology/IntegratingResource");
		classLocalNameHash.put("DissertationIdentifier", "http://bib.ld4l.org/ontology/DissertationIdentifier");
		classLocalNameHash.put("Content", "http://www.w3.org/2011/content#Content");
		classLocalNameHash.put("NonSortElement", "http://www.loc.gov/mads/rdf/v1#NonSortElement");
		classLocalNameHash.put("Hdl", "http://bib.ld4l.org/ontology/Hdl");
		classLocalNameHash.put("PolicySet", "http://bib.ld4l.org/ontology/PolicySet");
		classLocalNameHash.put("IssnL", "http://bib.ld4l.org/ontology/IssnL");
		classLocalNameHash.put("Isbn13", "http://bib.ld4l.org/ontology/Isbn13");
		classLocalNameHash.put("Authority", "http://www.loc.gov/mads/rdf/v1#Authority");
		classLocalNameHash.put("Isbn10", "http://bib.ld4l.org/ontology/Isbn10");
		classLocalNameHash.put("MusicPlateNumber", "http://bib.ld4l.org/ontology/MusicPlateNumber");
		classLocalNameHash.put("MultipartMonograph", "http://bib.ld4l.org/ontology/MultipartMonograph");
		classLocalNameHash.put("StockNumber", "http://bib.ld4l.org/ontology/StockNumber");
		classLocalNameHash.put("Nbn", "http://bib.ld4l.org/ontology/Nbn");
		classLocalNameHash.put("Tactile", "http://bib.ld4l.org/ontology/Tactile");
		classLocalNameHash.put("Cartography", "http://bib.ld4l.org/ontology/Cartography");
		classLocalNameHash.put("Issn", "http://bib.ld4l.org/ontology/Issn");
		classLocalNameHash.put("Dissertation", "http://bib.ld4l.org/ontology/Dissertation");
		classLocalNameHash.put("Event", "http://schema.org/Event");
		classLocalNameHash.put("Fingerprint", "http://bib.ld4l.org/ontology/Fingerprint");
		classLocalNameHash.put("PostalRegistrationNumber", "http://bib.ld4l.org/ontology/PostalRegistrationNumber");
		classLocalNameHash.put("Ansi", "http://bib.ld4l.org/ontology/Ansi");
		classLocalNameHash.put("LinguisticSystem", "http://purl.org/dc/terms/LinguisticSystem");
		classLocalNameHash.put("Isan", "http://bib.ld4l.org/ontology/Isan");
		classLocalNameHash.put("LccClassification", "http://bib.ld4l.org/ontology/LccClassification");
		classLocalNameHash.put("PublisherNumber", "http://bib.ld4l.org/ontology/PublisherNumber");
		classLocalNameHash.put("Isbn", "http://bib.ld4l.org/ontology/Isbn");
		classLocalNameHash.put("Agent", "http://xmlns.com/foaf/0.1/Agent");
		classLocalNameHash.put("CoverTitle", "http://bib.ld4l.org/ontology/CoverTitle");
		classLocalNameHash.put("CreatorContribution", "http://bib.ld4l.org/ontology/CreatorContribution");
		classLocalNameHash.put("Annotation", "http://www.w3.org/ns/oa#Annotation");
		classLocalNameHash.put("LccShelfMark", "http://bib.ld4l.org/ontology/LccShelfMark");
		classLocalNameHash.put("Magazine", "http://purl.org/spar/fabio/Magazine");
		classLocalNameHash.put("NarratorContribution", "http://bib.ld4l.org/ontology/NarratorContribution");
		classLocalNameHash.put("Organization", "http://xmlns.com/foaf/0.1/Organization");
		classLocalNameHash.put("Topic", "http://bib.ld4l.org/ontology/Topic");
		classLocalNameHash.put("Ean", "http://bib.ld4l.org/ontology/Ean");
		classLocalNameHash.put("Title", "http://www.loc.gov/mads/rdf/v1#Title");
		classLocalNameHash.put("Language", "http://www.loc.gov/mads/rdf/v1#Language");
		classLocalNameHash.put("CirculationStatus", "http://bib.ld4l.org/ontology/CirculationStatus");
		classLocalNameHash.put("LegalDepositNumber", "http://bib.ld4l.org/ontology/LegalDepositNumber");
		classLocalNameHash.put("Newspaper", "http://purl.org/spar/fabio/Newspaper");
		classLocalNameHash.put("Thing", "http://www.w3.org/2002/07/owl#Thing");
		classLocalNameHash.put("ContinuingResource", "http://bib.ld4l.org/ontology/ContinuingResource");
		classLocalNameHash.put("LcOverseasAcqNumber", "http://bib.ld4l.org/ontology/LcOverseasAcqNumber");
		classLocalNameHash.put("Barcode", "http://bib.ld4l.org/ontology/Barcode");
		classLocalNameHash.put("BinderTitle", "http://bib.ld4l.org/ontology/BinderTitle");
		classLocalNameHash.put("Policy", "http://bib.ld4l.org/ontology/Policy");
		classLocalNameHash.put("ShelfMark", "http://bib.ld4l.org/ontology/ShelfMark");
		classLocalNameHash.put("DistinctiveTitle", "http://bib.ld4l.org/ontology/DistinctiveTitle");
		classLocalNameHash.put("SpineTitle", "http://bib.ld4l.org/ontology/SpineTitle");
		classLocalNameHash.put("Ismn", "http://bib.ld4l.org/ontology/Ismn");
		classLocalNameHash.put("AcademicDegree", "http://vivoweb.org/ontology/core#AcademicDegree");
		classLocalNameHash.put("Collection", "http://bib.ld4l.org/ontology/Collection");
		classLocalNameHash.put("MusicPublisherNumber", "http://bib.ld4l.org/ontology/MusicPublisherNumber");
		classLocalNameHash.put("KeyTitle", "http://bib.ld4l.org/ontology/KeyTitle");
		classLocalNameHash.put("NotatedMusic", "http://bib.ld4l.org/ontology/NotatedMusic");
		classLocalNameHash.put("MainTitleElement", "http://www.loc.gov/mads/rdf/v1#MainTitleElement");
		classLocalNameHash.put("Monograph", "http://bib.ld4l.org/ontology/Monograph");
		classLocalNameHash.put("Work", "http://bib.ld4l.org/ontology/Work");
		classLocalNameHash.put("Concept", "http://www.w3.org/2004/02/skos/core#Concept");
		classLocalNameHash.put("Periodical", "http://bib.ld4l.org/ontology/Periodical");
		classLocalNameHash.put("Collection", "http://www.w3.org/2004/02/skos/core#Collection");
		classLocalNameHash.put("TechnicalReportNumber", "http://bib.ld4l.org/ontology/TechnicalReportNumber");
		classLocalNameHash.put("Nothing", "http://www.w3.org/2002/07/owl#Nothing");
		classLocalNameHash.put("Coden", "http://bib.ld4l.org/ontology/Coden");
		classLocalNameHash.put("PartNameElement", "http://www.loc.gov/mads/rdf/v1#PartNameElement");
		classLocalNameHash.put("SubTitleElement", "http://www.loc.gov/mads/rdf/v1#SubTitleElement");
		classLocalNameHash.put("AuthorContribution", "http://bib.ld4l.org/ontology/AuthorContribution");
		classLocalNameHash.put("GovernmentOrganization", "http://schema.org/GovernmentOrganization");
		classLocalNameHash.put("Meeting", "http://vivoweb.org/ontology/core#Meeting");
		classLocalNameHash.put("OrderedCollection", "http://www.w3.org/2004/02/skos/core#OrderedCollection");
		classLocalNameHash.put("ComposerContribution", "http://bib.ld4l.org/ontology/ComposerContribution");
		classLocalNameHash.put("Sici", "http://bib.ld4l.org/ontology/Sici");
		classLocalNameHash.put("StillImage", "http://bib.ld4l.org/ontology/StillImage");
		classLocalNameHash.put("CaptionTitle", "http://bib.ld4l.org/ontology/CaptionTitle");
		classLocalNameHash.put("Nban", "http://bib.ld4l.org/ontology/Nban");
		classLocalNameHash.put("DdcClassification", "http://bib.ld4l.org/ontology/DdcClassification");
		classLocalNameHash.put("Classification", "http://bib.ld4l.org/ontology/Classification");
		classLocalNameHash.put("NlmShelfMark", "http://bib.ld4l.org/ontology/NlmShelfMark");
		classLocalNameHash.put("TemporalEntity", "http://www.w3.org/TR/owl-time/TemporalEntity");
		classLocalNameHash.put("PartNumberElement", "http://www.loc.gov/mads/rdf/v1#PartNumberElement");
		classLocalNameHash.put("PerformerContribution", "http://bib.ld4l.org/ontology/PerformerContribution");
		classLocalNameHash.put("Conference", "http://bib.ld4l.org/ontology/Conference");
		classLocalNameHash.put("StudyNumber", "http://bib.ld4l.org/ontology/StudyNumber");
		classLocalNameHash.put("Audience", "http://schema.org/Audience");
		classLocalNameHash.put("TransliteratedTitle", "http://bib.ld4l.org/ontology/TransliteratedTitle");
		classLocalNameHash.put("OclcIdentifier", "http://bib.ld4l.org/ontology/OclcIdentifier");
		classLocalNameHash.put("DistributorProvision", "http://bib.ld4l.org/ontology/DistributorProvision");
		classLocalNameHash.put("Identifier", "http://bib.ld4l.org/ontology/Identifier");
		classLocalNameHash.put("TranslatedTitle", "http://bib.ld4l.org/ontology/TranslatedTitle");
		classLocalNameHash.put("Provision", "http://bib.ld4l.org/ontology/Provision");
		classLocalNameHash.put("UdcClassification", "http://bib.ld4l.org/ontology/UdcClassification");
		classLocalNameHash.put("ManufacturerProvision", "http://bib.ld4l.org/ontology/ManufacturerProvision");
		classLocalNameHash.put("Series", "http://bib.ld4l.org/ontology/Series");
		classLocalNameHash.put("PublisherProvision", "http://bib.ld4l.org/ontology/PublisherProvision");
		classLocalNameHash.put("Multimedia", "http://bib.ld4l.org/ontology/Multimedia");
		classLocalNameHash.put("Iswc", "http://bib.ld4l.org/ontology/Iswc");
		classLocalNameHash.put("Award", "http://bib.ld4l.org/ontology/Award");
		classLocalNameHash.put("TitleElement", "http://www.loc.gov/mads/rdf/v1#TitleElement");
		classLocalNameHash.put("Istc", "http://bib.ld4l.org/ontology/Istc");
		classLocalNameHash.put("Contribution", "http://bib.ld4l.org/ontology/Contribution");
		classLocalNameHash.put("Location", "http://www.w3.org/ns/prov#Location");
		classLocalNameHash.put("UdcShelfMark", "http://bib.ld4l.org/ontology/UdcShelfMark");
		classLocalNameHash.put("Journal", "http://purl.org/spar/fabio/Journal");
		classLocalNameHash.put("Lingvo", "http://www.lingvoj.org/ontology#Lingvo");
		classLocalNameHash.put("Iso", "http://bib.ld4l.org/ontology/Iso");
		classLocalNameHash.put("Print", "http://bib.ld4l.org/ontology/Print");
		classLocalNameHash.put("Strn", "http://bib.ld4l.org/ontology/Strn");
		classLocalNameHash.put("Isrc", "http://bib.ld4l.org/ontology/Isrc");
		classLocalNameHash.put("Family", "http://bib.ld4l.org/ontology/Family");
		classLocalNameHash.put("AbbreviatedTitle", "http://bib.ld4l.org/ontology/AbbreviatedTitle");
		classLocalNameHash.put("RunningTitle", "http://bib.ld4l.org/ontology/RunningTitle");
		classLocalNameHash.put("VideoRecordingNumber", "http://bib.ld4l.org/ontology/VideoRecordingNumber");
	}

	Dataset dataset = null;

	protected ResultSet getResultSet(String queryString) {
		if (useSPARQL) {
			Query theClassQuery = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution theClassExecution = QueryExecutionFactory.sparqlService(endpoint, theClassQuery);
			return theClassExecution.execSelect();
		} else {
			dataset = TDBFactory.createDataset("/Users/eichmann/Documents/Components/stanford");
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
