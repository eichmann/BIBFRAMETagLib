package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasOriginPlaceIterator theNotatedMusicHasOriginPlaceIterator = (NotatedMusicHasOriginPlaceIterator)findAncestorWithClass(this, NotatedMusicHasOriginPlaceIterator.class);
			pageContext.getOut().print(theNotatedMusicHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

