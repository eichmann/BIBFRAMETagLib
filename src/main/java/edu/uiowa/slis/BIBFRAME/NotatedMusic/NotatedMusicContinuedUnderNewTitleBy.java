package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicContinuedUnderNewTitleByIterator theNotatedMusicContinuedUnderNewTitleByIterator = (NotatedMusicContinuedUnderNewTitleByIterator)findAncestorWithClass(this, NotatedMusicContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theNotatedMusicContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

