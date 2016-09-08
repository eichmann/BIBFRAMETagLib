package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsFirstOfIterator theNotatedMusicIsFirstOfIterator = (NotatedMusicIsFirstOfIterator)findAncestorWithClass(this, NotatedMusicIsFirstOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

