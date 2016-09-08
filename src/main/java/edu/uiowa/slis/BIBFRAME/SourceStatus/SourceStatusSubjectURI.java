package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SourceStatus theSourceStatus = (SourceStatus)findAncestorWithClass(this, SourceStatus.class);
			if (!theSourceStatus.commitNeeded) {
				pageContext.getOut().print(theSourceStatus.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SourceStatus theSourceStatus = (SourceStatus)findAncestorWithClass(this, SourceStatus.class);
			return theSourceStatus.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SourceStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SourceStatus theSourceStatus = (SourceStatus)findAncestorWithClass(this, SourceStatus.class);
			theSourceStatus.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for subjectURI tag ");
		}
	}
}

