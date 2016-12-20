package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassExample extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassExample currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassExample.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassExampleIterator theClass = (ClassExampleIterator)findAncestorWithClass(this, ClassExampleIterator.class);
			pageContext.getOut().print(theClass.getExample());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for example tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for example tag ");
		}
		return SKIP_BODY;
	}
}

