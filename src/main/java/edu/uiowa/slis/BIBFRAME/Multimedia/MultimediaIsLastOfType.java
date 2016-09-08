package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsLastOfIterator theMultimediaIsLastOfIterator = (MultimediaIsLastOfIterator)findAncestorWithClass(this, MultimediaIsLastOfIterator.class);
			pageContext.getOut().print(theMultimediaIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

