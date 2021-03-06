package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsPartOfIterator theIntegratingResourceIsPartOfIterator = (IntegratingResourceIsPartOfIterator)findAncestorWithClass(this, IntegratingResourceIsPartOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

