package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsPartOfIterator theMonographIsPartOfIterator = (MonographIsPartOfIterator)findAncestorWithClass(this, MonographIsPartOfIterator.class);
			pageContext.getOut().print(theMonographIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

