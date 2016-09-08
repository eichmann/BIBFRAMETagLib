package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsExpressionOfIterator theMultimediaIsExpressionOfIterator = (MultimediaIsExpressionOfIterator)findAncestorWithClass(this, MultimediaIsExpressionOfIterator.class);
			pageContext.getOut().print(theMultimediaIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

