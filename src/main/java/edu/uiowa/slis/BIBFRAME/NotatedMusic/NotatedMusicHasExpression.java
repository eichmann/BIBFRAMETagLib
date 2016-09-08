package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasExpressionIterator theNotatedMusicHasExpressionIterator = (NotatedMusicHasExpressionIterator)findAncestorWithClass(this, NotatedMusicHasExpressionIterator.class);
			pageContext.getOut().print(theNotatedMusicHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

