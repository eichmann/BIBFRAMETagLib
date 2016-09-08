package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsLastOfIterator theIntegratingResourceIsLastOfIterator = (IntegratingResourceIsLastOfIterator)findAncestorWithClass(this, IntegratingResourceIsLastOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

