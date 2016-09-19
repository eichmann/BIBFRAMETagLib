package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsSubjectOfIterator theNotatedMusicIsSubjectOfIterator = (NotatedMusicIsSubjectOfIterator)findAncestorWithClass(this, NotatedMusicIsSubjectOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

