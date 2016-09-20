package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographTranslatedAsIterator theMonographTranslatedAsIterator = (MonographTranslatedAsIterator)findAncestorWithClass(this, MonographTranslatedAsIterator.class);
			pageContext.getOut().print(theMonographTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

