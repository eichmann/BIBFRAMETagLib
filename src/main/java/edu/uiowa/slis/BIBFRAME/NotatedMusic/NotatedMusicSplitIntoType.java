package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSplitIntoIterator theNotatedMusicSplitIntoIterator = (NotatedMusicSplitIntoIterator)findAncestorWithClass(this, NotatedMusicSplitIntoIterator.class);
			pageContext.getOut().print(theNotatedMusicSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

