package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsLastOfIterator theMonographIsLastOfIterator = (MonographIsLastOfIterator)findAncestorWithClass(this, MonographIsLastOfIterator.class);
			pageContext.getOut().print(theMonographIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

