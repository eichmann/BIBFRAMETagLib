package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class PersonRelationInverseIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonRelationInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRelationInverseIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String type = null;
	String relationInverse = null;
	ResultSet rs = null;
	String sortCriteria = null;
	int limitCriteria = 0;
	int offsetCriteria = 0;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Person thePerson = (Person) findAncestorWithClass(this, Person.class);

			if (thePerson != null) {
				subjectURI = thePerson.getSubjectURI();
			}

			if (thePerson == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://purl.org/dc/terms/relation> <" + subjectURI+ "> . "
					+" OPTIONAL { ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t } ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" } " +
					" } " +
					(limitCriteria == 0 ? "" : " LIMIT " + limitCriteria + " ") +
					(offsetCriteria == 0 ? "" : " OFFSET " + offsetCriteria + " ")
					);
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				relationInverse = sol.get("?s").toString();
				type = sol.get("?t") == null ? null : getLocalName(sol.get("?t").toString());
//				if (type == null)
//					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + relationInverse + "	type: " + type);
					firstInstance = true;
					lastInstance = ! rs.hasNext();
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PersonRelationInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PersonRelationInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				relationInverse = sol.get("?s").toString();
				type = sol.get("?t") == null ? null : getLocalName(sol.get("?t").toString());
//				if (type == null)
//					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + relationInverse + "	type: " + type);
					firstInstance = false;
					lastInstance = ! rs.hasNext();
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PersonRelationIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PersonRelationIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in PersonRelation doEndTag", e);
			throw new JspTagException("Exception raised in PersonRelation doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		relationInverse = null;
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

	public void setOffsetCriteria(Integer theOffsetCriteria) {
		offsetCriteria = theOffsetCriteria;
	}

	public Integer getOffsetCriteria() {
		return offsetCriteria;
	}

	public void setType(String theType) {
		type = theType;
	}

	public String getType() {
		return type;
	}

	public void setRelationInverse(String theRelationInverse) {
		relationInverse = theRelationInverse;
	}

	public String getRelationInverse() {
		return relationInverse;
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
			log.info("adding filterClass " + filterClass + " to PersonRelationIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
