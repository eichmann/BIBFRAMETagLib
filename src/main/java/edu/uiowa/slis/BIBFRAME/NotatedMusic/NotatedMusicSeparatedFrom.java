package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSeparatedFromIterator theNotatedMusicSeparatedFromIterator = (NotatedMusicSeparatedFromIterator)findAncestorWithClass(this, NotatedMusicSeparatedFromIterator.class);
			pageContext.getOut().print(theNotatedMusicSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

