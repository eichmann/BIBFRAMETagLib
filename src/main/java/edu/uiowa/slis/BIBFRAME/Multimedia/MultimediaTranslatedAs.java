package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaTranslatedAsIterator theMultimediaTranslatedAsIterator = (MultimediaTranslatedAsIterator)findAncestorWithClass(this, MultimediaTranslatedAsIterator.class);
			pageContext.getOut().print(theMultimediaTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

