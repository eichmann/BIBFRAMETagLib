package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIdentifiedByIterator theNotatedMusicIdentifiedByIterator = (NotatedMusicIdentifiedByIterator)findAncestorWithClass(this, NotatedMusicIdentifiedByIterator.class);
			pageContext.getOut().print(theNotatedMusicIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

