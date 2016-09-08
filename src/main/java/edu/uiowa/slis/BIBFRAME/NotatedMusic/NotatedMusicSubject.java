package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (NotatedMusicSubjectIterator)findAncestorWithClass(this, NotatedMusicSubjectIterator.class);
			pageContext.getOut().print(theNotatedMusicSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for subject tag ");
		}
		return SKIP_BODY;
	}
}

