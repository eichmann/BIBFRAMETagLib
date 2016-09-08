package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsFirstOfIterator theMultimediaIsFirstOfIterator = (MultimediaIsFirstOfIterator)findAncestorWithClass(this, MultimediaIsFirstOfIterator.class);
			pageContext.getOut().print(theMultimediaIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

