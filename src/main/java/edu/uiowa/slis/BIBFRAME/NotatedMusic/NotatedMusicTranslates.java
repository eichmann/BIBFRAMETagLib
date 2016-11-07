package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicTranslatesIterator theNotatedMusicTranslatesIterator = (NotatedMusicTranslatesIterator)findAncestorWithClass(this, NotatedMusicTranslatesIterator.class);
			pageContext.getOut().print(theNotatedMusicTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for translates tag ");
		}
		return SKIP_BODY;
	}
}
