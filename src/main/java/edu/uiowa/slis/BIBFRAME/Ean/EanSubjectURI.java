package edu.uiowa.slis.BIBFRAME.Ean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EanSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EanSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EanSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ean theEan = (Ean)findAncestorWithClass(this, Ean.class);
			if (!theEan.commitNeeded) {
				pageContext.getOut().print(theEan.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ean for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Ean theEan = (Ean)findAncestorWithClass(this, Ean.class);
			return theEan.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ean for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Ean theEan = (Ean)findAncestorWithClass(this, Ean.class);
			theEan.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Ean for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ean for subjectURI tag ");
		}
	}
}

