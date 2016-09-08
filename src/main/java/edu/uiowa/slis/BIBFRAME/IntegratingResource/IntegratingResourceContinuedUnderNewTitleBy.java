package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceContinuedUnderNewTitleByIterator theIntegratingResourceContinuedUnderNewTitleByIterator = (IntegratingResourceContinuedUnderNewTitleByIterator)findAncestorWithClass(this, IntegratingResourceContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theIntegratingResourceContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

