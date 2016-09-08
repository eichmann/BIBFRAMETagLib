package edu.uiowa.slis.BIBFRAME.Isan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsanSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsanSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IsanSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isan theIsan = (Isan)findAncestorWithClass(this, Isan.class);
			if (!theIsan.commitNeeded) {
				pageContext.getOut().print(theIsan.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isan for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Isan theIsan = (Isan)findAncestorWithClass(this, Isan.class);
			return theIsan.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isan for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Isan theIsan = (Isan)findAncestorWithClass(this, Isan.class);
			theIsan.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Isan for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isan for subjectURI tag ");
		}
	}
}

