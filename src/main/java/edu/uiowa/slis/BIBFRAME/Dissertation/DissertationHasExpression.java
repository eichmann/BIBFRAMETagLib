package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasExpressionIterator theDissertationHasExpressionIterator = (DissertationHasExpressionIterator)findAncestorWithClass(this, DissertationHasExpressionIterator.class);
			pageContext.getOut().print(theDissertationHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

