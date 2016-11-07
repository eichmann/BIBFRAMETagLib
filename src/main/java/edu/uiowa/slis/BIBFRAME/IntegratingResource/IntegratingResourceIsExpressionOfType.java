package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsExpressionOfIterator theIntegratingResourceIsExpressionOfIterator = (IntegratingResourceIsExpressionOfIterator)findAncestorWithClass(this, IntegratingResourceIsExpressionOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}
