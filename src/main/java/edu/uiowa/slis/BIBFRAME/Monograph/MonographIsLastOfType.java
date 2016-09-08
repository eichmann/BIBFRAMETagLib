package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsLastOfIterator theMonographIsLastOfIterator = (MonographIsLastOfIterator)findAncestorWithClass(this, MonographIsLastOfIterator.class);
			pageContext.getOut().print(theMonographIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

