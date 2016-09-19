package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicReceivedIterator theNotatedMusicReceivedIterator = (NotatedMusicReceivedIterator)findAncestorWithClass(this, NotatedMusicReceivedIterator.class);
			pageContext.getOut().print(theNotatedMusicReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for received tag ");
		}
		return SKIP_BODY;
	}
}

