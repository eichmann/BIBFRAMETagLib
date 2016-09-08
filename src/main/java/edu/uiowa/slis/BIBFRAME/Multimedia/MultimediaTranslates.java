package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaTranslatesIterator theMultimediaTranslatesIterator = (MultimediaTranslatesIterator)findAncestorWithClass(this, MultimediaTranslatesIterator.class);
			pageContext.getOut().print(theMultimediaTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for translates tag ");
		}
		return SKIP_BODY;
	}
}

