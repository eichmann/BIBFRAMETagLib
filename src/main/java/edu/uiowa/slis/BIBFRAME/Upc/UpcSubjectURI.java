package edu.uiowa.slis.BIBFRAME.Upc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UpcSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UpcSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UpcSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Upc theUpc = (Upc)findAncestorWithClass(this, Upc.class);
			if (!theUpc.commitNeeded) {
				pageContext.getOut().print(theUpc.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Upc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Upc theUpc = (Upc)findAncestorWithClass(this, Upc.class);
			return theUpc.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Upc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Upc theUpc = (Upc)findAncestorWithClass(this, Upc.class);
			theUpc.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Upc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Upc for subjectURI tag ");
		}
	}
}

