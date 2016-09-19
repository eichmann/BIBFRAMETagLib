package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicDerivedFromIterator theNotatedMusicDerivedFromIterator = (NotatedMusicDerivedFromIterator)findAncestorWithClass(this, NotatedMusicDerivedFromIterator.class);
			pageContext.getOut().print(theNotatedMusicDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

