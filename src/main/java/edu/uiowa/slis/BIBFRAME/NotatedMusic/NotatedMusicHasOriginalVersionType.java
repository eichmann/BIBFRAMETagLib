package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasOriginalVersionIterator theNotatedMusicHasOriginalVersionIterator = (NotatedMusicHasOriginalVersionIterator)findAncestorWithClass(this, NotatedMusicHasOriginalVersionIterator.class);
			pageContext.getOut().print(theNotatedMusicHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

