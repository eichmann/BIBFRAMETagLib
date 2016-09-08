package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasSupplementIterator theMultimediaHasSupplementIterator = (MultimediaHasSupplementIterator)findAncestorWithClass(this, MultimediaHasSupplementIterator.class);
			pageContext.getOut().print(theMultimediaHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

