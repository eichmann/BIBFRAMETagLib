package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicContinuesUnderNewTitleIterator theNotatedMusicContinuesUnderNewTitleIterator = (NotatedMusicContinuesUnderNewTitleIterator)findAncestorWithClass(this, NotatedMusicContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theNotatedMusicContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

