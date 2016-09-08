package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasExpressionIterator theDissertationHasExpressionIterator = (DissertationHasExpressionIterator)findAncestorWithClass(this, DissertationHasExpressionIterator.class);
			pageContext.getOut().print(theDissertationHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

