package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasOtherEditionIterator theNotatedMusicHasOtherEditionIterator = (NotatedMusicHasOtherEditionIterator)findAncestorWithClass(this, NotatedMusicHasOtherEditionIterator.class);
			pageContext.getOut().print(theNotatedMusicHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

