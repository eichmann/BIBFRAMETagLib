package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasPreferredTitleIterator theNotatedMusicHasPreferredTitleIterator = (NotatedMusicHasPreferredTitleIterator)findAncestorWithClass(this, NotatedMusicHasPreferredTitleIterator.class);
			pageContext.getOut().print(theNotatedMusicHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

