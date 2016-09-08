package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Title extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Title currentInstance = null;
	private static final Log log = LogFactory.getLog(Title.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			TitleIterator theTitleIterator = (TitleIterator) findAncestorWithClass(this, TitleIterator.class);

			if (theTitleIterator != null) {
				subjectURI = theTitleIterator.getSubjectURI();
				label = theTitleIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.null.nullHasPreferredTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.null.nullHasPreferredTitleIterator)this.getParent()).getHasPreferredTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.null.nullHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.null.nullHasTitleIterator)this.getParent()).getHasTitle();
			}

			edu.uiowa.slis.BIBFRAME.null.nullHasPreferredTitleIterator thenullHasPreferredTitleIterator = (edu.uiowa.slis.BIBFRAME.null.nullHasPreferredTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.null.nullHasPreferredTitleIterator.class);

			if (subjectURI == null && thenullHasPreferredTitleIterator != null) {
				subjectURI = thenullHasPreferredTitleIterator.getHasPreferredTitle();
			}

			edu.uiowa.slis.BIBFRAME.null.nullHasTitleIterator thenullHasTitleIterator = (edu.uiowa.slis.BIBFRAME.null.nullHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.null.nullHasTitleIterator.class);

			if (subjectURI == null && thenullHasTitleIterator != null) {
				subjectURI = thenullHasTitleIterator.getHasTitle();
			}

			if (theTitleIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Title doStartTag", e);
			throw new JspTagException("Exception raised in Title doStartTag");
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
			log.error("Exception raised in Title doEndTag", e);
			throw new JspTagException("Exception raised in Title doEndTag");
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
