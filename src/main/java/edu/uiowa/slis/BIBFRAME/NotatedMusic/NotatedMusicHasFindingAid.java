package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasFindingAidIterator theNotatedMusicHasFindingAidIterator = (NotatedMusicHasFindingAidIterator)findAncestorWithClass(this, NotatedMusicHasFindingAidIterator.class);
			pageContext.getOut().print(theNotatedMusicHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

