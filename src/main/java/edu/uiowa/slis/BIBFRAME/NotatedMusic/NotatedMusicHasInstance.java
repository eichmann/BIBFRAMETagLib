package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasInstanceIterator theNotatedMusicHasInstanceIterator = (NotatedMusicHasInstanceIterator)findAncestorWithClass(this, NotatedMusicHasInstanceIterator.class);
			pageContext.getOut().print(theNotatedMusicHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

