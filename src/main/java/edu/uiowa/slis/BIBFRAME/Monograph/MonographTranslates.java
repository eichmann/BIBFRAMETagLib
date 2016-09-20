package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographTranslatesIterator theMonographTranslatesIterator = (MonographTranslatesIterator)findAncestorWithClass(this, MonographTranslatesIterator.class);
			pageContext.getOut().print(theMonographTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for translates tag ");
		}
		return SKIP_BODY;
	}
}

