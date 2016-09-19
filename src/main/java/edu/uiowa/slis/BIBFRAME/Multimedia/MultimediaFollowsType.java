package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaFollowsIterator theMultimediaFollowsIterator = (MultimediaFollowsIterator)findAncestorWithClass(this, MultimediaFollowsIterator.class);
			pageContext.getOut().print(theMultimediaFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for follows tag ");
		}
		return SKIP_BODY;
	}
}

