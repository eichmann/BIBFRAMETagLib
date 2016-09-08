package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSupplementsIterator theNotatedMusicSupplementsIterator = (NotatedMusicSupplementsIterator)findAncestorWithClass(this, NotatedMusicSupplementsIterator.class);
			pageContext.getOut().print(theNotatedMusicSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for supplements tag ");
		}
		return SKIP_BODY;
	}
}

