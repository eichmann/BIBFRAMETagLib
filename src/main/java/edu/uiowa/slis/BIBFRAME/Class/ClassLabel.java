package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassLabelIterator theClass = (ClassLabelIterator)findAncestorWithClass(this, ClassLabelIterator.class);
			pageContext.getOut().print(theClass.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for label tag ");
		}
		return SKIP_BODY;
	}
}

