package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsFirstOfIterator theNotatedMusicIsFirstOfIterator = (NotatedMusicIsFirstOfIterator)findAncestorWithClass(this, NotatedMusicIsFirstOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

