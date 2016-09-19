package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicSubjectIterator theElectronicSubjectIterator = (ElectronicSubjectIterator)findAncestorWithClass(this, ElectronicSubjectIterator.class);
			pageContext.getOut().print(theElectronicSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for subject tag ");
		}
		return SKIP_BODY;
	}
}

