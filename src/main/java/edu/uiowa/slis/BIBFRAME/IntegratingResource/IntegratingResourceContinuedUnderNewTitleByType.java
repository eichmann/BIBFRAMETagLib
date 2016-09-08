package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceContinuedUnderNewTitleByIterator theIntegratingResourceContinuedUnderNewTitleByIterator = (IntegratingResourceContinuedUnderNewTitleByIterator)findAncestorWithClass(this, IntegratingResourceContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theIntegratingResourceContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

