package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationContinuedUnderNewTitleByIterator theDissertationContinuedUnderNewTitleByIterator = (DissertationContinuedUnderNewTitleByIterator)findAncestorWithClass(this, DissertationContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theDissertationContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

