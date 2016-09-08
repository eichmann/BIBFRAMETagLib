package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsPartOfIterator theNotatedMusicIsPartOfIterator = (NotatedMusicIsPartOfIterator)findAncestorWithClass(this, NotatedMusicIsPartOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

