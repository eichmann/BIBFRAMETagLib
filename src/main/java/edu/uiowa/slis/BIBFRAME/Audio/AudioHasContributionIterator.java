package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class AudioHasContributionIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasContributionIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasContributionIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String type = null;
	String hasContribution = null;
	ResultSet rs = null;
	String sortCriteria = null;
	int limitCriteria = 0;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Audio theAudio = (Audio) findAncestorWithClass(this, Audio.class);

			if (theAudio != null) {
				subjectURI = theAudio.getSubjectURI();
			}

			if (theAudio == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://bib.ld4l.org/ontology/hasContribution> ?s . "
					+" OPTIONAL { ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t } ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" } " +
					" } " +
					(limitCriteria == 0 ? "" : " LIMIT " + limitCriteria + " ")
					);
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasContribution = sol.get("?s").toString();
				type = sol.get("?t") == null ? null : getLocalName(sol.get("?t").toString());
//				if (type == null)
//					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasContribution + "	type: " + type);
					firstInstance = true;
					lastInstance = ! rs.hasNext();
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in AudioHasContributionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in AudioHasContributionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hasContribution = sol.get("?s").toString();
				type = sol.get("?t") == null ? null : getLocalName(sol.get("?t").toString());
//				if (type == null)
//					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + hasContribution + "	type: " + type);
					firstInstance = false;
					lastInstance = ! rs.hasNext();
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in AudioHasContributionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in AudioHasContributionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in AudioHasContribution doEndTag", e);
			throw new JspTagException("Exception raised in AudioHasContribution doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		hasContribution = null;
		classFilter = null;
	}

	public void setSortCriteria(String theSortCriteria) {
		sortCriteria = theSortCriteria;
	}

	public String getSortCriteria() {
		return sortCriteria;
	}

	public void setLimitCriteria(Integer theLimitCriteria) {
		limitCriteria = theLimitCriteria;
	}

	public Integer getLimitCriteria() {
		return limitCriteria;
	}

	public void setType(String theType) {
		type = theType;
	}

	public String getType() {
		return type;
	}

	public void setHasContribution(String theHasContribution) {
		hasContribution = theHasContribution;
	}

	public String getHasContribution() {
		return hasContribution;
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

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to AudioHasContributionIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
