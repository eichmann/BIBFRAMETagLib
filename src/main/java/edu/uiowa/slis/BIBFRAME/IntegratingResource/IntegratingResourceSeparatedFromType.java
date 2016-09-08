package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSeparatedFromIterator theIntegratingResourceSeparatedFromIterator = (IntegratingResourceSeparatedFromIterator)findAncestorWithClass(this, IntegratingResourceSeparatedFromIterator.class);
			pageContext.getOut().print(theIntegratingResourceSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

