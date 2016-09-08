package edu.uiowa.slis.BIBFRAME.NonSortElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonSortElementSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NonSortElementSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NonSortElementSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonSortElement theNonSortElement = (NonSortElement)findAncestorWithClass(this, NonSortElement.class);
			if (!theNonSortElement.commitNeeded) {
				pageContext.getOut().print(theNonSortElement.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonSortElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NonSortElement theNonSortElement = (NonSortElement)findAncestorWithClass(this, NonSortElement.class);
			return theNonSortElement.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonSortElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NonSortElement theNonSortElement = (NonSortElement)findAncestorWithClass(this, NonSortElement.class);
			theNonSortElement.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NonSortElement for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonSortElement for subjectURI tag ");
		}
	}
}

