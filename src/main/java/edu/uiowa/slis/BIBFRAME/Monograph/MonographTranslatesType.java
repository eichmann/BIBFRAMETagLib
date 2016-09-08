package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographTranslatesIterator theMonographTranslatesIterator = (MonographTranslatesIterator)findAncestorWithClass(this, MonographTranslatesIterator.class);
			pageContext.getOut().print(theMonographTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for translates tag ");
		}
		return SKIP_BODY;
	}
}

