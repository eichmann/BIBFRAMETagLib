package edu.uiowa.slis.BIBFRAME.IssnL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnLSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnLSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnLSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IssnL theIssnL = (IssnL)findAncestorWithClass(this, IssnL.class);
			if (!theIssnL.commitNeeded) {
				pageContext.getOut().print(theIssnL.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IssnL for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IssnL theIssnL = (IssnL)findAncestorWithClass(this, IssnL.class);
			return theIssnL.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IssnL for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IssnL theIssnL = (IssnL)findAncestorWithClass(this, IssnL.class);
			theIssnL.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IssnL for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssnL for subjectURI tag ");
		}
	}
}

