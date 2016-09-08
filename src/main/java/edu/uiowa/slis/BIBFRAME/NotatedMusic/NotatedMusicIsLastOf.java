package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsLastOfIterator theNotatedMusicIsLastOfIterator = (NotatedMusicIsLastOfIterator)findAncestorWithClass(this, NotatedMusicIsLastOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

