package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class RWO extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWO currentInstance = null;
	private static final Log log = LogFactory.getLog(RWO.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			RWOIterator theRWOIterator = (RWOIterator) findAncestorWithClass(this, RWOIterator.class);

			if (theRWOIterator != null) {
				subjectURI = theRWOIterator.getSubjectURI();
				label = theRWOIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Authority.AuthorityIdentifiesRWOIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Authority.AuthorityIdentifiesRWOIterator)this.getParent()).getIdentifiesRWO();
			}

			edu.uiowa.slis.BIBFRAME.Authority.AuthorityIdentifiesRWOIterator theAuthorityIdentifiesRWOIterator = (edu.uiowa.slis.BIBFRAME.Authority.AuthorityIdentifiesRWOIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Authority.AuthorityIdentifiesRWOIterator.class);

			if (subjectURI == null && theAuthorityIdentifiesRWOIterator != null) {
				subjectURI = theAuthorityIdentifiesRWOIterator.getIdentifiesRWO();
			}

			if (theRWOIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in RWO doStartTag", e);
			throw new JspTagException("Exception raised in RWO doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in RWO doEndTag", e);
			throw new JspTagException("Exception raised in RWO doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
