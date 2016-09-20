package edu.uiowa.slis.BIBFRAME.GovernmentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class GovernmentOrganizationIsAnnotatorOfIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static GovernmentOrganizationIsAnnotatorOfIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentOrganizationIsAnnotatorOfIterator.class);

	String subjectURI = null;
	String type = null;
	String isAnnotatorOf = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GovernmentOrganization theGovernmentOrganization = (GovernmentOrganization) findAncestorWithClass(this, GovernmentOrganization.class);

			if (theGovernmentOrganization != null) {
				subjectURI = theGovernmentOrganization.getSubjectURI();
			}

			if (theGovernmentOrganization == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://bib.ld4l.org/ontology/isAnnotatorOf> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isAnnotatorOf = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + isAnnotatorOf + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GovernmentOrganizationIsAnnotatorOfIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GovernmentOrganizationIsAnnotatorOfIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isAnnotatorOf = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + isAnnotatorOf + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GovernmentOrganizationIsAnnotatorOfIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GovernmentOrganizationIsAnnotatorOfIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GovernmentOrganizationIsAnnotatorOf doEndTag", e);
			throw new JspTagException("Exception raised in GovernmentOrganizationIsAnnotatorOf doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		isAnnotatorOf = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setIsAnnotatorOf(String isAnnotatorOf) {
		this.isAnnotatorOf = isAnnotatorOf;
	}

	public String getIsAnnotatorOf() {
		return isAnnotatorOf;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to GovernmentOrganizationIsAnnotatorOfIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
