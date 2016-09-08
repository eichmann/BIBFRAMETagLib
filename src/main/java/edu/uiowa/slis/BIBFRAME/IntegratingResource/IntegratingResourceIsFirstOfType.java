package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsFirstOfIterator theIntegratingResourceIsFirstOfIterator = (IntegratingResourceIsFirstOfIterator)findAncestorWithClass(this, IntegratingResourceIsFirstOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

