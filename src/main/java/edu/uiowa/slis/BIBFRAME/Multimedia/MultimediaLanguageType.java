package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaLanguageIterator theMultimediaLanguageIterator = (MultimediaLanguageIterator)findAncestorWithClass(this, MultimediaLanguageIterator.class);
			pageContext.getOut().print(theMultimediaLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for language tag ");
		}
		return SKIP_BODY;
	}
}

