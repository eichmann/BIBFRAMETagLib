package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceTranslatesIterator theIntegratingResourceTranslatesIterator = (IntegratingResourceTranslatesIterator)findAncestorWithClass(this, IntegratingResourceTranslatesIterator.class);
			pageContext.getOut().print(theIntegratingResourceTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for translates tag ");
		}
		return SKIP_BODY;
	}
}

