package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsExpressionOfIterator theDissertationIsExpressionOfIterator = (DissertationIsExpressionOfIterator)findAncestorWithClass(this, DissertationIsExpressionOfIterator.class);
			pageContext.getOut().print(theDissertationIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

