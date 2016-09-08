package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsFindingAidForIterator theNotatedMusicIsFindingAidForIterator = (NotatedMusicIsFindingAidForIterator)findAncestorWithClass(this, NotatedMusicIsFindingAidForIterator.class);
			pageContext.getOut().print(theNotatedMusicIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

