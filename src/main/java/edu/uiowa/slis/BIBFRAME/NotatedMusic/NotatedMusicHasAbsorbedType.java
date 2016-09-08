package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasAbsorbedIterator theNotatedMusicHasAbsorbedIterator = (NotatedMusicHasAbsorbedIterator)findAncestorWithClass(this, NotatedMusicHasAbsorbedIterator.class);
			pageContext.getOut().print(theNotatedMusicHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

