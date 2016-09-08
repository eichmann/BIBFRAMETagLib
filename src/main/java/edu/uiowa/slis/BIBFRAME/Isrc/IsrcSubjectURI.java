package edu.uiowa.slis.BIBFRAME.Isrc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsrcSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsrcSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IsrcSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isrc theIsrc = (Isrc)findAncestorWithClass(this, Isrc.class);
			if (!theIsrc.commitNeeded) {
				pageContext.getOut().print(theIsrc.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isrc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Isrc theIsrc = (Isrc)findAncestorWithClass(this, Isrc.class);
			return theIsrc.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isrc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Isrc theIsrc = (Isrc)findAncestorWithClass(this, Isrc.class);
			theIsrc.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Isrc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for subjectURI tag ");
		}
	}
}

