package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicIsUnionOfIterator theNotatedMusicIsUnionOfIterator = (NotatedMusicIsUnionOfIterator)findAncestorWithClass(this, NotatedMusicIsUnionOfIterator.class);
			pageContext.getOut().print(theNotatedMusicIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

