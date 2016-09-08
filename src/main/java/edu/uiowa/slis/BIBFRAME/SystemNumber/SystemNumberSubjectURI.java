package edu.uiowa.slis.BIBFRAME.SystemNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SystemNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SystemNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SystemNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SystemNumber theSystemNumber = (SystemNumber)findAncestorWithClass(this, SystemNumber.class);
			if (!theSystemNumber.commitNeeded) {
				pageContext.getOut().print(theSystemNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SystemNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SystemNumber theSystemNumber = (SystemNumber)findAncestorWithClass(this, SystemNumber.class);
			return theSystemNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SystemNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SystemNumber theSystemNumber = (SystemNumber)findAncestorWithClass(this, SystemNumber.class);
			theSystemNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SystemNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SystemNumber for subjectURI tag ");
		}
	}
}

