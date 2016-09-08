package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSupersededByIterator theNotatedMusicSupersededByIterator = (NotatedMusicSupersededByIterator)findAncestorWithClass(this, NotatedMusicSupersededByIterator.class);
			pageContext.getOut().print(theNotatedMusicSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

