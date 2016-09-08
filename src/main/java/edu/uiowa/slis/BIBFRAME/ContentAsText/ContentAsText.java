package edu.uiowa.slis.BIBFRAME.ContentAsText;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ContentAsText extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentAsText currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentAsText.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ContentAsTextIterator theContentAsTextIterator = (ContentAsTextIterator) findAncestorWithClass(this, ContentAsTextIterator.class);

			if (theContentAsTextIterator != null) {
				subjectURI = theContentAsTextIterator.getSubjectURI();
				label = theContentAsTextIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasBodyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasBodyIterator)this.getParent()).getHasBody();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasBodyIterator theAnnotationHasBodyIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasBodyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasBodyIterator.class);

			if (subjectURI == null && theAnnotationHasBodyIterator != null) {
				subjectURI = theAnnotationHasBodyIterator.getHasBody();
			}

			if (theContentAsTextIterator == null && subjectURI == null) {
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
			log.error("Exception raised in ContentAsText doStartTag", e);
			throw new JspTagException("Exception raised in ContentAsText doStartTag");
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
			log.error("Exception raised in ContentAsText doEndTag", e);
			throw new JspTagException("Exception raised in ContentAsText doEndTag");
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
