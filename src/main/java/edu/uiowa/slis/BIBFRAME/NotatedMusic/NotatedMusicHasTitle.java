package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasTitleIterator theNotatedMusicHasTitleIterator = (NotatedMusicHasTitleIterator)findAncestorWithClass(this, NotatedMusicHasTitleIterator.class);
			pageContext.getOut().print(theNotatedMusicHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

