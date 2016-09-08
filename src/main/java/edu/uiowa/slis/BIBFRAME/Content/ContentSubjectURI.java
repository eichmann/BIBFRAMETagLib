package edu.uiowa.slis.BIBFRAME.Content;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Content theContent = (Content)findAncestorWithClass(this, Content.class);
			if (!theContent.commitNeeded) {
				pageContext.getOut().print(theContent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Content for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Content theContent = (Content)findAncestorWithClass(this, Content.class);
			return theContent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Content for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Content theContent = (Content)findAncestorWithClass(this, Content.class);
			theContent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Content for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for subjectURI tag ");
		}
	}
}

