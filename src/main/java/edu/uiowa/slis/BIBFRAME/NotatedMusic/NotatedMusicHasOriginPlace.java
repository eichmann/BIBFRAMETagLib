package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasOriginPlaceIterator theNotatedMusicHasOriginPlaceIterator = (NotatedMusicHasOriginPlaceIterator)findAncestorWithClass(this, NotatedMusicHasOriginPlaceIterator.class);
			pageContext.getOut().print(theNotatedMusicHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

