package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasPartIterator theNotatedMusicHasPartIterator = (NotatedMusicHasPartIterator)findAncestorWithClass(this, NotatedMusicHasPartIterator.class);
			pageContext.getOut().print(theNotatedMusicHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

