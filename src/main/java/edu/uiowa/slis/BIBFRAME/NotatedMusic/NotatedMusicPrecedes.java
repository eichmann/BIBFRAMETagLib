package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicPrecedesIterator theNotatedMusicPrecedesIterator = (NotatedMusicPrecedesIterator)findAncestorWithClass(this, NotatedMusicPrecedesIterator.class);
			pageContext.getOut().print(theNotatedMusicPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for precedes tag ");
		}
		return SKIP_BODY;
	}
}

