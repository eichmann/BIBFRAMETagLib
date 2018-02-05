package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PublisherProvisionDateIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvisionDateIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvisionDateIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String date = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PublisherProvision ancestorInstance = (PublisherProvision) findAncestorWithClass(this, PublisherProvision.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/dc/terms/date> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				date = sol.get("?s").toString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in PublisherProvisionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PublisherProvisionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				date = sol.get("?s").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in PublisherProvisionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PublisherProvisionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in PublisherProvision doEndTag", e);
			throw new JspTagException("Exception raised in PublisherProvision doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setDate(String theDate) {
		date = theDate;
	}

	public String getDate() {
		return date;
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
