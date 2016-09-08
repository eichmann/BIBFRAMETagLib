package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSupersedesIterator theNotatedMusicSupersedesIterator = (NotatedMusicSupersedesIterator)findAncestorWithClass(this, NotatedMusicSupersedesIterator.class);
			pageContext.getOut().print(theNotatedMusicSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

