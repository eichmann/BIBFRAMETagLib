package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceContinuesUnderNewTitleIterator theIntegratingResourceContinuesUnderNewTitleIterator = (IntegratingResourceContinuesUnderNewTitleIterator)findAncestorWithClass(this, IntegratingResourceContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theIntegratingResourceContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

