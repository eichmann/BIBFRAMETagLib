package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicLanguageIterator theNotatedMusicLanguageIterator = (NotatedMusicLanguageIterator)findAncestorWithClass(this, NotatedMusicLanguageIterator.class);
			pageContext.getOut().print(theNotatedMusicLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for language tag ");
		}
		return SKIP_BODY;
	}
}

