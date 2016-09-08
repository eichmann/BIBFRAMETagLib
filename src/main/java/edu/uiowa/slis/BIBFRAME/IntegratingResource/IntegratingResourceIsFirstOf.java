package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsFirstOfIterator theIntegratingResourceIsFirstOfIterator = (IntegratingResourceIsFirstOfIterator)findAncestorWithClass(this, IntegratingResourceIsFirstOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

