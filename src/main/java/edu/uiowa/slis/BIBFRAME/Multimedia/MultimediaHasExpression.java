package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasExpressionIterator theMultimediaHasExpressionIterator = (MultimediaHasExpressionIterator)findAncestorWithClass(this, MultimediaHasExpressionIterator.class);
			pageContext.getOut().print(theMultimediaHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

