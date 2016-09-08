package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSeparatedIntoIterator theNotatedMusicSeparatedIntoIterator = (NotatedMusicSeparatedIntoIterator)findAncestorWithClass(this, NotatedMusicSeparatedIntoIterator.class);
			pageContext.getOut().print(theNotatedMusicSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

