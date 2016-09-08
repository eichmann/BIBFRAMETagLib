package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSeparatedIntoIterator theIntegratingResourceSeparatedIntoIterator = (IntegratingResourceSeparatedIntoIterator)findAncestorWithClass(this, IntegratingResourceSeparatedIntoIterator.class);
			pageContext.getOut().print(theIntegratingResourceSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

