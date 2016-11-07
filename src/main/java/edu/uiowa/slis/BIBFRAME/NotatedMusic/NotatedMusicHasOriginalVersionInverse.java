package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasOriginalVersionInverseIterator theNotatedMusicHasOriginalVersionInverseIterator = (NotatedMusicHasOriginalVersionInverseIterator)findAncestorWithClass(this, NotatedMusicHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}
