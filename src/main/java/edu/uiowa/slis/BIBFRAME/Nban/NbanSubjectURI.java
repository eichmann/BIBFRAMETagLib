package edu.uiowa.slis.BIBFRAME.Nban;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NbanSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NbanSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NbanSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nban theNban = (Nban)findAncestorWithClass(this, Nban.class);
			if (!theNban.commitNeeded) {
				pageContext.getOut().print(theNban.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nban for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Nban theNban = (Nban)findAncestorWithClass(this, Nban.class);
			return theNban.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nban for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Nban theNban = (Nban)findAncestorWithClass(this, Nban.class);
			theNban.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Nban for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nban for subjectURI tag ");
		}
	}
}

