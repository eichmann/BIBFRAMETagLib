package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographTranslatedAsIterator theMonographTranslatedAsIterator = (MonographTranslatedAsIterator)findAncestorWithClass(this, MonographTranslatedAsIterator.class);
			pageContext.getOut().print(theMonographTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

