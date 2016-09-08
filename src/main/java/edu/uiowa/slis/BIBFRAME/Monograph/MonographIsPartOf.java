package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsPartOfIterator theMonographIsPartOfIterator = (MonographIsPartOfIterator)findAncestorWithClass(this, MonographIsPartOfIterator.class);
			pageContext.getOut().print(theMonographIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

