package edu.uiowa.slis.BIBFRAME.Ismn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsmnSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsmnSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IsmnSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ismn theIsmn = (Ismn)findAncestorWithClass(this, Ismn.class);
			if (!theIsmn.commitNeeded) {
				pageContext.getOut().print(theIsmn.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ismn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Ismn theIsmn = (Ismn)findAncestorWithClass(this, Ismn.class);
			return theIsmn.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ismn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Ismn theIsmn = (Ismn)findAncestorWithClass(this, Ismn.class);
			theIsmn.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Ismn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ismn for subjectURI tag ");
		}
	}
}

