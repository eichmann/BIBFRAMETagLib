package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassTerm_status extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassTerm_status currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassTerm_status.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassTerm_statusIterator theClass = (ClassTerm_statusIterator)findAncestorWithClass(this, ClassTerm_statusIterator.class);
			pageContext.getOut().print(theClass.getTerm_status());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for term_status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for term_status tag ");
		}
		return SKIP_BODY;
	}
}

