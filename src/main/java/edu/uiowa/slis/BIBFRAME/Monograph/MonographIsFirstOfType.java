package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsFirstOfIterator theMonographIsFirstOfIterator = (MonographIsFirstOfIterator)findAncestorWithClass(this, MonographIsFirstOfIterator.class);
			pageContext.getOut().print(theMonographIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

