package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasExpressionIterator theIntegratingResourceHasExpressionIterator = (IntegratingResourceHasExpressionIterator)findAncestorWithClass(this, IntegratingResourceHasExpressionIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

