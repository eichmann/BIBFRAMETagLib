package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasSupplementIterator theNotatedMusicHasSupplementIterator = (NotatedMusicHasSupplementIterator)findAncestorWithClass(this, NotatedMusicHasSupplementIterator.class);
			pageContext.getOut().print(theNotatedMusicHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

