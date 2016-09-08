package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicAbsorbedByIterator theNotatedMusicAbsorbedByIterator = (NotatedMusicAbsorbedByIterator)findAncestorWithClass(this, NotatedMusicAbsorbedByIterator.class);
			pageContext.getOut().print(theNotatedMusicAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

