package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationContinuesUnderNewTitleIterator theDissertationContinuesUnderNewTitleIterator = (DissertationContinuesUnderNewTitleIterator)findAncestorWithClass(this, DissertationContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theDissertationContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

