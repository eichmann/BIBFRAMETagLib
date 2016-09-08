package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicTranslatesIterator theNotatedMusicTranslatesIterator = (NotatedMusicTranslatesIterator)findAncestorWithClass(this, NotatedMusicTranslatesIterator.class);
			pageContext.getOut().print(theNotatedMusicTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for translates tag ");
		}
		return SKIP_BODY;
	}
}

