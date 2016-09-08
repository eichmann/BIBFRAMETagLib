package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMark theNlmShelfMark = (NlmShelfMark)findAncestorWithClass(this, NlmShelfMark.class);
			if (!theNlmShelfMark.commitNeeded) {
				pageContext.getOut().print(theNlmShelfMark.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NlmShelfMark theNlmShelfMark = (NlmShelfMark)findAncestorWithClass(this, NlmShelfMark.class);
			return theNlmShelfMark.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NlmShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NlmShelfMark theNlmShelfMark = (NlmShelfMark)findAncestorWithClass(this, NlmShelfMark.class);
			theNlmShelfMark.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for subjectURI tag ");
		}
	}
}

