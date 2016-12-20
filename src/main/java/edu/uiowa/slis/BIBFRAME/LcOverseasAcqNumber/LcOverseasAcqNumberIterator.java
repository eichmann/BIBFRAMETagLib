package edu.uiowa.slis.BIBFRAME.LcOverseasAcqNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class LcOverseasAcqNumberIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LcOverseasAcqNumberIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(LcOverseasAcqNumberIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String label = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			rs = getResultSet(prefix+
					" SELECT ?s ?lab where { "+
					"  ?s rdf:type <http://bib.ld4l.org/ontology/LcOverseasAcqNumber> . "+
					"  OPTIONAL { ?s rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\") } "+
					"  OPTIONAL { ?s rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\")) } "+
					"  OPTIONAL { ?s rdfs:label ?label    FILTER (lang(?label) = \"\") } "+
					"  OPTIONAL { ?s rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\") } "+
					"  BIND(COALESCE(?labelUS, ?labelENG, ?label, ?labelANY) as ?lab) "+
					"} ORDER BY ?lab");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				subjectURI = sol.get("?s").toString();
				label = sol.get("?lab") == null ? null : sol.get("?lab").asLiteral().getString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in LcOverseasAcqNumberIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LcOverseasAcqNumberIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				subjectURI = sol.get("?s").toString();
				label = sol.get("?lab") == null ? null : sol.get("?lab").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in LcOverseasAcqNumberIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LcOverseasAcqNumberIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in LcOverseasAcqNumber doEndTag", e);
			throw new JspTagException("Exception raised in LcOverseasAcqNumber doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		label = null;
	}

	public  void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public  String getSubjectURI() {
		return subjectURI;
	}

	public  void setLabel(String theLabel) {
		label = theLabel;
	}

	public  String getLabel() {
		return label;
	}

	public static void setFirstInstance(Boolean theFirstInstance) {
		firstInstance = theFirstInstance;
	}

	public static Boolean getFirstInstance() {
		return firstInstance;
	}

	public static void setLastInstance(Boolean theLastInstance) {
		lastInstance = theLastInstance;
	}

	public static Boolean getLastInstance() {
		return lastInstance;
	}

}
