package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicTranslatedAsIterator theNotatedMusicTranslatedAsIterator = (NotatedMusicTranslatedAsIterator)findAncestorWithClass(this, NotatedMusicTranslatedAsIterator.class);
			pageContext.getOut().print(theNotatedMusicTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

