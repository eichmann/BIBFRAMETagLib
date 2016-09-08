package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsExpressionOfIterator theNotatedMusicIsExpressionOfIterator = (NotatedMusicIsExpressionOfIterator)findAncestorWithClass(this, NotatedMusicIsExpressionOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

