package edu.uiowa.slis.BIBFRAME.KeyTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static KeyTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			KeyTitle theKeyTitle = (KeyTitle)findAncestorWithClass(this, KeyTitle.class);
			if (!theKeyTitle.commitNeeded) {
				pageContext.getOut().print(theKeyTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			KeyTitle theKeyTitle = (KeyTitle)findAncestorWithClass(this, KeyTitle.class);
			return theKeyTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing KeyTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			KeyTitle theKeyTitle = (KeyTitle)findAncestorWithClass(this, KeyTitle.class);
			theKeyTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing KeyTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing KeyTitle for subjectURI tag ");
		}
	}
}

