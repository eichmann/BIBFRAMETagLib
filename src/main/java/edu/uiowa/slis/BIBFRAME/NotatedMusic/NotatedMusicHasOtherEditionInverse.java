package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasOtherEditionInverseIterator theNotatedMusicHasOtherEditionInverseIterator = (NotatedMusicHasOtherEditionInverseIterator)findAncestorWithClass(this, NotatedMusicHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

