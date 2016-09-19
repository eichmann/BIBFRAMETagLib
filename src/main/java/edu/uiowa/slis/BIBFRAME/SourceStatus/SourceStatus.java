package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class SourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatus.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			SourceStatusIterator theSourceStatusIterator = (SourceStatusIterator) findAncestorWithClass(this, SourceStatusIterator.class);

			if (theSourceStatusIterator != null) {
				subjectURI = theSourceStatusIterator.getSubjectURI();
				label = theSourceStatusIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator)this.getParent()).getHasSourceStatus();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator theTitleHasSourceStatusIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator.class);

			if (subjectURI == null && theTitleHasSourceStatusIterator != null) {
				subjectURI = theTitleHasSourceStatusIterator.getHasSourceStatus();
			}

			if (theSourceStatusIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in SourceStatus doStartTag", e);
			throw new JspTagException("Exception raised in SourceStatus doStartTag");
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
			log.error("Exception raised in SourceStatus doEndTag", e);
			throw new JspTagException("Exception raised in SourceStatus doEndTag");
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
